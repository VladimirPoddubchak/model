import lombok.*;

import javax.persistence.*;
import java.util.Set;

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
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String login;
    String hashPassword;
    Set<MyRole> roles;
}
