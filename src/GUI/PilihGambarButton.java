/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        buttonpanel = new javax.swing.JPanel();
        acdcbtn = new javax.swing.JButton();
        soadbtn = new javax.swing.JButton();
        metallicabtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        acdc = new javax.swing.JLabel();
        Soad = new javax.swing.JLabel();
        metalica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonpanel.setBackground(new java.awt.Color(153, 153, 153));

        acdcbtn.setText("ACDC");
        acdcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acdcbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(acdcbtn);

        soadbtn.setText("System of A Down");
        soadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soadbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(soadbtn);

        metallicabtn.setText("Metallica");
        metallicabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metallicabtnActionPerformed(evt);
            }
        });
        buttonpanel.add(metallicabtn);

        exitbtn.setText("exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(exitbtn);

        getContentPane().add(buttonpanel, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        acdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/acdc.jpg"))); // NOI18N
        imagepanel.add(acdc, "0");

        Soad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soad.jpg"))); // NOI18N
        imagepanel.add(Soad, "1");

        metalica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/metalica.jpg"))); // NOI18N
        imagepanel.add(metalica, "2");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void acdcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acdcbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"0");
    }//GEN-LAST:event_acdcbtnActionPerformed

    private void soadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soadbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"1");
    }//GEN-LAST:event_soadbtnActionPerformed

    private void metallicabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metallicabtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"2");
    }//GEN-LAST:event_metallicabtnActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Soad;
    private javax.swing.JLabel acdc;
    private javax.swing.JButton acdcbtn;
    private javax.swing.JPanel buttonpanel;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JLabel metalica;
    private javax.swing.JButton metallicabtn;
    private javax.swing.JButton soadbtn;
    // End of variables declaration//GEN-END:variables
}
