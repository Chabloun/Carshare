/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import UTIL.MyConnection;
import ENTITIES.RoadENTITIES;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author omar
 */
public class RoadDAO {
     public void insertRoad(RoadENTITIES r){

        String requete = "insert into road (Driver,Price) values (?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getDriver());
          /*  ps.setFloat(2, r.getLongD());
            ps.setFloat(3, r.getLatD());
            ps.setFloat(4, r.getLongR());
            ps.setFloat(5, r.getLatR()); */
            ps.setFloat(2,r.getPrice());
            ps.executeUpdate();
            System.out.println("Successfully added");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("insertion error "+ex.getMessage());
        }
    }
}
