/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.MessageDAO;
import ENTITIES.Message;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SendMsg extends javax.swing.JFrame {

    /**
     * Creates new form SendMsg
     */
    public SendMsg() {
        initComponents();
       Color JframeColor = new Color(63,70,73);
        getContentPane().setBackground(JframeColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jto = new javax.swing.JTextField();
        Jobject = new javax.swing.JTextField();
        Jmsg = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(496, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jto.setBackground(new java.awt.Color(51, 53, 55));
        Jto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jto.setForeground(new java.awt.Color(220, 220, 220));
        Jto.setBorder(null);
        getContentPane().add(Jto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 124, 370, 40));

        Jobject.setBackground(new java.awt.Color(51, 53, 55));
        Jobject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jobject.setForeground(new java.awt.Color(220, 220, 220));
        Jobject.setBorder(null);
        Jobject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobjectActionPerformed(evt);
            }
        });
        getContentPane().add(Jobject, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 215, 370, 40));

        Jmsg.setBackground(new java.awt.Color(51, 53, 55));
        Jmsg.setColumns(20);
        Jmsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jmsg.setForeground(new java.awt.Color(220, 220, 220));
        Jmsg.setRows(5);
        Jmsg.setBorder(null);
        getContentPane().add(Jmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 334, 370, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/Button_Send_out.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 100, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/CONTACT_FORM_BIG_1.png"))); // NOI18N
        BG.setPreferredSize(new java.awt.Dimension(500, 650));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JobjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobjectActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MessageDAO mdao = new MessageDAO();
        Message msg = new Message();
        msg.setFrom("Admin");
        msg.setTo(Jto.getText());
        msg.setObject(Jobject.getText());
        msg.setContent(Jmsg.getText());
        
        mdao.SendMessage(msg);
   
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
         jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/Button_Send_click.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buttons/Button_Send_out.png")));
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(SendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMsg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JTextArea Jmsg;
    private javax.swing.JTextField Jobject;
    private javax.swing.JTextField Jto;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
