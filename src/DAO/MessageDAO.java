/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import ENTITIES.Message;
import ENTITIES.User;

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
        
    
    public void Reply(String R, String S)
    {
        String requete;
            requete = "insert into message(Sender,Reciever,Object,Content) values("+R+","+S+",?,?)";
        
    }
    public void SendMessage(Message m){

        String requete;
            requete = "insert into message(Sender,Reciever,Object,Content) values(?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, m.getFrom());
            ps.setString(2, m.getTo());
            ps.setString(3, m.getObject());
            ps.setString(4, m.getContent());
            
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
       
        public List<Message> DisplayAllMessagesRecieved (String R){


        List<Message> listemsg = new ArrayList<>();

        String requete = "select * from message where Reciever ='"+R+"'";
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
                //msg.setDate(resultat.getDate(6).toString());
                msg.setRead(resultat.getBoolean(7));
                System.out.println("+ "+resultat.getInt(7));
                listemsg.add(msg);
            }
            return listemsg;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("MessageDAO : erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
        
        
        public List<Message> DisplayAllMessagesSent (String S){


        List<Message> listemsg = new ArrayList<>();

        String requete = "select * from message where Sender ='"+S+"'";
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
                msg.setRead(resultat.getBoolean(6));

                listemsg.add(msg);
            }
            return listemsg;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
         public Message findUserByLogin(int id){
    Message Msg = new Message();
     String requete = "select * from Message where 'Id'=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                
                Msg.setId_message(resultat.getInt(1));
                Msg.setFrom(resultat.getString(2));
                Msg.setTo(resultat.getString(3));
               Msg.setObject(resultat.getString(4));
                Msg.setContent(resultat.getString(5));
                Msg.setRead(resultat.getBoolean(6));
            }
            return Msg;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
            return null;
        }
    }
         public int getUnreadedMessage(){
             int num=0;
             String requete = "select count(*) from message where `Read`=0 AND `Reciever`='Admin'";
             try {
             Statement statement = MyConnection.getInstance()
                   .createStatement();
            
            ResultSet resultat = statement.executeQuery(requete);
             while(resultat.next()){
                 System.out.println("here"); 
                num=resultat.getInt(1);              
             }
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
        }
             return num;
        }
   public Message ViewMessage (int id)
   {
       
        String requete = "select * from message where Id='"+id+"'";
        Message msg =new Message();
        try {
             Statement statement = MyConnection.getInstance()
                   .createStatement();
            
            ResultSet resultat = statement.executeQuery(requete);
             if(resultat.next()){
  
     
                msg.setId_message(resultat.getInt(1));
                msg.setFrom(resultat.getString(2));
                msg.setTo(resultat.getString(3));
                msg.setObject(resultat.getString(4));
                msg.setContent(resultat.getString(5));
                
             }
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
        }
                    System.out.println(msg.getFrom());  

            return msg;
   }

    
}
