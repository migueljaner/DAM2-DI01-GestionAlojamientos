/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author Miquel
 */
public class PnlLogin extends javax.swing.JPanel {
    private Main padre;
    /**
     * Creates new form PnlLogin
     */
    public PnlLogin(Main padre) {
        this.padre = padre;
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

        btnLogin = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(0, 0));
        setLayout(null);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin);
        btnLogin.setBounds(360, 300, 80, 40);

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miquel\\Desktop\\DAM2\\Dev Interfaces\\UD1\\Ejercicios\\janermudoy_miguel_tarea1\\src\\main\\resources\\img\\logobk.png")); // NOI18N
        add(lblLogo);
        lblLogo.setBounds(250, 140, 280, 150);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        LoginDialog loginDialog = new LoginDialog(padre, true);
        loginDialog.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
