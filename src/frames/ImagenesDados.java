
package frames;

import javax.swing.ImageIcon;

/**
 *
 * @author yefri1000
 */
public class ImagenesDados {
    
    private ImageIcon icono;
    private ImageIcon iconoFinal;
    
    /**
        *Funcion giDado
        *animacion de dado con un gif no devuelve ningun valor unicamnete utilizado  para mostrar animacion del dado
    */
    public ImageIcon gifDado(){    
        icono=new javax.swing.ImageIcon(getClass().getResource("/imagenes/dados1.gif"));         
        return icono;
    }
    
    
    /**
        *Funcion dadoResultando
        * @param dado int recibe como  parametro el numero generando  por el random del dado
        *recibe como parametro  el numero generado por el dado y dependiendo del numero muestra la imagen respectiva
    */
    public ImageIcon dadoResultante(int dado){
        switch(dado){
            case 1: 
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"));
                break;
            case 2:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"));
                break;
            case 3:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"));
                break;
            case 4:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png"));
                break;
            case 5:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/5.png"));
                break;
            case 6:    
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.png"));
                break;
        }
        return iconoFinal;
    }
    
    
    
}
