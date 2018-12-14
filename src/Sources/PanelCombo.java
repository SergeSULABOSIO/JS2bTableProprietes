/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class PanelCombo extends javax.swing.JPanel {

    /**
     * Creates new form PanelPropriete
     */
    public PanelCombo() {
        initComponents();
    }

    public void sentirSelection(boolean isSelected, int row) {
        if (isSelected == true) {
            this.setCouleurs(Color.BLACK, Color.YELLOW);
        } else {
            if ((row % 2) == 0) {
                this.setCouleurs(new Color(210, 210, 210), Color.BLACK);
            } else {
                this.setCouleurs(Color.WHITE, Color.black);
            }
        }
    }

    public void setIcone(ImageIcon icone) {
        jLabel1.setIcon(icone);
    }

    public void setNom(String nom) {
        this.jLabel1.setText(nom);
    }

    public void setCouleurs(Color arriere, Color avant) {
        this.setBackground(arriere);
        this.jLabel1.setForeground(avant);
    }

    public void setCouleurDefaut() {
        this.jLabel1.setForeground(Color.GRAY);
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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BTRECHERCHE/rech01.png"))); // NOI18N
        jLabel1.setText("Propr");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}