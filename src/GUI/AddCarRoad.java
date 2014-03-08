/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.RoadDAO;
import ENTITIES.Road;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rissen
 */
public class AddCarRoad extends javax.swing.JFrame {

    /**
     * Creates new form AddCarRoad
     */
    public AddCarRoad() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Ajouter = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        CityD = new javax.swing.JTextField();
        CityR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        oui = new javax.swing.JRadioButton();
        non = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        car = new javax.swing.JTextArea();
        seat = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        CityD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityDActionPerformed(evt);
            }
        });

        jLabel1.setText("Pseudo: ");

        jLabel2.setText("Prix: ");

        jLabel3.setText("Ville de depart :");

        jLabel4.setText("Ville d'arrivée :");

        jLabel5.setText("Nb de place :");

        jLabel6.setText("Retour :");

        jLabel7.setText("Date :");

        jLabel8.setText("Voiture :");

        buttonGroup1.add(oui);
        oui.setText("Oui");
        oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouiActionPerformed(evt);
            }
        });

        buttonGroup1.add(non);
        non.setSelected(true);
        non.setText("Non");

        car.setColumns(20);
        car.setRows(5);
        jScrollPane1.setViewportView(car);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CityR, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(CityD)
                            .addComponent(price)
                            .addComponent(login))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(Ajouter)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oui)
                                .addGap(18, 18, 18)
                                .addComponent(non))
                            .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(oui)
                    .addComponent(non))
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(Ajouter)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CityDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityDActionPerformed

    private void ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ouiActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
       
        
        Pattern patternpseudo = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*");
        Matcher matcherpseudo = patternpseudo.matcher(login.getText());
        
        
        
        if(matcherpseudo.matches() )
        {
            Pattern patternprix = Pattern.compile("^[0-9]{4,5}$");
            Matcher matcherprix = patternprix.matcher(price.getText());
        
        
        
            if(matcherprix.matches() )
            {
                        Pattern patterncityd = Pattern.compile("^[_A-Za-z-]([_A-Za-z-]+)*");
                        Matcher matchercityd = patterncityd.matcher(CityD.getText());
        
                        if (matchercityd.matches())
                        {
                            Pattern patterncityr = Pattern.compile("^[_A-Za-z-]([_A-Za-z-]+)*");
                            Matcher matchercityr = patterncityr.matcher(CityR.getText());
        
                            if (matchercityr.matches())
                            {
                                Pattern patternseat = Pattern.compile("^[1-4]$");
                                Matcher matcherseat = patternseat.matcher(seat.getValue().toString());
        
                                if (matcherseat.matches())
                                    {
                                                Pattern patterncar = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*");
                                                Matcher matchercar = patterncar.matcher(car.getText());
        
                                                if (matchercar.matches())
                                                {
                                                         RoadDAO rdao = new RoadDAO();
        Road r = new Road();
        r.setDriver(login.getText());
        r.setPrice(parseFloat(price.getText()));
        r.setCityD(CityD.getText());
        r.setCityR(CityR.getText());
        r.setSeat(parseInt(seat.getValue().toString()));
        int road=0;
        if(oui.isSelected()){
            road=1;
        }
        //r.setRound(road);
        rdao.AddRoad(r);
        JOptionPane.showMessageDialog(this,"Ajout effectué");
                                                }
                                                else{
                                                JOptionPane.showMessageDialog(this, "You have to add your car description");
                                                    }
                                    }
                                else{
                                   JOptionPane.showMessageDialog(this, "The number of seats must be different from 0");
                                    }
                                 
                            }
                            else{
                            JOptionPane.showMessageDialog(this, "Your City R is unvalid");
                            }
                        }
                         else{
                        JOptionPane.showMessageDialog(this, "Your City D is unvalid");
                            }
            }
            else{
                 JOptionPane.showMessageDialog(this, "Your Price is unvalid");
            }
        }
        
        else {
             JOptionPane.showMessageDialog(this, "Your Login is unvalid");
        }
        
        
        
        
       
    }//GEN-LAST:event_AjouterActionPerformed

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
            java.util.logging.Logger.getLogger(AddCarRoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCarRoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCarRoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCarRoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCarRoad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JTextField CityD;
    private javax.swing.JTextField CityR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea car;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField login;
    private javax.swing.JRadioButton non;
    private javax.swing.JRadioButton oui;
    private javax.swing.JTextField price;
    private javax.swing.JSpinner seat;
    // End of variables declaration//GEN-END:variables
}
