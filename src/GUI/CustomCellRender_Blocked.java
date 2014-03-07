/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

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
public class CustomCellRender_Blocked extends DefaultTableCellRenderer{
    private final Icon Block;
    private final Icon DBlock;
 
    public CustomCellRender_Blocked() {
        super();
       Block = new ImageIcon("/IMG/UserInterface/off.png");
       DBlock = new ImageIcon("/IMG/UserInterface/on.png");
    }
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JLabel lbl = new JLabel();
        Boolean blocked = (Boolean)value;
        ImageIcon iconDB = new ImageIcon(getClass().getResource("/IMG/UserInterface/on.png"));
        ImageIcon iconB = new ImageIcon(getClass().getResource("/IMG/UserInterface/off.png"));
 
        if(blocked){
            lbl.setText("");
            lbl.setIcon(iconDB);
        } else {
            lbl.setText("");
            lbl.setIcon(iconB);
        }
 
        return lbl;
    }
}
