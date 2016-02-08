package us.juggl.twentysixteen.february.spock.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by deven.phillips on 2/7/16.
 */
@Data
@Accessors(chain = true, fluent = true)
public class Customer {

    private long id;
    private String givenName;
    private String familyName;

    
}
