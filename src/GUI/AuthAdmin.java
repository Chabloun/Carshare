/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.ClientDAO;
import ENTITIES.Client;
import UTIL.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rissen
 */
public class AuthAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AuthClient
     */
    public AuthAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkLabel = new javax.swing.JLabel();
        Connect = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 168, 108));
        setMinimumSize(new java.awt.Dimension(500, 479));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkLabelMouseClicked(evt);
            }
        });
        getContentPane().add(checkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 272, 20, 20));

        Connect.setBackground(new java.awt.Color(34, 168, 90));
        Connect.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Connect.setForeground(new java.awt.Color(255, 255, 255));
        Connect.setText("Login");
        Connect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });
        getContentPane().add(Connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 360, 60));

        login.setBackground(new java.awt.Color(33, 35, 36));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(220, 220, 220));
        login.setBorder(null);
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 280, 50));

        pwd.setBackground(new java.awt.Color(33, 35, 36));
        pwd.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pwd.setForeground(new java.awt.Color(220, 220, 220));
        pwd.setBorder(null);
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 280, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/authentification/background.png"))); // NOI18N
        Background.setText("Login");
        Background.setMaximumSize(new java.awt.Dimension(500, 474));
        Background.setMinimumSize(new java.awt.Dimension(500, 474));
        Background.setPreferredSize(new java.awt.Dimension(500, 474));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
         String log = login.getText();
        String pass = pwd.getText();
        if((log.equals("admin"))&&(pass.equals("admin"))){
            RoadList roadList = new RoadList();
            roadList.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_ConnectActionPerformed

    private void checkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkLabelMouseClicked
        checkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/authentification/check.png")));
    }//GEN-LAST:event_checkLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AuthAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Connect;
    private javax.swing.JLabel checkLabel;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField pwd;
    // End of variables declaration//GEN-END:variables
}
