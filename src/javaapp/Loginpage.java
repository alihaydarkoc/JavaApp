/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alihaydar
 */
public class Loginpage extends javax.swing.JFrame {

    /**
     * Creates new form Thirdpage
     */
    public Loginpage() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        useralani = new javax.swing.JTextField();
        sifrealani = new javax.swing.JPasswordField();
        buttonalani = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(640, 360));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Şifreniz");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adınız");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));
        getContentPane().add(useralani, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 110, -1));
        getContentPane().add(sifrealani, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 110, -1));

        buttonalani.setText("Giriş");
        buttonalani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonalaniActionPerformed(evt);
            }
        });
        getContentPane().add(buttonalani, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logosiyah_800x450 (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonalaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonalaniActionPerformed
       try {
           
            String isim=useralani.getText();
            String sifre=sifrealani.getText();
           
            //dbdatadan data istedik.
            boolean isSucces =DBData.getLogin(isim, sifre);
          
            if(isSucces){
                JOptionPane.showMessageDialog(null, "basarili");
                dispose();
                Mainpage mp=new Mainpage();
                mp.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "baglanti hatasi");
            }
        } catch (HeadlessException e) {
             System.out.println(e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonalaniActionPerformed

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
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonalani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField sifrealani;
    private javax.swing.JTextField useralani;
    // End of variables declaration//GEN-END:variables
}