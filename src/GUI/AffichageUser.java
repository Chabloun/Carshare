/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.UserDAO;
import ENTITIES.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yahia
 */
public class AffichageUser extends AbstractTableModel{
    String[] headers={"Login","Password","Lasr Name","First Name","Address","Email","Birth Date","City","Rank"};
    List<User> ListUser = new ArrayList<>();
    
    public AffichageUser()
    {
        UserDAO userdao = new UserDAO();
        ListUser = userdao.DisplayAllUsers();
    }
    
    @Override
    public int getRowCount() {
        return ListUser.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return ListUser.get(rowIndex).getLogin();
            case 1:
                return ListUser.get(rowIndex).getPassword();
            case 2:
                return ListUser.get(rowIndex).getLastName();
            case 3:
                return ListUser.get(rowIndex).getFirstName();
            case 4:
                return ListUser.get(rowIndex).getAddress();
            case 5:
                return ListUser.get(rowIndex).getEmail();
            case 6:
                return ListUser.get(rowIndex).getDateB();
            case 7:
                return ListUser.get(rowIndex).getCity();
            case 8:
                return ListUser.get(rowIndex).getRank();
            default:
                return null;
        }
    }
    
    @Override
    //{0"",1"Id",2"Login",3"Password",4"Lasr Name",5"First Name",6"Address",7"Email",8"Birth Date",9"City",10"Rank"}
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            case 7:
                return String.class;
            case 8:
                return Integer.class;
            default:
                return String.class;
                }
            }
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
    
    public void remove_user(int rowIndex)
    {
        UserDAO userDAO = new UserDAO();
        userDAO.deleteUser(ListUser.get(rowIndex).getLogin());
        ListUser.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    void add_User(User newuser) {
        ListUser.add(newuser);
        UserDAO userDAO = new UserDAO();
        userDAO.insertUser(newuser);
        fireTableRowsInserted(ListUser.size()-1,ListUser.size()-1);
    }
}
