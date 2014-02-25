/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import UTIL.MyConnection;
import ENTITIES.Road;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omar
 */
public class RoadDAO {
     public void AddRoad(Road r){

        String requete = "insert into road (Driver,Price,Seat,CityD,CityR,Round) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getDriver());
            ps.setFloat(2,r.getPrice());
            ps.setInt(3,r.getSeat());
            ps.setString(4,r.getCityD());
            ps.setString(5,r.getCityR());
            ps.setInt(6,r.getRound());
         
            ps.executeUpdate();
            System.out.println("Successfully added");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("insertion error "+ex.getMessage());
        }
     }
     
        public void RemoveRoad(String Driver){
        String requete = "delete from road where Driver=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, Driver);
            ps.executeUpdate();
            System.out.println("Road deleted successfully");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
        }
    }
         public void updateRoad(Road r){
        String requete = "update road set  Driver=?,Price=?,Seat=?,CityD=?,CityR=? ,Round=? where Id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getDriver());
            ps.setFloat(2, r.getPrice());
            ps.setInt(3, r.getSeat());
            ps.setString(4, r.getCityD());
            ps.setString(5, r.getCityR());
            ps.setInt(6, r.getRound());
            ps.setInt(7, r.getId());

            
            ps.executeUpdate();
            System.out.println("Road updated successfully");
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    }
    
     
       public List<Road> DisplayAllRoad (){


        List<Road> RoadList = new ArrayList<>();

        String requete = "select * from road";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Road road =new Road();
                
                road.setId(resultat.getInt(1));
                road.setDriver(resultat.getString(2));
                road.setPrice(resultat.getFloat(3));
                road.setSeat(resultat.getInt(4));
                road.setCityD(resultat.getString(5));
                road.setCityR(resultat.getString(6));
                road.setRound(resultat.getInt(7));
                
                RoadList.add(road);
            }
            return RoadList;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
            return null;
        }
    }
}