
package GUI;

import ENTITIES.Road;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
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
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
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
        inboxMenu = new javax.swing.JLabel();
        UserMenu = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 255));
        setMinimumSize(new java.awt.Dimension(0, 600));
        setPreferredSize(new java.awt.Dimension(1040, 506));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(63, 70, 73));

        RoadList.setBackground(new java.awt.Color(45, 47, 49));
        RoadList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoadList.setForeground(new java.awt.Color(204, 204, 204));
        RoadList.setModel(modele);
        RoadList.setGridColor(new java.awt.Color(102, 102, 102));
        RoadList.setRowHeight(60);
        RoadList.setSelectionBackground(new java.awt.Color(34, 168, 108));
        jScrollPane1.setViewportView(RoadList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1047, 418));

        inboxMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inboxMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inboxMenuMouseClicked(evt);
            }
        });
        getContentPane().add(inboxMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 40));

        UserMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMenuMouseClicked(evt);
            }
        });
        getContentPane().add(UserMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 16, 80, 40));

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/Delete.png"))); // NOI18N
        Delete.setText("jLabel1");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/AddRoad.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Menu_admin_advert.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void inboxMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxMenuMouseClicked
        InboxGUI a = new InboxGUI();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inboxMenuMouseClicked

    private void UserMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMenuMouseClicked
        AffichageUserGui a = new AffichageUserGui();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserMenuMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int[] selection =RoadList.getSelectedRows();
        for(int i = selection.length - 1; i >= 0; i--){
            modele.RemoveRoad(selection[i]);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
    }//GEN-LAST:event_jLabel4MouseClicked
    
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
    private javax.swing.JLabel Delete;
    private javax.swing.JTable RoadList;
    private javax.swing.JLabel UserMenu;
    private javax.swing.JLabel inboxMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
