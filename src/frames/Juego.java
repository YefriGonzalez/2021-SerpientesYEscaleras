package frames;

import static frames.PrincipalFrame.dadojLabel;
import static frames.PrincipalFrame.girarDadotJButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private int posicionXJ1 = 5;
    private int posicionYJ1 = 7;
    private int posicionXJ2 = 5;
    private int posicionYJ2 = 7;
    private int posicionXJ3 = 5;
    private int posicionYJ3 = 7;
    private int posicionXJ4 = 5;
    private int posicionYJ4 = 7;
    private int posicionXJ5 = 5;
    private int posicionYJ5 = 7;
    private int posicionXJ6 = 5;
    private int posicionYJ6 = 7;
    private boolean turnoDisponible;
    int contadorj1;
    int contadorj2;
    int contadorj3;
    int contadorj4;
    int contadorj5;
    int contadorj6;

    /**
     * Constructor de la clase Juego, inicializa las posisciones de las fihcas
     * en x y y e inicializa arrayLista de usuarios y fichas para jugadores
     */
    public Juego() {
        usuarios = new ArrayList<>();
        fichas = new ArrayList<>();
    }

    /**
     *
     * @param usuario recibe el parametro usuarioa de la clase PrincipalFrame,
     * cuando se pide el nombre y cantidad de jugadores
     * @param ficha recible un JLabel para poder tener el usuarioa y la ficha en
     * un mismo indice de los ArrayList
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
        turnoDisponible = true;
        girarDadotJButton.setEnabled(true);
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
     *
     * @param usuario Recibie como parametro un usuario para ir mostrando el
     * nombre y las instrucciones
     * @param ficha recibe como parametro un label para ir moviendo la ficha
     */
    public int turnoJugador1(Usuario usuario, JLabel ficha) {
        contadorj1 = 0;
        turnoDisponible = false;
        girarDadotJButton.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        if (contadorj1 == 0) {
            girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    ImagenesDados imagenDado = new ImagenesDados();
                    PrincipalFrame.detenerDadoJButton.setEnabled(true);
                    girarDadotJButton.setEnabled(false);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });

            PrincipalFrame.detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    int dados = dado.tirarNumero();
                    ImagenesDados imagenDado = new ImagenesDados();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    PrincipalFrame.detenerDadoJButton.setEnabled(false);
                    if (posicionXJ1 == 0 && posicionYJ1 < dados) {
                        posicionYJ1 = 0;
                        ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].add(ficha);
                        JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
                        usuario.setPartidasGanadas(usuario.getPartidasGanadas() + 1);
                        ganador = true;
                    }
                    if (posicionYJ1 < dados) {
                        posicionXJ1 -= 1;
                        posicionYJ1 = (8 - (dados - posicionYJ1));
                        ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].add(ficha);
                    } else {
                        posicionYJ1 -= dados;
                        ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].add(ficha);
                    }
                    turnoDisponible = false;
                    girarDadotJButton.setEnabled(true);
                }
            });
            return 0;
        }
        return 0;
    }

    /**
     * Metodo Tunro jugador 2
     *
     * @param usuario Recibie como parametro un usuario para ir mostrando el
     * nombre y las instrucciones
     * @param ficha recibe como parametro un label para ir moviendo la ficha
     */
    public int turnoJugador2(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        girarDadotJButton.setEnabled(true);

        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                ImagenesDados imagenDado = new ImagenesDados();
                PrincipalFrame.detenerDadoJButton.setEnabled(true);
                dadojLabel.setIcon(imagenDado.gifDado());
            }

        });

        PrincipalFrame.detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                Dado dado = new Dado();
                //ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                PrincipalFrame.detenerDadoJButton.setEnabled(false);
                if (posicionXJ2 == 0 && posicionYJ2 < dados) {
                    posicionYJ2 = 0;
                    ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].add(ficha);
                    JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
                    usuario.setPartidasGanadas(usuario.getPartidasGanadas() + 1);
                    ganador = true;
                }
                if (posicionYJ2 < dados) {
                    posicionXJ2 -= 1;
                    posicionYJ2 = (8 - (dados - posicionYJ2));
                    ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].add(ficha);
                } else {
                    posicionYJ1 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].add(ficha);

                }
                turnoDisponible = true;
                girarDadotJButton.setEnabled(true);
                contadorj2 = 1;
            }
        });
        return 0;
    }

    /**
     * Metodo Tunro jugador 3
     *
     * @param usuario Recibie como parametro un usuario para ir mostrando el
     * nombre y las instrucciones
     * @param ficha recibe como parametro un label para ir moviendo la ficha
     */
    public void turnoJugador3(Usuario usuario, JLabel ficha) {
        girarDadotJButton.setEnabled(true);
        turnoDisponible = false;

        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                ImagenesDados imagenDado = new ImagenesDados();
                PrincipalFrame.detenerDadoJButton.setEnabled(true);
                dadojLabel.setIcon(imagenDado.gifDado());
                girarDadotJButton.setEnabled(true);
            }

        });

        PrincipalFrame.detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                Dado dado = new Dado();
                //ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                if (posicionXJ3 == 0 && posicionYJ3 < dados) {
                    posicionYJ3 = 0;
                    ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].add(ficha);
                    JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
                    usuario.setPartidasGanadas(usuario.getPartidasGanadas() + 1);
                    ganador = true;
                }
                PrincipalFrame.detenerDadoJButton.setEnabled(false);
                if (posicionYJ3 < dados) {
                    posicionXJ3 -= 1;
                    posicionYJ3 = (8 - (dados - posicionYJ3));
                    ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].add(ficha);
                } else {
                    posicionYJ3 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].add(ficha);
                }
            }
        });
        turnoDisponible = true;
        girarDadotJButton.setEnabled(true);
    }

    /**
     * Metodo Tunro jugador 4
     *
     * @param usuario Recibie como parametro un usuario para ir mostrando el
     * nombre y las instrucciones
     * @param ficha recibe como parametro un label para ir moviendo la ficha
     */
    public void turnoJugador4(Usuario usuario, JLabel ficha) {
        contadorj4 = 0;
        turnoDisponible = false;
        girarDadotJButton.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                ImagenesDados imagenDado = new ImagenesDados();
                PrincipalFrame.detenerDadoJButton.setEnabled(true);
                dadojLabel.setIcon(imagenDado.gifDado());
            }

        });

        PrincipalFrame.detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                Dado dado = new Dado();
                //ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                PrincipalFrame.detenerDadoJButton.setEnabled(false);
                if (posicionXJ4 == 0 && posicionYJ4 < dados) {
                    posicionYJ4 = 0;
                    ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].add(ficha);
                    JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
                    usuario.setPartidasGanadas(usuario.getPartidasGanadas() + 1);
                    ganador = true;
                }
                if (posicionYJ4 < dados) {
                    posicionXJ4 -= 1;
                    posicionYJ4 = (8 - (dados - posicionYJ4));
                    ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].add(ficha);
                } else {
                    posicionYJ4 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].add(ficha);
                }

            }
        });
        turnoDisponible = true;
        girarDadotJButton.setEnabled(true);
    }

    /**
     * Metodo Tunro jugador 5
     *
     * @param usuario Recibie como parametro un usuario para ir mostrando el
     * nombre y las instrucciones
     * @param ficha recibe como parametro un label para ir moviendo la ficha
     */
    public void turnoJugador5(Usuario usuario, JLabel ficha) {
        contadorj5 = 0;
        turnoDisponible = false;
        girarDadotJButton.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                ImagenesDados imagenDado = new ImagenesDados();
                PrincipalFrame.detenerDadoJButton.setEnabled(true);
                dadojLabel.setIcon(imagenDado.gifDado());
            }

        });
        PrincipalFrame.detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                Dado dado = new Dado();
                //ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                PrincipalFrame.detenerDadoJButton.setEnabled(false);
                if (posicionXJ5 == 0 && posicionYJ5 < dados) {
                    posicionYJ5 = 0;
                    ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].add(ficha);
                    JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
                    usuario.setPartidasGanadas(usuario.getPartidasGanadas() + 1);
                    ganador = true;
                }
                if (posicionYJ5 < dados) {
                    posicionXJ5 -= 1;
                    posicionYJ5 = (8 - (dados - posicionYJ5));
                    ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].add(ficha);
                } else {
                    posicionYJ5 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].add(ficha);
                }
            }
        });
        turnoDisponible = true;
        girarDadotJButton.setEnabled(true);
        contadorj5 = 1;
    }

    /**
     * Metodo Tunro jugador 5
     *
     * @param usuario Recibie como parametro un usuario para ir mostrando el
     * nombre y las instrucciones
     * @param ficha recibe como parametro un label para ir moviendo la ficha
     */
    public void turnoJugador6(Usuario usuario, JLabel ficha) {
        contadorj6 = 0;
        turnoDisponible = false;
        girarDadotJButton.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                ImagenesDados imagenDado = new ImagenesDados();
                PrincipalFrame.detenerDadoJButton.setEnabled(true);
                dadojLabel.setIcon(imagenDado.gifDado());
            }

        });
        PrincipalFrame.detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                //ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].remove(ficha);
                Dado dado = new Dado();
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                if (posicionXJ6 == 0 && posicionYJ6 < dados) {
                    posicionYJ6 = 0;
                    ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].add(ficha);
                    JOptionPane.showMessageDialog(null, "Ganador: " + usuario.getNombre());
                    usuario.setPartidasGanadas(usuario.getPartidasGanadas() + 1);
                    ganador = true;
                }
                PrincipalFrame.detenerDadoJButton.setEnabled(false);
                if (posicionYJ6 < dados) {
                    posicionXJ6 -= 1;
                    posicionYJ6 = (8 - (dados - posicionYJ6));
                    ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].add(ficha);
                } else {
                    posicionYJ6 -= dados;
                    ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].add(ficha);
                }
            }
        });
        turnoDisponible = true;
        girarDadotJButton.setEnabled(true);
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
     *
     * @param ficha recibe como parametro un label para evaluarla si llego a la
     * posicio 0,0
     * @param usuario recibe el usuario si llego a 0,0 usar el
     * setPartidasGanadas e incrementa
     * @return regresa un boolean ganador para termina el while de jugar
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
