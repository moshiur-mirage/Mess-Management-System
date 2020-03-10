/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;

/**
 *
 * @author User
 */
public class DBConnection {

    static Connection con = null;

    public static Connection getDBConnection() {

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MessManagement", "root", "");
//            
        } catch (Exception e) {
            e.printStackTrace();
                  
        }
        return con;
    }
}
