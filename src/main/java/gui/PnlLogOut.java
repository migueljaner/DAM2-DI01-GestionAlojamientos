/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import javax.swing.JLabel;

/**
 *
 * @author Miquel
 */
public class PnlLogOut extends javax.swing.JPanel {
    private Main Padre;
    /**
     * Creates new form pnlLogOut
     */
    public PnlLogOut(Main padre) {
        this.Padre = padre;
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

        lblBienvenida = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        setLayout(null);

        lblBienvenida.setText("Bienvenido...");
        add(lblBienvenida);
        lblBienvenida.setBounds(20, 30, 120, 16);

        btnLogOut.setText("LogOut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        add(btnLogOut);
        btnLogOut.setBounds(160, 20, 72, 23);
    }// </editor-fold>//GEN-END:initComponents
    //Quitamos el usuario logeado y mostramos de nuevo la pantalla de login.
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        Padre.setUserLogged(null);
        Padre.isLogedIn(false);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblBienvenida() {
        return lblBienvenida;
    }
}
