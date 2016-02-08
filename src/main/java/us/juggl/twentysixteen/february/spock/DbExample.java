package us.juggl.twentysixteen.february.spock;

import javax.sql.DataSource;

/**
 *
 */
public class DbExample {

    private DataSource ds;

    public DbExample(DataSource ds) {
        this.ds = ds;
    }
}
