/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
/**
 *
 * @author Becem
 */
import DAO.MessageDAO;
import DAO.UserDAO;
import ENTITIES.Message;
import ENTITIES.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class Inbox extends AbstractTableModel{
    
    
     String[] headers={"","From","Object","Content","Date"};
     List<Message> ListMsg = new ArrayList<>();

    public Inbox() {
        
        
        MessageDAO Msgdao = new MessageDAO();
        ListMsg = Msgdao.DisplayAllMessagesSent();
    }
     
    @Override
    public int getRowCount() {
        
       return ListMsg.size();
    }

    @Override
    public int getColumnCount() {
       return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
            case 0:
              return ListMsg.get(rowIndex).getId_message();
            case 1:
                return ListMsg.get(rowIndex).getFrom();
            case 2:
                return ListMsg.get(rowIndex).getObject();
            case 3:
                return ListMsg.get(rowIndex).getContent();
            case 4:
                return ListMsg.get(rowIndex).getDate();
           
            default:
                return null;
    }
         
    }
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if(aValue != null){
            Message Msg = ListMsg.get(rowIndex);
            MessageDAO MsgDAO = new MessageDAO();
            switch(columnIndex){
                case 0:
                    break;
                case 1:
                    Msg.setId_message((int)aValue);
                    break;
                case 2:
                    Msg.setFrom((String)aValue);
                    break;
                case 3:
                    Msg.setObject((String)aValue);
                    break;
                case 4:
                    Msg.setContent((String)aValue);
                    break;
                
            }
         
        }
    }
    
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
     public void remove_Message(int rowIndex)
    {
        MessageDAO MsgDAO = new  MessageDAO();
        MsgDAO.DeleteMessage(ListMsg.get(rowIndex).getId_message());
        ListMsg.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
}
