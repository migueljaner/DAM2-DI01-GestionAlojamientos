/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dataacces.DataAccess;
import dto.Allotjament;
import dto.Municipi;
import dto.Servei;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author Miquel
 */
public class pnlVerModificar extends javax.swing.JPanel {
    
    private PnlLoged padre;
    private DataAccess data = new DataAccess();
    private Allotjament verAllotjament;

    /**
     * Creates new form AnadirAlojamiento
     */
    public pnlVerModificar(PnlLoged padre) {
        this.padre = padre;
        this.verAllotjament = padre.getLstAlojamientos().getSelectedValue();
        initComponents();

        //Rellenamos combobox de municipis
        ArrayList<Municipi> municipis = data.getMunicipis();
        DefaultComboBoxModel<Municipi> dfcm = new javax.swing.DefaultComboBoxModel<>();
        for (Municipi municipi : municipis) {
            dfcm.addElement(municipi);
        };
        cmbMunicipio = new JComboBox<Municipi>(dfcm);
        cmbMunicipio.setBounds(310, 280, 330, 22);
        add(cmbMunicipio);

        //Salto de linea en txtArea
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setLineWrap(true);

        //Rellenar datos del Alojamiento seleccionado
        rellenarDatos();

        //Deshabilitar los inputs
        this.remove(btnGuardar);
        toggleEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInputError = new javax.swing.JLabel();
        lblEditValoracio = new javax.swing.JLabel();
        lblEditDescripcion = new javax.swing.JLabel();
        lblEditDirección = new javax.swing.JLabel();
        lblEditMunicipì = new javax.swing.JLabel();
        lblEditNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtDireccion = new javax.swing.JTextField();
        lblEditNumHuespedes = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        spnNumPersonas = new javax.swing.JSpinner();
        txtPrecio = new javax.swing.JTextField();
        lblEditAlojamiento1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblEditServicios = new javax.swing.JLabel();
        chkEditPiscina = new javax.swing.JCheckBox();
        chkEditMascota = new javax.swing.JCheckBox();
        chkEditAA = new javax.swing.JCheckBox();
        chkEditAscensor = new javax.swing.JCheckBox();
        chkEditParking = new javax.swing.JCheckBox();
        chkEditWifi = new javax.swing.JCheckBox();
        sldValoración = new javax.swing.JSlider();
        lblEditPrecio1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        lblInputError.setForeground(new java.awt.Color(255, 0, 0));
        add(lblInputError);
        lblInputError.setBounds(310, 60, 260, 20);

        lblEditValoracio.setText("Valoración:");
        add(lblEditValoracio);
        lblEditValoracio.setBounds(240, 450, 70, 16);

        lblEditDescripcion.setText("Descripción:");
        add(lblEditDescripcion);
        lblEditDescripcion.setBounds(240, 130, 90, 16);

        lblEditDirección.setText("Dirección:");
        add(lblEditDirección);
        lblEditDirección.setBounds(250, 230, 60, 16);

        lblEditMunicipì.setText("Municipio:");
        add(lblEditMunicipì);
        lblEditMunicipì.setBounds(250, 280, 60, 16);

        lblEditNombre.setText("Nombre:");
        add(lblEditNombre);
        lblEditNombre.setBounds(250, 90, 50, 16);
        add(txtNombre);
        txtNombre.setBounds(310, 90, 330, 22);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1);
        jScrollPane1.setBounds(310, 130, 330, 86);
        add(txtDireccion);
        txtDireccion.setBounds(310, 230, 330, 22);

        lblEditNumHuespedes.setText("Numero huespedes:");
        add(lblEditNumHuespedes);
        lblEditNumHuespedes.setBounds(200, 340, 120, 16);

