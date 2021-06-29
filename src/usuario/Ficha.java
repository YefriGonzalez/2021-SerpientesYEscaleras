/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author yefri1000
 */
public class Ficha {
    private static ImageIcon colorAmarillo;
    private static ImageIcon colorAzul;
    private static ImageIcon colorNaranja;
    private static ImageIcon colorNegro;
    private static ImageIcon colorBlanco;
    private static ImageIcon colorRojo;
    private static JLabel fichaAmarilla;
    private static JLabel fichaRoja;
    private static JLabel fichaNegra;
    private static JLabel fichaNaranja;
    private static JLabel fichaBlanca;
    private static JLabel fichaAzul;
    
    
    public Ficha(){
        fichaAmarilla();
        fichaAzul();
        fichaBlanca();
        fichaNaranja();
        fichaNegra();
        fichaRoja();
    }
    
    /**
     * Funcion ficha Amarilla que regresa el label amarillo
     * @return 
     */
    public JLabel fichaAmarilla(){
        colorAmarillo=new javax.swing.ImageIcon(getClass().getResource("/imagenes/amarillo.png"));
        fichaAmarilla=new JLabel(colorAmarillo);
        fichaAmarilla.setIcon(colorAmarillo);
        return fichaAmarilla;
    }
    
    /**
     * Funcion ficha Azul que regresa el label azul
     * @return 
     */
    public JLabel fichaAzul(){
        colorAzul=new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul.png"));
        fichaAzul=new JLabel(colorAzul);
        fichaAzul.setIcon(colorAzul);
        return fichaAzul;
    }
    
    /**
     * Funcion ficha Blanca que regresa el label Blanco
     * @return 
     */
    public JLabel fichaBlanca(){
        colorBlanco=new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.png"));
        fichaBlanca=new JLabel(colorBlanco);
        fichaBlanca.setIcon(colorBlanco);
        return fichaBlanca;
    }
    
    /**
     * Funcion ficha Naranja que regresa el label naranja
     * @return 
     */
    public JLabel fichaNaranja(){
        colorNaranja=new javax.swing.ImageIcon(getClass().getResource("/imagenes/naranja.png"));
        fichaNaranja=new JLabel(colorNaranja);
        fichaNaranja.setIcon(colorNaranja);
        return fichaNaranja;
    }
    
    /**
     * Funcion ficha Negra que regresa el label negra
     * @return 
     */
    public JLabel fichaNegra(){
        colorNegro=new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro.png"));
        fichaNegra=new JLabel(colorNegro);
        fichaNegra.setIcon(colorNegro);
        return fichaNegra;
    }
    
    /**
     * Funcion ficha Roja que regresa el label roja
     * @return 
     */
    public JLabel fichaRoja(){
        colorRojo=new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo.png"));
        fichaRoja=new JLabel(colorRojo);
        fichaRoja.setIcon(colorRojo);
        fichaRoja.setVisible(true);
        return fichaRoja;
    }

    public static JLabel getFichaAmarilla() {
        return fichaAmarilla;
    }

    public static JLabel getFichaRoja() {
        return fichaRoja;
    }

    public static JLabel getFichaNegra() {
        return fichaNegra;
    }

    public static JLabel getFichaNaranja() {
        return fichaNaranja;
    }

    public static JLabel getFichaBlanca() {
        return fichaBlanca;
    }

    public static JLabel getFichaAzul() {
        return fichaAzul;
    }    
    
}
