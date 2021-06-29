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
    private ImageIcon colorAmarillo;
    private ImageIcon colorAzul;
    private ImageIcon colorNaranja;
    private ImageIcon colorNegro;
    private ImageIcon colorBlanco;
    private ImageIcon colorRojo;
    private JLabel fichaAmarilla;
    private JLabel fichaRoja;
    private JLabel fichaNegra;
    private JLabel fichaNaranja;
    private JLabel fichaBlanca;
    private JLabel fichaAzul;
    
    public JLabel fichaAmarilla(){
        colorAmarillo=new javax.swing.ImageIcon(getClass().getResource("/imagenes/amarillo.png"));
        fichaAmarilla=new JLabel(colorAmarillo);
        fichaAmarilla.setIcon(colorAmarillo);
        return fichaAmarilla;
    }
    public JLabel fichaAzul(){
        colorAzul=new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul.png"));
        fichaAzul=new JLabel(colorAzul);
        fichaAzul.setIcon(colorAzul);
        return fichaAzul;
    }
    
    public JLabel fichaBlanca(){
        colorBlanco=new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.png"));
        fichaBlanca=new JLabel(colorBlanco);
        fichaBlanca.setIcon(colorBlanco);
        return fichaBlanca;
    }
    
    public JLabel fichaNaranja(){
        colorNaranja=new javax.swing.ImageIcon(getClass().getResource("/imagenes/naranja.png"));
        fichaNaranja=new JLabel(colorNaranja);
        fichaNaranja.setIcon(colorNaranja);
        return fichaNaranja;
    }
    
    public JLabel fichaNegra(){
        colorNegro=new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro.png"));
        fichaNegra=new JLabel(colorNegro);
        fichaNegra.setIcon(colorNegro);
        return fichaNegra;
    }
    
    public JLabel fichaRoja(){
        colorRojo=new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo.png"));
        fichaRoja=new JLabel(colorRojo);
        fichaRoja.setIcon(colorRojo);
        fichaRoja.setVisible(true);
        return fichaRoja;
    }
    
}
