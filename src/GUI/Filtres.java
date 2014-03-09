

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
public class Filtres extends DefaultTableCellRenderer{
    private final Icon yes;
    private final Icon no;
 
    public Filtres() {
        super();
       no = new ImageIcon("/IMG/RoadList/no.png ");
       yes = new ImageIcon("/IMG/RoadList/R.png ");
    }
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JLabel lbl = new JLabel();
        String Filtres = (String)value;
        ImageIcon yes = new ImageIcon(getClass().getResource("/IMG/RoadList/R.png "));
        ImageIcon no = new ImageIcon(getClass().getResource("/IMG/RoadList/no.png "));
 
        if(Filtres.equals("yes")){
            
            lbl.setIcon(yes);
        } else {
          
            lbl.setIcon(no);
        }
 
        return lbl;
    }
}
