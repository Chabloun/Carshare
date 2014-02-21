/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TESTS;

import DAO.UserDAO;
import ENTITIES.User;

/**
 *
 * @author Karray
 */
public class TestUpdateUser {

    public static void main(String[] args) {

        User user = new User();
        UserDAO userDAO = new UserDAO();
        user = userDAO.findUserByLogin("yahiaafbi");
        user.setPassword("yaya1");
        userDAO.updateUser(user);

    }
}
