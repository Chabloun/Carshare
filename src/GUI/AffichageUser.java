/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.UserDAO;
import ENTITIES.User;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

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
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //Toutes les cellules éditables
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
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if(aValue != null){
            User user = ListUser.get(rowIndex);
            UserDAO userDAO = new UserDAO();
            switch(columnIndex){
                case 0:
                    break;
                case 1:
                    user.setPassword((String)aValue);
                    break;
                case 2:
                    user.setLastName((String)aValue);
                    break;
                case 3:
                    user.setFirstName((String)aValue);
                    break;
                case 4:
                    user.setAddress((String)aValue);
                    break;
                case 5:
                    user.setEmail((String)aValue);
                    break;
                case 6:
                    user.setDateB((Date)aValue);
                    break;
                case 7:
                    user.setCity((String)aValue);
                    break;
                case 8:
                    user.setRank((int)aValue);
                    break;
            }
            if(columnIndex!=0)userDAO.updateUser(user);
        }
    }
    @Override
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
                return Date.class;
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
