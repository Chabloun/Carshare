/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karray
 */
public class MyConnection {

     private static final  String driver = "com.mysql.jdbc.Driver";
   private static final  String url = "jdbc:mysql://localhost:3306/carshare";
   private static final  String login = "root";
   private static final  String pwd = "";
   private static Connection con;


   private MyConnection(){

   }

   public Connection establishConnection(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,login,pwd);
            System.out.println("Connexion established");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error loading driver"+ex.getMessage());
        } catch (SQLException ex){
            System.out.println("Establishment of connection problem"+ex.getMessage());
        }

        return con;
    }
   public static Connection getInstance(){
       if (con==null){
           new MyConnection().establishConnection();
       }
   return con;
   }
}
