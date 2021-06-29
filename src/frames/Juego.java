
package frames;

import java.util.ArrayList;
import javax.swing.JLabel;
import usuario.Ficha;
import usuario.Usuario;

/**
 *
 * @author yefri1000
 */
public class Juego {
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<JLabel> fichas;
    private boolean turnoJugador1;
    private boolean turnoJugador2;
    private boolean turnoJugador3;
    private boolean turnoJugador4;
    private boolean turnoJugador5;
    private boolean turnoJugador6;
    /* 
    */
    
    public Juego(){
        usuarios=new ArrayList<>();
        fichas=new ArrayList<>();
    }
    
    public void jugar(Usuario usuario,JLabel ficha){
        usuarios.add(usuario);
        fichas.add(ficha);   
    }
    
    
    public void verificarTurnos(int numero){
    }

    public void enviarReportes(){
        for(int i=0;i<usuarios.size();i++){
            usuarios.get(i).setPartidasGanadas(1);
        }
    
    }
    
    
    public void turnoJugador1(){
    
    }

    public void turnoJugador2(){
    }
    
    public void turnoJugador3(){
    }
    
    public void turnoJugador4(){
    
    }
    
    public void turnoJugador5(){
        
    }
    
    public void turnoJugador6(){
    
    }
}


