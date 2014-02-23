/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import ENTITIES.Message;
import UTIL.MyConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Becem
 */
public class MessageDAO {
        public void SendMessage(Message m){

        String requete = "insert into message (From,To,Object,Content) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(2, m.getTo());
            ps.setString(1, m.getFrom());
            ps.setString(3, m.getObject());
            ps.setString(1, m.getContent());
            ps.executeUpdate();
            System.out.println("Message envoyé avec succée ");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
    }
       public void DeleteMessage(int id){
        String requete = "delete from message where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Message supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    } 
       
        public List<Message> DisplayAllMessages (){


        List<Message> listemsg = new ArrayList<Message>();

        String requete = "select * from message";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Message msg =new Message();
                msg.setId_message(resultat.getInt(1));
                msg.setFrom(resultat.getString(2));
                msg.setTo(resultat.getString(3));
                msg.setObject(resultat.getString(4));
                msg.setContent(resultat.getString(5));

                listemsg.add(msg);
            }
            return listemsg;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }


    
}
