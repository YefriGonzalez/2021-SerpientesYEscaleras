package manejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import usuario.Tablero;

/**
 *
 * @author yefri1000
 */
public class LectorTableroEnTexto {

    private int[][] filasColumnas;
    private int[][] pierdeTurno;
    private int[][] tiraDados;
    private int[][] avanza;
    private int[][] retrocede;
    private int cantPosicionesAvanza;
    private int cantPosicionesRetrocede;
    private int[][] filaColumnaInicialSubida;
    private int[][] filaColumnaFinalSubida;
    private int[][] filaColumnaInicialRetroceso;
    private int[][] filaColumnaFinalRetroceso;
    Tablero tablero;

    public Tablero leerTexto(File Archivo) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(Archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            try {
                separarCampos(linea);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tablero = new Tablero(filasColumnas, pierdeTurno, tiraDados, avanza, retrocede, cantPosicionesAvanza, cantPosicionesRetrocede, filaColumnaInicialSubida, filaColumnaFinalSubida, filaColumnaInicialRetroceso, filaColumnaFinalRetroceso);
        System.out.println(tablero.toString());
        return tablero;
    }

    public void separarCampos(String linea) {
        String inicioTablero = "tablero(";
        String inicioPierdeTurno = "pierdeturno(";
        String inicioTiraDados = "tiradados(";
        String inicioAvanza = "avanza(";
        String inicioRetrocede = "retrocede(";
        String inicioSubida = "subida(";
        String inicioBajada = "bajada(";

        if (linea.contains(inicioTablero)) {
            String lineaDeCampos = linea.substring(inicioTablero.length(), linea.length() - 2);
            String[] campos1 = lineaDeCampos.split(",");
            filasColumnas = new int[Integer.valueOf(campos1[0])][Integer.valueOf(campos1[1])];
        }

        if (linea.contains(inicioPierdeTurno)) {
            String lineaDeCampos = linea.substring(inicioPierdeTurno.length(), linea.length() - 2);
            String[] campos = lineaDeCampos.split(",");
            pierdeTurno = new int[Integer.valueOf(campos[0])][Integer.valueOf(campos[1])];
        }

        if (linea.contains(inicioTiraDados)) {
            String lineaDeCampos = linea.substring(inicioTiraDados.length(), linea.length() - 2);
            String[] campos = lineaDeCampos.split(",");
            tiraDados = new int[Integer.valueOf(campos[0])][Integer.valueOf(campos[1])];
        }

        if (linea.contains(inicioAvanza)) {
            String lineaDeCampos = linea.substring(inicioAvanza.length(), linea.length() - 2);
            String[] campos = lineaDeCampos.split(",");
            avanza = new int[Integer.valueOf(campos[0])][Integer.valueOf(campos[1])];
            cantPosicionesAvanza = Integer.valueOf(campos[2]);
        }

        if (linea.contains(inicioRetrocede)) {
            String lineaDeCampos = linea.substring(inicioRetrocede.length(), linea.length() - 2);
            String[] campos = lineaDeCampos.split(",");
            retrocede = new int[Integer.valueOf(campos[0])][Integer.valueOf(campos[1])];
            cantPosicionesRetrocede = Integer.valueOf(campos[2]);
        }
        if (linea.contains(inicioSubida)) {
            String lineaDeCampos = linea.substring(inicioSubida.length(), linea.length() - 2);
            String[] campos = lineaDeCampos.split(",");
            filaColumnaInicialSubida = new int[Integer.valueOf(campos[0])][Integer.valueOf(campos[1])];
            filaColumnaFinalSubida = new int[Integer.valueOf(campos[2])][Integer.valueOf(campos[3])];
        }
        if (linea.contains(inicioBajada)) {
            String lineaDeCampos = linea.substring(inicioBajada.length(), linea.length() - 2);
            String[] campos = lineaDeCampos.split(",");
            filaColumnaInicialRetroceso = new int[Integer.valueOf(campos[0])][Integer.valueOf(campos[1])];
            filaColumnaFinalRetroceso = new int[Integer.valueOf(campos[2])][Integer.valueOf(campos[3])];
        } 
        linea.contentEquals(inicioAvanza);
    }

}
