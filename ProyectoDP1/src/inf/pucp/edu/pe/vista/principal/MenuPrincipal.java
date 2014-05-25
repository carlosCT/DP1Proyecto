/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf.pucp.edu.pe.vista.principal;

import inf.pucp.edu.pe.CargaDatos.MenuPrincipalCarga;
import inf.pucp.edu.pe.vista.simulacion.MenuPrincipalSimulacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import inf.pucp.edu.pe.vista.reporte.MenuPrincipalReporte;
import inf.pucp.edu.pe.vista.seguridad.MenuPrincipalSeguridad;


/**
 *
 * @author JuanCarlos
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private JButton btnTest = new JButton();
    
    public MenuPrincipal() {
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null);
        setBounds(400, 100, 350, 400);
        PanelImagen p = new PanelImagen();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
        //this.setResizable(false);
        //jPanel1.setBackground(Color.white);
        //agregar fondo
        initComponents();
       
    }    
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        public void run() {
        try {
        MenuPrincipal frame = new MenuPrincipal();
        frame.setVisible(true);
        } catch (Exception e) {
        e.printStackTrace();
        }
        }
        });
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeguridad = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSimulacion1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSeguridad.setBackground(new java.awt.Color(255, 255, 255));
        btnSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inf/pucp/edu/pe/Iconos/seguridad.jpg"))); // NOI18N
        btnSeguridad.setText("SEGURIDAD");
        btnSeguridad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeguridad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguridadActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(255, 255, 255));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inf/pucp/edu/pe/Iconos/Reporte1.png"))); // NOI18N
        btnReporte.setText("REPORTES");
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnSimulacion1.setBackground(new java.awt.Color(255, 255, 255));
        btnSimulacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inf/pucp/edu/pe/Iconos/Simulacion2.jpg"))); // NOI18N
        btnSimulacion1.setText("SIMULACION");
        btnSimulacion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSimulacion1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSimulacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulacion1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inf/pucp/edu/pe/Iconos/nube2.jpg"))); // NOI18N
        jButton1.setText("CARGA DATOS");
        jButton1.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarMasiva(evt);
            }
        });

        jMenu1.setText("Sistema");

        jMenuItem1.setText("Cerrar sesion");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimulacion1)
                    .addComponent(btnReporte))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeguridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimulacion1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReporte)
                    .addComponent(btnSeguridad))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        btnReporte.getAccessibleContext().setAccessibleDescription("null");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        //this.setVisible(false);
        MenuPrincipalReporte mr= new MenuPrincipalReporte();
        mr.setVisible(true);
        //mr.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguridadActionPerformed
        //this.setVisible(false);
        MenuPrincipalSeguridad ms= new MenuPrincipalSeguridad();
        ms.setVisible(true);
        //ms.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSeguridadActionPerformed

    private void btnSimulacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulacion1ActionPerformed
        MenuPrincipalSimulacion mps= new MenuPrincipalSimulacion();
        mps.setVisible(true);
    }//GEN-LAST:event_btnSimulacion1ActionPerformed

    private void btnCargarMasiva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMasiva
          MenuPrincipalCarga mpcm= new MenuPrincipalCarga();
        mpcm.setVisible(true);
    }//GEN-LAST:event_btnCargarMasiva

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSeguridad;
    private javax.swing.JButton btnSimulacion1;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
