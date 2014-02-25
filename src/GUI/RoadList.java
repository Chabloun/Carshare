
package GUI;

import ENTITIES.Road;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author omar
 */
public class RoadList extends javax.swing.JFrame {

    /**
     * Creates new form RoadList
     */
     private final RoadListGUI modele = new RoadListGUI() ;
     
     
    public RoadList() {
        initComponents();
        RoadList.setAutoCreateRowSorter(true);
        
        Color c = new Color(63,70,73);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(RoadList.getModel());
        jScrollPane1.setBorder(null);
        RoadList.setRowSorter(sorter);
        RoadList.setFillsViewportHeight(true);
        RoadList.setShowHorizontalLines(false);
        RoadList.setShowVerticalLines(true);
        JTableHeader header = RoadList.getTableHeader();
        Color bgcolor = new Color(45,47,49);
        Color focolor = new Color(244,244,244);
        header.setBackground(bgcolor);
        header.setForeground(focolor);
        header.setBorder(null);
        
        
         getContentPane().setBackground(c); 
          DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            TableColumn AlignementCol;
            for(int i = 0; i < modele.getColumnCount(); i++)
            {
                AlignementCol= RoadList.getColumnModel().getColumn(i);
                AlignementCol.setCellRenderer(renderer);
            } 
            
             for(int i = 0; i < modele.getColumnCount(); i++)
            {
                TableColumn column = RoadList.getColumnModel().getColumn(i);
                column.setHeaderRenderer(new CustomCellRender());
            }
        //end set header border:disabled
        Color HeaderColorBackground = new Color(34,168,108);
        header.setBackground(HeaderColorBackground);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoadList = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        User = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(63, 70, 73));

        RoadList.setBackground(new java.awt.Color(45, 47, 49));
        RoadList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoadList.setForeground(new java.awt.Color(204, 204, 204));
        RoadList.setModel(modele);
        RoadList.setGridColor(new java.awt.Color(102, 102, 102));
        RoadList.setRowHeight(60);
        RoadList.setSelectionBackground(new java.awt.Color(34, 168, 108));
        RoadList.setShowHorizontalLines(false);
        RoadList.setShowVerticalLines(false);
        jScrollPane1.setViewportView(RoadList);

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/button.png"))); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/Delete.png"))); // NOI18N
        Delete.setText("jLabel1");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        User.setText("Users");
        User.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                UserMenuSelected(evt);
            }
        });
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jMenuBar1.add(User);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       Random rand = new Random();
       int  n = rand.nextInt(50) + 1;
       String Number= Integer.toString(n);
       Road road = new Road("Driver"+Number,1,1,"0","0",1);
       modele.AddRoad(road);
    }//GEN-LAST:event_AddActionPerformed

    private void UserMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_UserMenuSelected
       AffichageUserGui u=new AffichageUserGui();
       u.setVisible(true);
        
    }//GEN-LAST:event_UserMenuSelected

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
AffichageUserGui u=new AffichageUserGui();    }//GEN-LAST:event_UserActionPerformed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
         int[] selection =RoadList.getSelectedRows();
        for(int i = selection.length - 1; i >= 0; i--){
            modele.RemoveRoad(selection[i]);
    }//GEN-LAST:event_DeleteMouseClicked
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoadList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoadList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoadList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoadList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoadList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Delete;
    private javax.swing.JTable RoadList;
    private javax.swing.JMenu User;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
