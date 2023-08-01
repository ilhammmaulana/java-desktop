package connection;

/**
 *
 * @author ilham
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/java_crud", "root", "");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
