/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ldsystem;

/**
 *
 * @author luise
 */
public class Menu2 extends javax.swing.JPanel {

    /**
     * Creates new form Menu2
     */
    public Menu2() {
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

        color = new javax.swing.JPanel();
        logoDos = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        color.setBackground(new java.awt.Color(144, 214, 255));

        logoDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout colorLayout = new javax.swing.GroupLayout(color);
        color.setLayout(colorLayout);
        colorLayout.setHorizontalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(logoDos)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        colorLayout.setVerticalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(logoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        add(color, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel color;
    private javax.swing.JLabel logoDos;
    // End of variables declaration//GEN-END:variables
}
