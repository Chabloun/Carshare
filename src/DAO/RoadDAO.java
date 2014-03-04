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
import java.sql.Date;
/**
 *
 * @author omar
 */
public class RoadDAO {
     public void AddRoad(Road r){

        String requete = "insert into road (Driver,Price,Seat,CityD,CityR,Round,DateD,DateR,HourD,HourR,Car) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getDriver());
            ps.setFloat(2,r.getPrice());
            ps.setInt(3,r.getSeat());
            ps.setString(4,r.getCityD());
            ps.setString(5,r.getCityR());
            ps.setInt(6,r.getRound());
            ps.setDate(7,r.getDateD());
            ps.setDate(8,r.getDateR());
            ps.setString(9,r.getHourD());
            ps.setString(10,r.getHourR());
            ps.setString(11,r.getCar());
            
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
            ps.setDate(8,r.getDateD());
            ps.setDate(9,r.getDateR());
            ps.setString(10,r.getHourD());
            ps.setString(11,r.getHourR());
            ps.setString(12,r.getCar());
            
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
                road.setDateD(resultat.getDate(8));
                road.setDateR(resultat.getDate(9));
                road.setHourD(resultat.getString(10));
                road.setHourR(resultat.getString(11));
                road.setCar(resultat.getString(12));
                RoadList.add(road);
            }
            return RoadList;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : "+ex.getMessage());
            return null;
        }
    }
       
       
       public List<Road> RechercherRoad(String depart , String arrive){
          
           Road R = new Road();
           List<Road> list = new ArrayList<>();

            try {
                
                    String req = "select * from road where CityD="+depart+" and CityR="+arrive+"" ;
                    Statement statement = MyConnection.getInstance().createStatement();
                    ResultSet resultat = statement.executeQuery(req);
                    
                    
                    while(resultat.next())
                    {
                        R.setId(resultat.getInt(1));
                        R.setDriver(resultat.getString(2));
                        R.setPrice(resultat.getFloat(3));
                        R.setSeat(resultat.getInt(4));
                        R.setCityD(resultat.getString(5));
                        R.setCityR(resultat.getString(6));
                        R.setDateD(resultat.getDate(7));
                        R.setDateR(resultat.getDate(8));
                        R.setHourD(resultat.getString(9));
                        R.setHourR(resultat.getString(10));
                        R.setCar(resultat.getString(11));
                        
                        list.add(R);
                    }
            } catch (SQLException ex) {
                System.out.println("Error : "+ex.getMessage());
            }
        return list;
            
        
           
       }
       
}
