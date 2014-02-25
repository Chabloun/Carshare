/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TESTS;

import DAO.ClientDAO;
import ENTITIES.Client;
import java.sql.Date;

/**
 *
 * @author Rissen
 */
public class TestAddClient {
     public static void main(String[] args) {
        Client client = new Client();
        ClientDAO cDAO = new ClientDAO();
        client.setLogin("Ryis");
        client.setPassword("mdr");
        client.setLastName("Ben AMor");
        client.setFirstName("Rissen");
        client.setAddress("xx");
        client.setEmail("xx@xx.com");
        Date d = new Date(1992, 12, 8);
        client.setDateB(d);
        client.setCity("La marsa");
        cDAO.insertClient(client);
    }
}
