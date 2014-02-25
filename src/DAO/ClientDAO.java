/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import ENTITIES.Client;
import UTIL.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rissen
 */
public class ClientDAO {
    public void insertClient(Client c){
        String requete = "insert into client (Login,Password,LastName,FirstName,Sexe,Address,Email,DateB,City,Rank) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getLogin());
            ps.setString(2, c.getPassword());
            ps.setString(3, c.getLastName());
            ps.setString(4, c.getFirstName());
            ps.setString(5, c.getSexe());
            ps.setString(6, c.getAddress());
            ps.setString(7, c.getEmail());
            ps.setDate(8,   c.getDateB());
            ps.setString(9, c.getCity());
            ps.setInt(10,    c.getRank());
            ps.executeUpdate();
            System.out.println("Client Ajoutée avec succés ");
        } catch (SQLException ex) {
            System.out.println("Erreur : "+ex.getMessage());
        }
    }
    
    public void updateClient(Client c){
        String requete = "update client set Login=?,Password=?,LastName=?,FirstName=?,Sexe=?,Address=?,Email=?,DateB=?,City=?,Rank=? where Id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getLogin());
            ps.setString(2, c.getPassword());
            ps.setString(3, c.getLastName());
            ps.setString(4, c.getFirstName());
            ps.setString(5, c.getSexe());
            ps.setString(6, c.getAddress());
            ps.setString(7, c.getEmail());
            ps.setDate(8,   c.getDateB());
            ps.setString(9, c.getCity());
            ps.setInt(10,    c.getRank());
            ps.setInt(11,   c.getId());
            ps.executeUpdate();
            System.out.println("Client mis a joeur");
        } catch (SQLException ex) {
            System.out.println("Erreur : "+ex.getMessage());
        }
    }

   public void deleteClient(String login){
        String requete = "delete from client where Login=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur : "+ex.getMessage());
        }
    }


    public Client findClientByLogin(String login){
    Client client = new Client();
     String requete = "select * from client where Login=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setId(resultat.getInt(1));
                client.setLogin(resultat.getString(2));
                client.setPassword(resultat.getString(3));
                client.setLastName(resultat.getString(4));
                client.setFirstName(resultat.getString(5));
                client.setSexe(resultat.getString(6));
                client.setAddress(resultat.getString(7));
                client.setEmail(resultat.getString(8));
                client.setDateB(resultat.getDate(9));
                client.setCity(resultat.getString(10));
                client.setRank(resultat.getInt(11));
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors du chargement : "+ex.getMessage());
            return null;
        }
    }

    public List<Client> DisplayAllClient (){


        List<Client> listeClients = new ArrayList<>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
                client.setId(resultat.getInt(1));
                client.setLogin(resultat.getString(2));
                client.setPassword(resultat.getString(3));
                client.setLastName(resultat.getString(4));
                client.setFirstName(resultat.getString(5));
                client.setSexe(resultat.getString(6));
                client.setAddress(resultat.getString(7));
                client.setEmail(resultat.getString(8));
                client.setDateB(resultat.getDate(9));
                client.setCity(resultat.getString(10));
                client.setRank(resultat.getInt(11));

                listeClients.add(client);
            }
            return listeClients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur : "+ex.getMessage());
            return null;
        }
    }







}
