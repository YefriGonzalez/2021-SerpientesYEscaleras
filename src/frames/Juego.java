package frames;

import static frames.PrincipalFrame.dadojLabel;
import static frames.PrincipalFrame.detenerDadoJButton;
import static frames.PrincipalFrame.girarDadotJButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import usuario.ConstructorTablero;
import usuario.Usuario;

/**
 *
 * @author yefri1000
 */
public class Juego {

    private static ArrayList<Usuario> usuarios;
    private static ArrayList<JLabel> fichas;
    private boolean ganador;
    private int posicionXJ1;
    private int posicionYJ1;
    private int posicionXJ2;
    private int posicionYJ2;
    private int posicionXJ3;
    private int posicionYJ3;
    private int posicionXJ4;
    private int posicionYJ4;
    private int posicionXJ5;
    private int posicionYJ5;
    private int posicionXJ6;
    private int posicionYJ6;
    private boolean turnoDisponible;
    int contadorj1;
    int contadorj2;
    int contadorj3;
    int contadorj4;
    int contadorj5;
    int contadorj6;

    /**
     * Constructor de la clase Juego, inicializa las posisciones de las fihcas en x y y e inicializa arrayLista de usuarios y fichas para jugadores
     */ 
  
    public Juego() {
        usuarios = new ArrayList<>();
        fichas = new ArrayList<>();
        posicionXJ1 = ConstructorTablero.getTablero().getColumnas() - 1;
        posicionYJ1 = ConstructorTablero.getTablero().getFilas() - 1;
        posicionXJ2 = ConstructorTablero.getTablero().getColumnas() - 1;
        posicionYJ2 = ConstructorTablero.getTablero().getFilas() - 1;
        posicionXJ3 = ConstructorTablero.getTablero().getColumnas() - 1;
        posicionYJ3 = ConstructorTablero.getTablero().getFilas() - 1;
        posicionXJ4 = ConstructorTablero.getTablero().getColumnas() - 1;
        posicionYJ4 = ConstructorTablero.getTablero().getFilas() - 1;
        posicionXJ5 = ConstructorTablero.getTablero().getColumnas() - 1;
        posicionYJ5 = ConstructorTablero.getTablero().getFilas() - 1;
        posicionXJ6 = ConstructorTablero.getTablero().getColumnas() - 1;
        posicionYJ6 = ConstructorTablero.getTablero().getFilas() - 1;
        turnoDisponible = true;
    }

    /**
     * 
     * @param usuario recibe el parametro usuarioa de la clase PrincipalFrame, cuando se pide el nombre y cantidad de jugadores
     * @param ficha  recible un JLabel para poder tener el usuarioa y la ficha en un mismo indice de los ArrayList
     */
    public void registrarJugadores(Usuario usuario, JLabel ficha) {
        usuarios.add(usuario);
        fichas.add(ficha);
    }

    /**
     * Metodo jugar realiza los turnos de jugadores
     */
    public void Jugar() {
        ganador = false;
        try {
            while (ganador != true) {
                if (usuarios.get(0) != null && turnoDisponible == true) {
                    turnoJugador1(usuarios.get(0), fichas.get(0));
                    buscarGanador(fichas.get(0), usuarios.get(0));
                }
                if (usuarios.get(1) != null && turnoDisponible == true) {
                    turnoJugador2(usuarios.get(1), fichas.get(1));
                    buscarGanador(fichas.get(1), usuarios.get(1));
                }
                if (usuarios.get(2) != null && turnoDisponible == true) {
                    turnoJugador3(usuarios.get(2), fichas.get(2));
                    buscarGanador(fichas.get(2), usuarios.get(2));
                }
                if (usuarios.get(3) != null && turnoDisponible == true) {
                    turnoJugador4(usuarios.get(3), fichas.get(3));
                    buscarGanador(fichas.get(3), usuarios.get(3));
                }
                if (usuarios.get(4) != null && turnoDisponible == true) {
                    turnoJugador5(usuarios.get(4), fichas.get(4));
                    buscarGanador(fichas.get(4), usuarios.get(4));
                }
                if (usuarios.get(5) != null && turnoDisponible == true) {
                    turnoJugador6(usuarios.get(5), fichas.get(5));
                    buscarGanador(fichas.get(5), usuarios.get(5));
                }
            }
        } catch (Exception e) {

        }
    }

