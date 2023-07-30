/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;



/**
 *
 * @author ilham
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    private static Connection connection;

    public static Connection openConnection() {
        Connection cn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/java_crud", "root", "");
            return cn;
        } catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }
    }
}
