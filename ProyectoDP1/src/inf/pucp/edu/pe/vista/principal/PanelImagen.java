/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf.pucp.edu.pe.vista.principal;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author JuanCarlos
 */
public class PanelImagen extends javax.swing.JPanel {

    /**
     * Creates new form PanelImagen
     */
    public PanelImagen() {
        this.setSize(1680,1050);
    }
    
    @Override
    public void paintComponent (Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/inf/pucp/edu/pe/fondos/fondoo.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
