/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * affichageStock.java
 *
 * Created on 13 févr. 2014, 16:38:30
 */

package GUI;

import ENTITIES.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yahia
 */
public class AffichageUserGui extends javax.swing.JFrame {
    private final AffichageUser modeleUser = new AffichageUser();
    private final Inbox modeleInbox = new Inbox();
    private final RoadListGUI modeleRoad = new RoadListGUI();
    /** Creates new form affichageStock */
    public AffichageUserGui() {
        initComponents();
        setSize(700, 500);
        setMinimumSize(new Dimension(600, 0));
        setMaximumSize(new Dimension(800, Integer.MAX_VALUE));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jScrollPane1.setBorder(null);
        jTable1.setRowSorter(sorter);
        jTable1.setFillsViewportHeight(true);
        jTable1.setShowHorizontalLines(false);
        Color JframeColor = new Color(63,70,73);
        getContentPane().setBackground(JframeColor);
        JTableHeader header = jTable1.getTableHeader();
        Color bgcolor = new Color(45,47,49);
        Color focolor = new Color(244,244,244);
        header.setBackground(bgcolor);
        header.setForeground(focolor);
        header.setBorder(null);
        //set text alignement
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            TableColumn AlignementCol;
            for(int i = 0; i < modeleUser.getColumnCount(); i++)
            {
                AlignementCol= jTable1.getColumnModel().getColumn(i);
                AlignementCol.setCellRenderer(renderer);
            } 
        //end set text alignement
            
        //set blocked images
            
        //set blocked images
            
        //set header border:disabled
            for(int i = 0; i < modeleUser.getColumnCount(); i++)
            {
                TableColumn column = jTable1.getColumnModel().getColumn(i);
                column.setHeaderRenderer(new CustomCellRender());
            }
        //end set header border:disabled
        Color HeaderColorBackground = new Color(34,168,108);
        header.setBackground(HeaderColorBackground);
        jTable1.getColumnModel().getColumn(12).setCellRenderer(new CustomCellRender_Blocked());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuAdvert = new javax.swing.JLabel();
        MenuUsers = new javax.swing.JLabel();
        MenuInbox = new javax.swing.JLabel();
        MenuContainer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddUserPanel = new javax.swing.JPanel();
        AddUserLabel = new javax.swing.JLabel();
        RemoveUserPanel = new javax.swing.JPanel();
        RemoveUserLabel = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(63, 70, 73));
        setForeground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(1040, 600));
        setMinimumSize(new java.awt.Dimension(1040, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1040, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuAdvert.setBackground(new java.awt.Color(255, 51, 51));
        MenuAdvert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAdvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAdvertMouseClicked(evt);
            }
        });
        getContentPane().add(MenuAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 60));

        MenuUsers.setBackground(new java.awt.Color(255, 51, 51));
        MenuUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUsersMouseClicked(evt);
            }
        });
        getContentPane().add(MenuUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 60));

        MenuInbox.setBackground(new java.awt.Color(255, 51, 51));
        MenuInbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuInbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuInboxMouseClicked(evt);
            }
        });
        getContentPane().add(MenuInbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 60));

        MenuContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Menu_admin_users.png"))); // NOI18N
        getContentPane().add(MenuContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(45, 47, 49));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(modeleUser);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(63, 71, 73));
        jTable1.setRowHeight(50);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 990, 355));

        AddUserPanel.setBackground(new java.awt.Color(63, 70, 73));
        AddUserPanel.setMaximumSize(new java.awt.Dimension(32767, 40));
        AddUserPanel.setMinimumSize(new java.awt.Dimension(100, 40));
        AddUserPanel.setPreferredSize(new java.awt.Dimension(496, 40));

        AddUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/addUserButton_MouseOut.png"))); // NOI18N
        AddUserLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUserLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddUserLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddUserLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddUserPanelLayout = new javax.swing.GroupLayout(AddUserPanel);
        AddUserPanel.setLayout(AddUserPanelLayout);
        AddUserPanelLayout.setHorizontalGroup(
            AddUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddUserLabel)
                .addContainerGap())
        );
        AddUserPanelLayout.setVerticalGroup(
            AddUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddUserPanelLayout.createSequentialGroup()
                .addComponent(AddUserLabel)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        AddUserLabel.getAccessibleContext().setAccessibleName("LabelAddUser");
        AddUserLabel.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(AddUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 112, 46));

        RemoveUserPanel.setBackground(new java.awt.Color(63, 70, 73));
        RemoveUserPanel.setMaximumSize(new java.awt.Dimension(32767, 40));
        RemoveUserPanel.setMinimumSize(new java.awt.Dimension(100, 40));
        RemoveUserPanel.setPreferredSize(new java.awt.Dimension(496, 40));

        RemoveUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/deleteUserButton_MouseOut.png"))); // NOI18N
        RemoveUserLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveUserLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RemoveUserLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RemoveUserLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RemoveUserPanelLayout = new javax.swing.GroupLayout(RemoveUserPanel);
        RemoveUserPanel.setLayout(RemoveUserPanelLayout);
        RemoveUserPanelLayout.setHorizontalGroup(
            RemoveUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoveUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RemoveUserLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RemoveUserPanelLayout.setVerticalGroup(
            RemoveUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoveUserPanelLayout.createSequentialGroup()
                .addComponent(RemoveUserLabel)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(RemoveUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 112, 46));

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 162, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserLabelMouseExited
        AddUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/addUserButton_MouseOut.png")));
    }//GEN-LAST:event_AddUserLabelMouseExited

    private void AddUserLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserLabelMouseEntered
        AddUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/addUserButton_MouseIn.png")));
    }//GEN-LAST:event_AddUserLabelMouseEntered

    private void AddUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserLabelMouseClicked
        // AddUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/addUserButton_MouseOut.png")));
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        String Number= Integer.toString(n);
        User newuser= new User("Client "+Number, 
                               "UserPassword", 
                               "UserLastName", 
                               "UserFirstName", 
                               "UserSexe", 
                               "UserAddress",
                               "UserEmail", 
                               java.sql.Date.valueOf("1992-08-01"), 
                               "UserCity",
                               "UserImg", 
                               1,
                               java.sql.Date.valueOf("1992-08-01"),
                               false
                              );
        modeleUser.add_User(newuser);
    }//GEN-LAST:event_AddUserLabelMouseClicked

    private void RemoveUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveUserLabelMouseClicked
        int[] selection = jTable1.getSelectedRows();
        int[] modelIndexes = new int[selection.length];

        for(int i = 0; i < selection.length; i++)
        {
            modelIndexes[i] = jTable1.getRowSorter().convertRowIndexToModel(selection[i]);
        }
        Arrays.sort(modelIndexes);
        for(int i = modelIndexes.length - 1; i >= 0; i--)
        {
            modeleUser.remove_user(modelIndexes[i]);
        }
    }//GEN-LAST:event_RemoveUserLabelMouseClicked

    private void RemoveUserLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveUserLabelMouseEntered
        RemoveUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/deleteUserButton_MouseIn.png")));
    }//GEN-LAST:event_RemoveUserLabelMouseEntered

    private void RemoveUserLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveUserLabelMouseExited
        RemoveUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/deleteUserButton_MouseOut.png")));
    }//GEN-LAST:event_RemoveUserLabelMouseExited

    private void MenuInboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInboxMouseClicked
        InboxGUI a = new InboxGUI();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuInboxMouseClicked

    private void MenuUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsersMouseClicked

    }//GEN-LAST:event_MenuUsersMouseClicked

    private void MenuAdvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAdvertMouseClicked
        RoadList a = new RoadList();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuAdvertMouseClicked
    
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AffichageUserGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddUserLabel;
    private javax.swing.JPanel AddUserPanel;
    private javax.swing.JLabel MenuAdvert;
    private javax.swing.JLabel MenuContainer;
    private javax.swing.JLabel MenuInbox;
    private javax.swing.JLabel MenuUsers;
    private javax.swing.JLabel RemoveUserLabel;
    private javax.swing.JPanel RemoveUserPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
