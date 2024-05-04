/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ldsystem;

import Controlador.bd.SQLNombres;
import Controlador.bd.Transacciones;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luise
 */
public class NivelUno extends javax.swing.JPanel {
    
    Transacciones transacciones;
    DefaultTableModel modelo;
    public int idSeleccionado;   
    int indice = -1;

    /**
     * Creates new form InscripcionNivelUno
     */
    public NivelUno() {
        initComponents();
        this.transacciones = new Transacciones();
        this.modelo = new DefaultTableModel();
        this.mostrarAlumnas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnIns = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlumnas = new javax.swing.JTable();
        tbAgregarAlumna = new javax.swing.JButton();
        tbnEliminarAlumna = new javax.swing.JButton();
        btAyuda = new javax.swing.JButton();
        btAyuda1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        pnIns.setBackground(new java.awt.Color(144, 214, 255));

        tbAlumnas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tbAlumnas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ));
        tbAlumnas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlumnasMouseClicked(evt);
            }
        });
        tbAlumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAlumnasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbAlumnas);

        tbAgregarAlumna.setBackground(new java.awt.Color(85, 142, 213));
        tbAgregarAlumna.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tbAgregarAlumna.setText("Agregar");
        tbAgregarAlumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAgregarAlumnaActionPerformed(evt);
            }
        });

        tbnEliminarAlumna.setBackground(new java.awt.Color(85, 142, 213));
        tbnEliminarAlumna.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tbnEliminarAlumna.setText("Eliminar");
        tbnEliminarAlumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnEliminarAlumnaActionPerformed(evt);
            }
        });

        btAyuda.setBackground(new java.awt.Color(85, 142, 213));
        btAyuda.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btAyuda.setText("Ayuda");

        btAyuda1.setBackground(new java.awt.Color(85, 142, 213));
        btAyuda1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btAyuda1.setText("Ayuda");
        btAyuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAyuda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInsLayout = new javax.swing.GroupLayout(pnIns);
        pnIns.setLayout(pnInsLayout);
        pnInsLayout.setHorizontalGroup(
            pnInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btAyuda1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbAgregarAlumna, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(tbnEliminarAlumna, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnInsLayout.createSequentialGroup()
                    .addGap(484, 484, 484)
                    .addComponent(btAyuda)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );
        pnInsLayout.setVerticalGroup(
            pnInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbAgregarAlumna, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnEliminarAlumna, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAyuda1))
                .addGap(14, 14, 14))
            .addGroup(pnInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnInsLayout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(btAyuda)
                    .addContainerGap(208, Short.MAX_VALUE)))
        );

        add(pnIns, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAgregarAlumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAgregarAlumnaActionPerformed
        
        //Manda a llamar el JPanel de InscripcionNivelUno
        InscripcionNivelUno ins1 = new InscripcionNivelUno();
        ins1.setSize(1040,440);
        ins1.setLocation(0,0);

        pnIns.removeAll();
        pnIns.add(ins1, BorderLayout.CENTER);
        pnIns.revalidate();
        pnIns.repaint();
    }//GEN-LAST:event_tbAgregarAlumnaActionPerformed

    private void tbnEliminarAlumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnEliminarAlumnaActionPerformed
        int op
                = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar esta alumna?", "CONFIRMACION",
                        JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            

            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");

        } else {

            JOptionPane.showMessageDialog(null, "No se ha eliminado ningun dato");

        }//cierre del else
    }//GEN-LAST:event_tbnEliminarAlumnaActionPerformed

    private void tbAlumnasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAlumnasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbAlumnasKeyPressed

    private void tbAlumnasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlumnasMouseClicked
        indice = tbAlumnas.getSelectedRow();
    }//GEN-LAST:event_tbAlumnasMouseClicked

    private void btAyuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAyuda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAyuda1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAyuda;
    private javax.swing.JButton btAyuda1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnIns;
    private javax.swing.JButton tbAgregarAlumna;
    private javax.swing.JTable tbAlumnas;
    private javax.swing.JButton tbnEliminarAlumna;
    // End of variables declaration//GEN-END:variables

 

 public void mostrarAlumnas(){
  
     this.modelo = new DefaultTableModel(){
         @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer que todas las celdas sean no editables
     }
     };
        this.modelo.addColumn("ID");
        this.modelo.addColumn("Nombres");
        this.modelo.addColumn("Apellidos");
        this.modelo.addColumn("Direccion");
        this.modelo.addColumn("Contacto");
        this.modelo.addColumn("ID Nivel");
     
     
     try {
            
            

            ResultSet resultado = this.transacciones.seleccionar(SQLNombres.verNombre1());

            while (resultado.next()) {
                Object [] alum = {
                resultado.getInt(1),
                resultado.getString(2),
                resultado.getString(3),
                resultado.getString(4),
                resultado.getString(5),
                resultado.getInt(6)
                

                };
                modelo.addRow(alum);
            }//cierra while
            this.tbAlumnas.setModel(modelo);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());

        }//cierra catch
 }
}

