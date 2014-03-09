/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author yahia
 */
public class CustomCellRender_Message extends DefaultTableCellRenderer{
   
      private final Icon MClosed;
    private final Icon MOpened;
     public CustomCellRender_Message() {
        super();
       MClosed = new ImageIcon("/IMG/Buttons/Msg_Closed.png");
       MOpened = new ImageIcon("/IMG/Buttons/Msg_Open.png");
    }
  @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        int rownumber = row;
        JLabel lbl = new JLabel();
        Boolean blocked = (Boolean)value;
        ImageIcon iconMC = new ImageIcon(getClass().getResource("/IMG/Buttons/Msg_Closed.png"));
        ImageIcon iconMO = new ImageIcon(getClass().getResource("/IMG/Buttons/Msg_Open.png"));
        System.out.println(value);
        if(blocked){         
            lbl.setText("");
            lbl.setIcon(iconMC);
            

        } else {         
            lbl.setText("");
            lbl.setIcon(iconMO);
        }
       
 
        return lbl;
    }
}
