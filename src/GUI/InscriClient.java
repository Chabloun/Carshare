/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.UserDAO;
import ENTITIES.User;
import java.awt.Color;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rissen
 */
public class InscriClient extends javax.swing.JFrame {

    /**
     * Creates new form InscriClient
     */
    public InscriClient() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        FirstName = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Homme = new javax.swing.JRadioButton();
        Femme = new javax.swing.JRadioButton();
        City = new javax.swing.JTextField();
        cpwd = new javax.swing.JPasswordField();
        pwd = new javax.swing.JPasswordField();
        Login = new javax.swing.JTextField();
        Inscrit = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        LastName = new javax.swing.JTextField();
        PHOTO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 47, 49));
        setMaximumSize(new java.awt.Dimension(10575575, 2782));
        setMinimumSize(new java.awt.Dimension(1040, 560));
        setPreferredSize(new java.awt.Dimension(1040, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstName.setBackground(new java.awt.Color(51, 53, 55));
        FirstName.setBorder(null);
        getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 370, 40));

        Address.setBackground(new java.awt.Color(51, 53, 55));
        Address.setBorder(null);
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 370, 40));

        Email.setBackground(new java.awt.Color(51, 53, 55));
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 370, 40));

        Homme.setBackground(new java.awt.Color(51, 53, 55));
        buttonGroup1.add(Homme);
        Homme.setSelected(true);
        Homme.setText("M");
        getContentPane().add(Homme, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        Femme.setBackground(new java.awt.Color(51, 53, 55));
        buttonGroup1.add(Femme);
        Femme.setText("F");
        Femme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemmeActionPerformed(evt);
            }
        });
        getContentPane().add(Femme, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        City.setBackground(new java.awt.Color(51, 53, 55));
        City.setBorder(null);
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });
        getContentPane().add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 370, 40));

        cpwd.setBackground(new java.awt.Color(51, 53, 55));
        cpwd.setBorder(null);
        cpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpwdActionPerformed(evt);
            }
        });
        getContentPane().add(cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 370, 40));

        pwd.setBackground(new java.awt.Color(51, 53, 55));
        pwd.setBorder(null);
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 380, 40));

        Login.setBackground(new java.awt.Color(51, 53, 55));
        Login.setBorder(null);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 370, 40));

        Inscrit.setBackground(new java.awt.Color(34, 168, 108));
        Inscrit.setForeground(new java.awt.Color(51, 53, 55));
        Inscrit.setText("REGISTER");
        Inscrit.setBorder(null);
        Inscrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscritActionPerformed(evt);
            }
        });
        getContentPane().add(Inscrit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 230, 60));

        Date.setBackground(new java.awt.Color(51, 53, 55));
        Date.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 370, 40));

        LastName.setBackground(new java.awt.Color(51, 53, 55));
        LastName.setBorder(null);
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 370, 40));

        PHOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Inscri.png"))); // NOI18N
        PHOTO.setMaximumSize(new java.awt.Dimension(1880, 1267));
        PHOTO.setMinimumSize(new java.awt.Dimension(1880, 1267));
        getContentPane().add(PHOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemmeActionPerformed

    private void InscritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscritActionPerformed
        // TODO add your handling code here:
        
        
        Pattern patternpseudo = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*");
        Matcher matcherpseudo = patternpseudo.matcher(Login.getText());
        
        
        
        if(matcherpseudo.matches() )
        {
            Pattern patternpwd = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*");
            Matcher matcherpwd = patternpwd.matcher(pwd.getText());
        
        
        
            if(matcherpwd.matches() && pwd.getText().equals(cpwd.getText()) )
            {
            
             Pattern patternnom = Pattern.compile("^[_A-Za-z-]([_A-Za-z-]+)*");
            Matcher matchernom = patternnom.matcher(FirstName.getText());
        
                if (matchernom.matches())
                {
                        Pattern patternprenom = Pattern.compile("^[_A-Za-z-]([_A-Za-z-]+)*");
                        Matcher matcherprenom = patternprenom.matcher(LastName.getText());
        
                        if (matcherprenom.matches())
                          {
                                   
                              Pattern patternadd = Pattern.compile("^[_A-Za-z-]([_A-Za-z-]+)*");
                                Matcher matcheradd = patternadd.matcher(Address.getText());
        
                        if (matcheradd.matches())
                          {
                              
                                    Pattern patternmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                                    Matcher matchermail = patternmail.matcher(Email.getText());
        
                                        if (matchermail.matches())
                                        {
                                               Pattern patterncity = Pattern.compile("^[_A-Za-z-]([_A-Za-z-]+)*");
                                               Matcher matchercity = patterncity.matcher(City.getText());
                                        
                                               if (matchercity.matches())
                                                {             
                                                        UserDAO Cdao = new UserDAO();
        User c = new User();
        c.setLogin(Login.getText());
        c.setPassword(pwd.getPassword().toString());
        c.setFirstName(FirstName.getText());
        c.setLastName(LastName.getText());
        String sexe="";
        if(Homme.isSelected()){
            sexe= Homme.getText();
        }
        if(Femme.isSelected()){
            sexe= Femme.getText();
        }
        c.setSexe(sexe);
        c.setAddress(Address.getText());
        c.setEmail(Email.getText());
        c.setDateB(java.sql.Date.valueOf("1992-08-01"));
        c.setCity(City.getText());
        Cdao.insertUser(c);
        JOptionPane.showMessageDialog(this,"Ajout effectué");
        
                                                }
                                                else{
                                                JOptionPane.showMessageDialog(this, " Fill all the fields please");
                                            }
                                        }
                                        else{
                                        JOptionPane.showMessageDialog(this, "Your Email is unvalid");
                                            }
                                     }
                                else{
                                JOptionPane.showMessageDialog(this, "Your Adress is unvalid");
                                }
                          }
                        else{
                        JOptionPane.showMessageDialog(this, "Your Last Name is unvalid");
                            }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Your First Name is unvalid");
                }
        
               }
               else {
               JOptionPane.showMessageDialog(this, "Your Password is unvalid");

               }
            }
        else {
                JOptionPane.showMessageDialog(this, "Your Login is unvalid");

            }
        
        
        
        
        
    }//GEN-LAST:event_InscritActionPerformed

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void cpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpwdActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdActionPerformed

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
            java.util.logging.Logger.getLogger(InscriClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InscriClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField City;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Femme;
    private javax.swing.JTextField FirstName;
    private javax.swing.JRadioButton Homme;
    private javax.swing.JButton Inscrit;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField Login;
    private javax.swing.JLabel PHOTO;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JPasswordField pwd;
    // End of variables declaration//GEN-END:variables
}
