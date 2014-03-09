/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.UserDAO;
import ENTITIES.User;
import UTIL.MyConnection;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rissen
 */
public class ProfilClientCode {
    
    User user;
    public ProfilClientCode()
    {
        user =new User();
    }
   public User getUser(){
    String requete = "select * from User where login='a'";

        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
         //       user.setId(resultat.getInt(1));
                user.setLogin(resultat.getString(2));
                user.setPassword(resultat.getString(3));
                user.setLastName(resultat.getString(4));
                user.setFirstName(resultat.getString(5));
                user.setSexe(resultat.getString(6));
                user.setAddress(resultat.getString(7));
                user.setEmail(resultat.getString(8));
                user.setDateB(resultat.getDate(9));
                user.setCity(resultat.getString(10));
                user.setImg(resultat.getString(11));
                user.setRank(resultat.getInt(12));
                user.setDateI(resultat.getDate(13));
                user.setBlocked(resultat.getBoolean(14));
            }
            return user;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
            return null;
        }
    }
}
