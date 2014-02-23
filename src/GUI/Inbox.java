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
import ENTITIES.Message;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class Inbox extends AbstractTableModel{
    
    
     String[] headers={"ID","From","Object","Content","Date"};
     List<Message> ListMsg = new ArrayList<>();

    public Inbox() {
        
        
        MessageDAO Msgdao = new MessageDAO();
        ListMsg = Msgdao.DisplayAllMessages();
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
    
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
     public void remove_user(int rowIndex)
    {
        MessageDAO MsgDAO = new  MessageDAO();
        MsgDAO.DeleteMessage(ListMsg.get(rowIndex).getId_message());
        ListMsg.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
}
