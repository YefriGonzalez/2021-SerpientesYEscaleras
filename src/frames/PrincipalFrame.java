/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import manejoArchivos.CargarUsuarioBInario;
import manejoArchivos.LectorTableroEnTexto;
import usuario.ConstructorTablero;
import usuario.Ficha;
import usuario.Usuario;
import java.lang.Object;

/**
 *
 * @author yefri1000
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form principalFrame
     */
    CargarUsuarioBInario carga = new CargarUsuarioBInario();
    ReportesFrame reportesFrame;
    LectorTableroEnTexto lector;
    private boolean colorCorrecto;
    private boolean rojoDisponible=true;
    private boolean amarilloDisponible=true;
    private boolean azulDisponible=true;
    private boolean naranjaDisponible=true;
    private boolean blancoDisponible=true;
    private boolean negroDisponible=true;

    public PrincipalFrame() {
        lector = new LectorTableroEnTexto();
        reportesFrame = new ReportesFrame();
        initComponents();
        inicializarLabelNombres();
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

        jPanelPrincipal = new javax.swing.JPanel();
        girarDadotJButton = new javax.swing.JButton();
        detenerDadoJButton = new javax.swing.JButton();
        dadojLabel = new javax.swing.JLabel();
        jugarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jugador1jLabel = new javax.swing.JLabel();
        jugador2jLabel = new javax.swing.JLabel();
        jugador3jLabel = new javax.swing.JLabel();
        jugador4jLabel = new javax.swing.JLabel();
        jugador5jLabel = new javax.swing.JLabel();
        jugador6jLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        colorJugador1jLabel = new javax.swing.JLabel();
        colorJugador2jLabel = new javax.swing.JLabel();
        colorJugador3jLabel = new javax.swing.JLabel();
        colorJugador4jLabel = new javax.swing.JLabel();
        colorJugador5jLabel = new javax.swing.JLabel();
        colorJugador6jLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serpientes y Escaleras");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(204, 0, 0));
        jPanelPrincipal.setForeground(new java.awt.Color(204, 0, 0));

        girarDadotJButton.setText("Girar Dado");
        girarDadotJButton.setEnabled(false);
        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girarDadotJButtonActionPerformed(evt);
            }
        });

        detenerDadoJButton.setText("Detener Dado");
        detenerDadoJButton.setEnabled(false);
        detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerDadoJButtonActionPerformed(evt);
            }
        });

        jugarjButton.setText("Cargar Tablero");
        jugarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Jugador1: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Jugador2: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Jugador3:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Jugador4:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Jugador5: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Jugador6: ");

        jugador1jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jugador2jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador2jLabel.setText("jLabel7");

        jugador3jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador3jLabel.setText("jLabel7");

        jugador4jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador4jLabel.setText("jLabel7");

        jugador5jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador5jLabel.setText("jLabel7");

        jugador6jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador6jLabel.setText("jLabel7");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        colorJugador1jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador1jLabel.setText("jLabel7");

        colorJugador2jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador2jLabel.setText("jLabel8");

        colorJugador3jLabel.setText("jLabel7");

        colorJugador4jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador4jLabel.setText("jLabel7");

        colorJugador5jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador5jLabel.setText("jLabel7");

        colorJugador6jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador6jLabel.setText("jLabel7");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dadojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(392, 392, 392)
                                .addComponent(jugarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 654, Short.MAX_VALUE)
                                .addComponent(detenerDadoJButton)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(girarDadotJButton)
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(28, 28, 28)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jugador1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador2jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador3jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador4jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador5jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador6jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorJugador1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(colorJugador2jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorJugador3jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorJugador4jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorJugador5jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorJugador6jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jugador1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(colorJugador1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jugador2jLabel)
                    .addComponent(colorJugador2jLabel))
                .addGap(29, 29, 29)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jugador3jLabel)
                    .addComponent(colorJugador3jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jugador4jLabel)
                    .addComponent(colorJugador4jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jugador5jLabel)
                    .addComponent(colorJugador5jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jugador6jLabel)
                    .addComponent(colorJugador6jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(dadojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(girarDadotJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(detenerDadoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jugarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Reportes");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Jugar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void inicializarLabelNombres() {
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jugador1jLabel.setVisible(false);
        jugador2jLabel.setVisible(false);
        jugador3jLabel.setVisible(false);
        jugador4jLabel.setVisible(false);
        jugador5jLabel.setVisible(false);
        jugador6jLabel.setVisible(false);
        colorJugador1jLabel.setVisible(false);
        colorJugador2jLabel.setVisible(false);
        colorJugador3jLabel.setVisible(false);
        colorJugador4jLabel.setVisible(false);
        colorJugador5jLabel.setVisible(false);
        colorJugador6jLabel.setVisible(false);
    }

    private void girarDadotJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girarDadotJButtonActionPerformed
        ImagenesDados imagenDado = new ImagenesDados();
        detenerDadoJButton.setEnabled(true);
        dadojLabel.setIcon(imagenDado.gifDado());


    }//GEN-LAST:event_girarDadotJButtonActionPerformed

    private void detenerDadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerDadoJButtonActionPerformed
        Dado dado = new Dado();
        int dados = dado.tirarNumero();
        ImagenesDados imagenDado = new ImagenesDados();
        dadojLabel.setIcon(imagenDado.dadoResultante(dados));
        detenerDadoJButton.setEnabled(false);
    }//GEN-LAST:event_detenerDadoJButtonActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        reportesFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jugarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarjButtonActionPerformed
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //aqui selecciono y guardo el FILE que va a utilizar el FileReader
            File fichero = fileChosser.getSelectedFile();

            try {
                this.lector.leerTexto(fichero);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el  archivo");
            }

        }
    }//GEN-LAST:event_jugarjButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int contador = 0;
        String color = null;
        Juego juego=new Juego();
        int numeroJugadores = Integer.valueOf((JOptionPane.showInputDialog(null, "Cantidad de jugadores para esta partida","", JOptionPane.PLAIN_MESSAGE, null, new Object[]{2, 3, 4, 5, 6}, "Selecciona")).toString());
        try {
            ArrayList<Usuario> usuario;
            usuario = carga.cargarUsuarioBinario();
            if (usuario.get(numeroJugadores - 1).getNombre() != null) {
                for (int i = 0; i < numeroJugadores; i++) {
                    boolean nombreCorrecto = false;
                    colorCorrecto=false;
                    contador += i;
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de Usuario No: "+(i+1));
                    if (nombre==null) {
                        i = numeroJugadores;
                        inicializarLabelNombres();
                        rojoDisponible=true;
                        amarilloDisponible=true;
                        azulDisponible=true;
                        blancoDisponible=true;
                        negroDisponible=true;
                        naranjaDisponible=true;
                    } else {
                        color = (JOptionPane.showInputDialog(null, "Color de Ficha","", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Rojo", "Amarillo", "Blanco", "Negro", "Naranja", "Azul"},"Selecciona")).toString();
                        elegirColor(color);
                        for (int j = 0; j < numeroJugadores && !nombreCorrecto; j++) {
                            if (usuario.get(j).getNombre().equals(nombre) && colorCorrecto==true) {
                                juego.registrarJugadores(usuario.get(i), imagen);
                                ponerNombres(i,nombre);
                                JOptionPane.showMessageDialog(null, "Usuario correcto");
                                nombreCorrecto = true;
                            } else {
                                nombreCorrecto = false;
                            }
                        }
                        if (nombreCorrecto == false) {
                            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                            i--;
                        }
                    }
                }
                if (contador == numeroJugadores) {
                    girarDadotJButton.setEnabled(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen " + numeroJugadores + " jugadores, registre Previamente la cantidad necesaria de jugadores");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cantidad de Usuarios no existente, registrese previamente");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    JLabel imagen;
    public JLabel elegirColor(String color){
        Ficha ficha =new Ficha();
        if(color.equals("Rojo") && rojoDisponible==true){
            colorCorrecto=true;
            rojoDisponible=false;
            ConstructorTablero.getTableroPanel()[ConstructorTablero.getTablero().getFilas()-1][ConstructorTablero.getTablero().getColumnas()-1].add(ficha.fichaRoja());
            imagen=ficha.fichaRoja();
        } else if(color.equals("Amarillo") && amarilloDisponible==true){
            amarilloDisponible=false;
            colorCorrecto=true;
            ConstructorTablero.getTableroPanel()[ConstructorTablero.getTablero().getFilas()-1][ConstructorTablero.getTablero().getColumnas()-1].add(ficha.fichaAmarilla());
            imagen=ficha.fichaAmarilla();
        } else if(color.equals("Naranja") && naranjaDisponible==true){
            naranjaDisponible=false;
            colorCorrecto=true;
            ConstructorTablero.getTableroPanel()[ConstructorTablero.getTablero().getFilas()-1][ConstructorTablero.getTablero().getColumnas()-1].add(ficha.fichaNaranja());
            imagen=ficha.fichaNaranja();
        } else  if(color.equals("Azul")&& azulDisponible==true){
            azulDisponible=false;
            colorCorrecto=true;
            ConstructorTablero.getTableroPanel()[ConstructorTablero.getTablero().getFilas()-1][ConstructorTablero.getTablero().getColumnas()-1].add(ficha.fichaAzul());
            imagen=ficha.fichaAzul();
        } else if(color.equals("Blanco") && blancoDisponible==true){
            blancoDisponible=false;
            colorCorrecto=true;
            ConstructorTablero.getTableroPanel()[ConstructorTablero.getTablero().getFilas()-1][ConstructorTablero.getTablero().getColumnas()-1].add(ficha.fichaBlanca());
            imagen=ficha.fichaBlanca();
        } else if(color.equals("Negro") && negroDisponible==true){
            negroDisponible=false;
            colorCorrecto=true;
            ConstructorTablero.getTableroPanel()[ConstructorTablero.getTablero().getFilas()-1][ConstructorTablero.getTablero().getColumnas()-1].add(ficha.fichaNegra());
            imagen=ficha.fichaNegra();
        } else {
            JOptionPane.showMessageDialog(null,"Color ya utilizado");
            colorCorrecto=false;
        }
        return imagen;
    }
    
    public void ponerNombres(int i, String nombre) {
        if (i == 0) {
            jugador1jLabel.setText(nombre);
            jugador1jLabel.setVisible(true);
            jLabel1.setVisible(true);
        }
        if (i == 1) {
            jugador2jLabel.setText(nombre);
            jugador2jLabel.setVisible(true);
            jLabel2.setVisible(true);
        }
        if (i == 2) {
            jugador3jLabel.setText(nombre);
            jugador3jLabel.setVisible(true);
            jLabel3.setVisible(true);
        }
        if (i == 3) {
            jugador4jLabel.setText(nombre);
            jugador4jLabel.setVisible(true);
            jLabel4.setVisible(true);
        }
        if (i == 4) {
            jugador5jLabel.setText(nombre);
            jugador5jLabel.setVisible(true);
            jLabel5.setVisible(true);
        }
        if (i == 5) {
            jugador6jLabel.setText(nombre);
            jugador6jLabel.setVisible(true);
            jLabel6.setVisible(true);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorJugador1jLabel;
    private javax.swing.JLabel colorJugador2jLabel;
    private javax.swing.JLabel colorJugador3jLabel;
    private javax.swing.JLabel colorJugador4jLabel;
    private javax.swing.JLabel colorJugador5jLabel;
    private javax.swing.JLabel colorJugador6jLabel;
    public static javax.swing.JLabel dadojLabel;
    private javax.swing.JButton detenerDadoJButton;
    public static javax.swing.JButton girarDadotJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel jugador1jLabel;
    private javax.swing.JLabel jugador2jLabel;
    private javax.swing.JLabel jugador3jLabel;
    private javax.swing.JLabel jugador4jLabel;
    private javax.swing.JLabel jugador5jLabel;
    private javax.swing.JLabel jugador6jLabel;
    public static javax.swing.JButton jugarjButton;
    // End of variables declaration//GEN-END:variables
}