    /**
     * Metodo Tunro jugador 1 
     * @param usuario Recibie como parametro un usuario para ir mostrando el nombre y las instrucciones
     * @param ficha  recibe como parametro un label para ir moviendo  la ficha 
     */
    public void turnoJugador1(Usuario usuario, JLabel ficha) {
        contadorj1 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj1 == 0) {
            JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    detenerDadoJButton.setEnabled(true);
                    girarDadotJButton.setEnabled(false);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });
            PrincipalFrame.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].remove(ficha);
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ1 =- dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].add(ficha);
                    turnoDisponible = false;
                    girarDadotJButton.setEnabled(true);
                    contadorj1 = 1;
                }
            });
        }
    }

    
    
    /**
     * Metodo Tunro jugador 2
     * @param usuario Recibie como parametro un usuario para ir mostrando el nombre y las instrucciones
     * @param ficha  recibe como parametro un label para ir moviendo  la ficha 
     */
    public void turnoJugador2(Usuario usuario, JLabel ficha) {
        contadorj2 = 0;
        turnoDisponible=false;
        if (contadorj2 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
            girarDadotJButton.setEnabled(true);
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });

            PrincipalFrame.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].remove(ficha);
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ2 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj2 = 1;
                }
            });
        }
    }
    
    
    /**
     * Metodo Tunro jugador 3 
     * @param usuario Recibie como parametro un usuario para ir mostrando el nombre y las instrucciones
     * @param ficha  recibe como parametro un label para ir moviendo  la ficha 
     */

    public void turnoJugador3(Usuario usuario, JLabel ficha) {
        contadorj3 = 0;
        girarDadotJButton.setEnabled(true);
        turnoDisponible=false;
        if (contadorj3 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                    girarDadotJButton.setEnabled(true);
                }

            });

            PrincipalFrame.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].remove(ficha);
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ3 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj3 = 1;
                }
            });
        }
    }

    
    
    /**
     * Metodo Tunro jugador 4 
     * @param usuario Recibie como parametro un usuario para ir mostrando el nombre y las instrucciones
     * @param ficha  recibe como parametro un label para ir moviendo  la ficha 
     */
    public void turnoJugador4(Usuario usuario, JLabel ficha) {
        contadorj4 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj4 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });

            PrincipalFrame.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].remove(ficha);
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ4 =- dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj4 = 1;
                }
            });
        }

    }

    
    
    /**
     * Metodo Tunro jugador 5 
     * @param usuario Recibie como parametro un usuario para ir mostrando el nombre y las instrucciones
     * @param ficha  recibe como parametro un label para ir moviendo  la ficha 
     */
    public void turnoJugador5(Usuario usuario, JLabel ficha) {
        contadorj5 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj5 == 0) {
            JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });

            PrincipalFrame.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].remove(ficha);
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ5 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj5 = 1;
                }
            });
        }

    }

    
    
    /**
     * Metodo Tunro jugador 5 
     * @param usuario Recibie como parametro un usuario para ir mostrando el nombre y las instrucciones
     * @param ficha  recibe como parametro un label para ir moviendo  la ficha 
     */
    public void turnoJugador6(Usuario usuario, JLabel ficha) {
        contadorj6 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj6 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });
            PrincipalFrame.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    //ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].remove(ficha);
                    Dado dado = new Dado();
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ6 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj6 = 1;
                }
            });
        }
    }

    
    /**
     * Metodo para enviar las partidas jugadas, ganadas y perdidas
     */
    public void enviarReportes() {
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).setPartidasJugadas(1);
        }
    }
    
    /**
     * metodo BuscarGanador
     * @param ficha  recibe como parametro un label para evaluarla si llego a la posicio 0,0 
     * @param usuario recibe el  usuario si llego a 0,0 usar el setPartidasGanadas e incrementa
     * @return  regresa un boolean ganador para termina el while de jugar
     */

    public boolean buscarGanador(JLabel ficha, Usuario usuario) {
        if (ConstructorTablero.getTableroPanel()[0][0].getComponents().equals(ficha)) {
            JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
            usuario.setPartidasGanadas(1);
            ganador = true;
        } else {
            ganador = false;
        }
        return ganador;
    }
}