        btnCancelar.setText("Volver");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar);
        btnCancelar.setBounds(50, 490, 90, 23);

        spnNumPersonas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        add(spnNumPersonas);
        spnNumPersonas.setBounds(320, 340, 70, 22);
        add(txtPrecio);
        txtPrecio.setBounds(320, 390, 71, 22);

        lblEditAlojamiento1.setText("Ver / Modificar Alojamiento");
        add(lblEditAlojamiento1);
        lblEditAlojamiento1.setBounds(50, 80, 190, 16);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar);
        btnEditar.setBounds(480, 490, 100, 23);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar);
        btnGuardar.setBounds(590, 490, 110, 23);

        lblEditServicios.setText("Servicios:");
        add(lblEditServicios);
        lblEditServicios.setBounds(400, 340, 60, 16);

        chkEditPiscina.setText("Piscina");
        add(chkEditPiscina);
        chkEditPiscina.setBounds(460, 340, 60, 20);

        chkEditMascota.setText("Mascotas");
        add(chkEditMascota);
        chkEditMascota.setBounds(560, 340, 73, 20);

        chkEditAA.setText("A/A");
        add(chkEditAA);
        chkEditAA.setBounds(460, 370, 44, 20);

        chkEditAscensor.setText("Ascensor");
        add(chkEditAscensor);
        chkEditAscensor.setBounds(560, 370, 71, 20);

        chkEditParking.setText("Parking");
        add(chkEditParking);
        chkEditParking.setBounds(460, 400, 63, 20);

        chkEditWifi.setText("Wifi");
        add(chkEditWifi);
        chkEditWifi.setBounds(560, 400, 44, 20);

        sldValoración.setMaximum(5);
        sldValoración.setValue(1);
        add(sldValoración);
        sldValoración.setBounds(330, 450, 160, 20);

        lblEditPrecio1.setText("Precio/noche:");
        add(lblEditPrecio1);
        lblEditPrecio1.setBounds(230, 390, 80, 16);

        jLabel1.setText("0");
        add(jLabel1);
        jLabel1.setBounds(320, 450, 10, 16);

        jLabel2.setText("5");
        add(jLabel2);
        jLabel2.setBounds(490, 450, 10, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:

        if (!txtNombre.isEditable()) {
            toggleEditable(true);
        } else {
            toggleEditable(false);
            rellenarDatos();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        padre.setVisible(true);
        padre.getPadre().remove(this);
        padre.repaint();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (!txtNombre.getText().isBlank() && !txtDescripcion.getText().isBlank() && !txtDireccion.getText().isBlank() && txtPrecio.getText().matches("^[0-9]+\\.?[0-9]*$")) {
            String nuevoNombre = txtNombre.getText();
            String nuevaDesc = txtDescripcion.getText();
            String nuevaDireccion = txtDireccion.getText();
            Float nuevoPrecio = Float.parseFloat(txtPrecio.getText());
            Integer nuevoMunicipi = cmbMunicipio.getSelectedIndex() + 1;
            Integer nuevoNumPersonas = (Integer) spnNumPersonas.getValue();
            
            verAllotjament.setNom(nuevoNombre);
            verAllotjament.setDescripcio(nuevaDesc);
            verAllotjament.setAdresa(nuevaDireccion);
            verAllotjament.setPreu_per_nit(nuevoPrecio);
            verAllotjament.setId_Municipi(nuevoMunicipi);
            verAllotjament.setNum_persones(nuevoNumPersonas);
            verAllotjament.setId_Propietari(padre.getPadre().getUserLogged().getId());
            
            if (data.updateAllojtament(verAllotjament) > 0) {
                int[] count = new int[6];
                if (chkEditWifi.isSelected()) {
                    count[5] = 1;
                }
                if (chkEditPiscina.isSelected()) {
                    count[0] = 1;
                }
                if (chkEditParking.isSelected()) {
                    count[4] = 1;
                }
                if (chkEditMascota.isSelected()) {
                    count[1] = 1;
                }
                if (chkEditAscensor.isSelected()) {
                    count[3] = 1;
                }
                if (chkEditAA.isSelected()) {
                    count[2] = 1;
                }
                if (data.updateServeisAllotjament(verAllotjament.getId(), count) > 0) {
                    toggleEditable(false);
                    rellenarDatos();
                    this.repaint();
                    lblInputError.setForeground(Color.GREEN);
                    lblInputError.setText("Modificado Correctamente");
                }else{System.err.println("Como el culo");}
                
            }
        } else {
            lblInputError.setText("Introduce los campos correctamente...");
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Funcion que activa y desactiva la funcinalidad de editar.
    private void toggleEditable(boolean edtiable) {
        if (edtiable) {
            btnEditar.setText("Cancelar");
            this.add(btnGuardar);
            this.repaint();
        } else {
            btnEditar.setText("Editar");
            this.remove(btnGuardar);
            this.repaint();
        }
        txtNombre.setEditable(edtiable);
        txtDescripcion.setEditable(edtiable);
        txtDireccion.setEditable(edtiable);
        txtPrecio.setEditable(edtiable);
        cmbMunicipio.setEnabled(edtiable);
        spnNumPersonas.setEnabled(edtiable);
        chkEditAA.setEnabled(edtiable);
        chkEditAscensor.setEnabled(edtiable);
        chkEditMascota.setEnabled(edtiable);
        chkEditParking.setEnabled(edtiable);
        chkEditPiscina.setEnabled(edtiable);
        chkEditWifi.setEnabled(edtiable);
        sldValoración.setEnabled(false);
        padre.getPadre().repaint();
    }
    //Funcion que rellena los datos del alojamiento seleccionado.
    private void rellenarDatos() {
        txtNombre.setText(verAllotjament.getNom());
        txtDescripcion.setText(verAllotjament.getDescripcio());
        txtDireccion.setText(verAllotjament.getAdresa());
        txtPrecio.setText(String.valueOf(verAllotjament.getPreu_per_nit()));
        cmbMunicipio.setSelectedIndex(verAllotjament.getId_municipi() - 1);
        spnNumPersonas.setValue(verAllotjament.getNum_persones());

        //Cargamos los servicios del alojamiento
        ArrayList<Servei> servicios = data.getServeisAllotjament(verAllotjament.getId());

        //Resetamos los servicios
        chkEditPiscina.setSelected(false);
        chkEditMascota.setSelected(false);
        chkEditAA.setSelected(false);
        chkEditAscensor.setSelected(false);
        chkEditParking.setSelected(false);
        chkEditWifi.setSelected(false);
        for (Servei servicio : servicios) {
            int idServicio = servicio.getId();
            if (idServicio == 1) {
                chkEditPiscina.setSelected(true);
            }
            if (idServicio == 2) {
                chkEditMascota.setSelected(true);
            }
            if (idServicio == 3) {
                chkEditAA.setSelected(true);
            }
            if (idServicio == 4) {
                chkEditAscensor.setSelected(true);
            }
            if (idServicio == 5) {
                chkEditParking.setSelected(true);
            }
            if (idServicio == 6) {
                chkEditWifi.setSelected(true);
            }
        }
        //Cargamos la valoración
        int valoración = Math.round(data.getValoracioAllotjamentAvg(verAllotjament.getId()));
        sldValoración.setValue(valoración);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkEditAA;
    private javax.swing.JCheckBox chkEditAscensor;
    private javax.swing.JCheckBox chkEditMascota;
    private javax.swing.JCheckBox chkEditParking;
    private javax.swing.JCheckBox chkEditPiscina;
    private javax.swing.JCheckBox chkEditWifi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEditAlojamiento1;
    private javax.swing.JLabel lblEditDescripcion;
    private javax.swing.JLabel lblEditDirección;
    private javax.swing.JLabel lblEditMunicipì;
    private javax.swing.JLabel lblEditNombre;
    private javax.swing.JLabel lblEditNumHuespedes;
    private javax.swing.JLabel lblEditPrecio1;
    private javax.swing.JLabel lblEditServicios;
    private javax.swing.JLabel lblEditValoracio;
    private javax.swing.JLabel lblInputError;
    private javax.swing.JSlider sldValoración;
    private javax.swing.JSpinner spnNumPersonas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JComboBox<Municipi> cmbMunicipio;
    
}