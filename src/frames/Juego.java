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

    /* 
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

    public void registrarJugadores(Usuario usuario, JLabel ficha) {
        usuarios.add(usuario);
        fichas.add(ficha);
    }

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

    public void turnoJugador1(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
        JOptionPane.showMessageDialog(null, "Turno de " + usuario.getNombre() + ", tire dado y parelo");
        girarDadotJButton.setEnabled(true);
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
                posicionYJ1 -= dados;
                ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].add(ficha);
                turnoDisponible = true;
            }
        });
    }

    public void turnoJugador2(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
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
                ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                detenerDadoJButton.setEnabled(false);
                posicionYJ2 -= dados;
                ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].add(ficha);
                turnoDisponible = true;
            }
        });
    }

    public void turnoJugador3(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
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
                ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                detenerDadoJButton.setEnabled(false);
                posicionYJ3 -= dados;
                ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].add(ficha);
                turnoDisponible = true;
            }
        });
    }

    public void turnoJugador4(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
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
                ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                detenerDadoJButton.setEnabled(false);
                posicionYJ4 -= dados;
                ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].add(ficha);
                turnoDisponible = false;
            }
        });

    }

    public void turnoJugador5(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
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
                ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].remove(ficha);
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                detenerDadoJButton.setEnabled(false);
                posicionYJ5 -= dados;
                //posicionYJ5 += ConstructorTablero.getTablero().getFilas();
                ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].add(ficha);
                turnoDisponible = true;
            }
        });

    }

    public void turnoJugador6(Usuario usuario, JLabel ficha) {
        turnoDisponible = false;
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
                ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].remove(ficha);
                Dado dado = new Dado();
                int dados = dado.tirarNumero();
                ImagenesDados imagenDado = new ImagenesDados();
                dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                detenerDadoJButton.setEnabled(false);
                posicionYJ6 -= dados;
                ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].add(ficha);
                turnoDisponible = true;
            }
        });

    }

    public void enviarReportes() {
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).setPartidasJugadas(1);
        }
    }

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
