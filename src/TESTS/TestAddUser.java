/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TESTS;
import java.sql.Date;
import DAO.UserDAO;
import ENTITIES.User;

/**
 *
 * @author Karray
 */
public class TestAddUser {


    public static void main(String[] args) {
        User user = new User();
        UserDAO userDAO = new UserDAO();
        user.setLogin("yahiaafbi");
        user.setPassword("yaya");
        user.setLastName("mgarrech");
        user.setFirstName("yahia");
        user.setAddress("reazieau");
        user.setEmail("dqsdq@dsfdsf.com");
        Date d = new Date(1992, 1, 1);
        user.setDateB(d);
        user.setCity("sqdqsdsqdqs");
        user.setRank(0);
        userDAO.insertUser(user);
    }
}
