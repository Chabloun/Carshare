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

        String requete = "insert into Road (Driver,LongD,LatD,LongR,LatR) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setfloat(1, r.getDriver());
            ps.setfloat(2, r.getLongD());
            ps.setfloat(3, r.getLatD());
            ps.setfloat(4, r.getLongR());
            ps.setfloat(5, r.getLatR());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
}
