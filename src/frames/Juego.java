package frames;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;
import usuario.ConstructorTablero;
import usuario.Ficha;
import usuario.Usuario;

/**
 *
 * @author yefri1000
 */
public class Juego {

    private static ArrayList<Usuario> usuarios;
    private static ArrayList<JLabel> fichas;
    private boolean[] turnoJugador;
    private boolean ganador;

    /* 
     */

    public Juego() {
        usuarios = new ArrayList<>();
        fichas = new ArrayList<>();
    }

    public void registrarJugadores(Usuario usuario, JLabel ficha) {
        usuarios.add(usuario);
        fichas.add(ficha);
    }

    public void verificarTurnos(int numero) {
        ganador = false;
        turnoJugador = new boolean[usuarios.size()];
        while (ganador != true) {

        }

    }

    public void enviarReportes() {
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).setPartidasGanadas(1);
        }

    }

    public void turnos(Usuario usuario) {

    }

    public void turnoJugador1() {

    }

    public void turnoJugador2() {
    }

    public void turnoJugador3() {
    }

    public void turnoJugador4() {

    }

    public void turnoJugador5() {

    }

    public void turnoJugador6() {

    }

    public boolean buscarGanador(JLabel ficha, Usuario usuario) {
        if (ConstructorTablero.getTableroPanel()[0][0].getComponents().equals(ficha)) {
            JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
            usuario.setPartidasGanadas(1);
            ganador = true;
        } else {
            ganador= false;
        }
       return ganador;
    }
}
