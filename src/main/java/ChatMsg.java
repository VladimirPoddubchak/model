import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by @author Vladimir Poddubchak @date 09.10.2019.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class ChatMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    long fromUserId;
    long toUserId;
    String msg;
    boolean isPrivate;
    Date timeStamp;

}
