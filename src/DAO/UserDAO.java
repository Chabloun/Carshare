/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

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
 * @author Karray
 */
public class UserDAO {

     public void insertUser(User d){
        String requete = "insert into user (Login,Password,LastName,FirstName,Sexe,Address,Email,DateB,City,Img,Rank,DateI,Blocked) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getLogin());
            ps.setString(2, d.getPassword());
            ps.setString(3, d.getLastName());
            ps.setString(4, d.getFirstName());
            ps.setString(5, d.getSexe());
            ps.setString(6, d.getAddress());
            ps.setString(7, d.getEmail());
            ps.setDate(8, d.getDateB());
            ps.setString(9, d.getCity());
            ps.setString(10, d.getImg());
            ps.setInt(11,d.getRank());
            ps.setDate(12, d.getDateI());
            ps.setBoolean(13,d.getBlocked());
            ps.executeUpdate();
            System.out.println("User added successfully");
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    }


    public void updateUser(User d){
        String requete = "update User set Login=?,Password=?,LastName=?,FirstName=?,Sexe=?,Address=?,Email=?,DateB=?,City=?,Img=?,Rank=?,DateI=?,Blocked=? where Login=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getLogin());
            ps.setString(2, d.getPassword());
            ps.setString(3, d.getLastName());
            ps.setString(4, d.getFirstName());
            ps.setString(5, d.getSexe());
            ps.setString(6, d.getAddress());
            ps.setString(7, d.getEmail());
            ps.setDate(8, d.getDateB());
            ps.setString(9, d.getCity());
            ps.setString(10, d.getImg());
            ps.setInt(11,d.getRank());
            ps.setDate(12, d.getDateI());
            ps.setBoolean(13,d.getBlocked());
            ps.setString(14, d.getLogin());
            ps.executeUpdate();
            System.out.println("User updated successfully");
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    }

   public void deleteUser(String login){
        String requete = "delete from User where Login=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.executeUpdate();
            System.out.println("User deleted successfully");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
        }
    }


    public User findUserByLogin(String login){
    User user = new User();
     String requete = "select * from User where Login=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                user.setId(resultat.getInt(1));
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
    
    public boolean Authentification(String login,String pwd){
        String requete = "select * from user where Login=? and Password=?";
        try 
        {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);
            ps.setString(2,pwd);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next())
            {
               System.out.println("returned true");
               return true;
            } else {
                System.out.println("returned false");
                return false;
            }
        }catch(SQLException ex) {
            System.out.println("Exception : "+ex.getMessage());        
        }
        return false;
    }

    public List<User> DisplayAllUsers (){


        List<User> listeUsers = new ArrayList<>();

        String requete = "select * from User";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                User user =new User();
                user.setId(resultat.getInt(1));
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

                listeUsers.add(user);
            }
            return listeUsers;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
            return null;
        }
    }

}
