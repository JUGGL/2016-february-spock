package us.juggl.twentysixteen.february.spock

import spock.lang.Specification

import javax.sql.DataSource
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement


/**
 * Created by deven.phillips on 2/7/16.
 */
class DbExampleSpec extends Specification {

    DataSource ds;
    Connection conn;
    Statement s;
    ResultSet r;

    def setup() {
        ds = Mock(DataSource.class)
        conn = Mock(Connection.class)
        s = Mock(Statement.class)
        r = Mock(ResultSet.class)
    }

    def "Selecting a customer record by ID should only return a single record"() {
        def db = DbExample(ds);
        ds.getConnection(*_) >> conn;
        conn.prepareStatement(_) >> s;
        s.executeQuery(_) >> r;

    }
}