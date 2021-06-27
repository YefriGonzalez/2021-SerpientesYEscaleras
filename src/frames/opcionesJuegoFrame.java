/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import manejoArchivos.CargarUsuarioBInario;
import usuario.Usuario;

/**
 *
 * @author yefri1000
 */
public class opcionesJuegoFrame extends javax.swing.JFrame {

    /**
     * Creates new form opcionesJuegoFrame
     */
    LoginSerEsc login = new LoginSerEsc();
    PrincipalFrame principal = new PrincipalFrame();
    CargarUsuarioBInario carga = new CargarUsuarioBInario();

    public opcionesJuegoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        registrarjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 281, 110, 50));

        registrarjButton.setText("Registrar Usuario");
        registrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registrarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 281, -1, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int contador=0;
        int numeroJugadores = Integer.valueOf((JOptionPane.showInputDialog(null, "Cantidad de jugadores para esta partida", "", JOptionPane.PLAIN_MESSAGE, null, new Object[]{2, 3, 4, 5, 6}, "Selecciona")).toString());
        ArrayList<Usuario> usuario = null;
        try {
            usuario = carga.cargarUsuarioBinario();
            if (usuario.get(numeroJugadores - 1).getNombre() != null) {
                for (int i = 0; i < numeroJugadores; i++) {
                    boolean nombreCorrecto =false;
                    contador+=i;
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de Usuario No: "+ (i + 1));
                    if(nombre==null){
                        i=numeroJugadores;
                    } else{
                        for (int j = 0; j < numeroJugadores && !nombreCorrecto; j++) {
                            if (usuario.get(j).getNombre().equals(nombre)) {
                                JOptionPane.showMessageDialog(null, "Usuario correcto");
                                nombreCorrecto=true;
                            } else {
                                nombreCorrecto=false;
                            }
                        }
                        if(nombreCorrecto==false){
                            JOptionPane.showMessageDialog(null,"Usuario incorrecto");
                            i--;
                        }
                    }    
                }
                if(contador==numeroJugadores){
                        principal.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen " + numeroJugadores + " jugadores, registre Previamente la cantidad necesaria de jugadores");
            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "No existen " + numeroJugadores + " jugadores, registre Previamente la cantidad necesaria de jugadores");
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarjButtonActionPerformed
        login.setVisible(true);
    }//GEN-LAST:event_registrarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(opcionesJuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opcionesJuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opcionesJuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opcionesJuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opcionesJuegoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrarjButton;
    // End of variables declaration//GEN-END:variables
}