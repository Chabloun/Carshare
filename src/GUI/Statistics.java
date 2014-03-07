/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import UTIL.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yahia
 */
public class Statistics {
    int UsersNumber;
    int MessagesNumber;
    int RoadNumber;
    public Statistics(){
        UsersNumber=0;
        MessagesNumber=0;
        RoadNumber=0;
    }
    
    public int getUsersNumber(){
        int number=0;
        String requete= "select count(*) from user";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                number=resultat.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error in user statistics "+ex.getMessage());
        }
        return number;
    }
    
    public int getInboxNumber(){
        int number=0;
        String requete= "select count(*) from message";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                number=resultat.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error in message statistics "+ex.getMessage());
        }
        return number;
    }
    
    public int getRoadNumber(){
        int number=0;
        String requete= "select count(*) from road";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                number=resultat.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error in road statistics "+ex.getMessage());
        }
        return number;
    }
}
