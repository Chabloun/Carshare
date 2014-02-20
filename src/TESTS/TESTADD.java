/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TESTS;

import ENTITIES.RoadENTITIES;
import DAO.RoadDAO;

/**
 *²
 * @author omar
 */
public class TESTADD {
    public static void main(String[] args) {
    RoadENTITIES road = new RoadENTITIES();
    RoadDAO roadDAO = new RoadDAO();
    road.setDriver("ooooo");
    roadDAO.insertRoad(road);
    }
}
