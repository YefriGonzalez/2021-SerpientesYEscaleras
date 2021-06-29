package manejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import usuario.*;


/**
 *
 * @author yefri1000
 */
public class LectorTableroEnTexto {

    private int filas;
    private int columnas;
    private int filaPierdeTurno;
    private int columnaPierdeTurno;
    private int filaTiraDados;
    private int columnaTiraDados;
    private int filaAvanza;
    private int columnaAvanza;
    private int cantPosicionesAvanza;
    private int filaRetrocede;
    private int columnaRetrocede;
    private int cantPosicionesRetrocede;
    private int filaInicialSubida;
    private int columnaInicialSubida;
    private int filaFinalSubida;
    private int columnaFinalSubida;
    private int filaInicialRetroceso;
    private int columnaInicialRetroceso;
    private int filaFinalRetroceso;
    private int columnaFinalRetroceso;
    Tablero tablero;

    public void leerTexto(File Archivo) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(Archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine())!=null) {
            try {
                separarCampos(linea);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tablero = new Tablero(filas,columnas,filaPierdeTurno,columnaPierdeTurno,filaTiraDados,columnaTiraDados,filaAvanza,columnaAvanza,cantPosicionesAvanza,filaRetrocede,columnaRetrocede,cantPosicionesRetrocede,filaInicialSubida,columnaInicialSubida,filaFinalSubida,columnaFinalSubida,filaInicialRetroceso,columnaInicialRetroceso,filaFinalRetroceso,columnaFinalRetroceso);
        ConstructorTablero crearTablero=new ConstructorTablero(tablero);
        crearTablero.construirTableroPanel();
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
            String lineaDeCampos = linea.substring(inicioTablero.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filas =Integer.valueOf(campos[0]);
            columnas=Integer.valueOf(campos[1]);
        }

        if (linea.contains(inicioPierdeTurno)) {
            String lineaDeCampos = linea.substring(inicioPierdeTurno.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filaPierdeTurno =Integer.valueOf(campos[0]);
            columnaPierdeTurno= Integer.valueOf(campos[1]);
        }

        if (linea.contains(inicioTiraDados)) {
            String lineaDeCampos = linea.substring(inicioTiraDados.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filaTiraDados =Integer.valueOf(campos[0]);
            columnaTiraDados=Integer.valueOf(campos[1]);
        }

        if (linea.contains(inicioAvanza)) {
            String lineaDeCampos = linea.substring(inicioAvanza.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filaAvanza =Integer.valueOf(campos[0]);
            columnaAvanza=Integer.valueOf(campos[1]);
            cantPosicionesAvanza = Integer.valueOf(campos[2]);
        }

        if (linea.contains(inicioRetrocede)) {
            String lineaDeCampos = linea.substring(inicioRetrocede.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filaRetrocede =Integer.valueOf(campos[0]);
            columnaRetrocede=Integer.valueOf(campos[1]);
            cantPosicionesRetrocede = Integer.valueOf(campos[2]);
        }
        if (linea.contains(inicioSubida)) {
            String lineaDeCampos = linea.substring(inicioSubida.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filaInicialSubida = Integer.valueOf(campos[0]);
            columnaInicialSubida=Integer.valueOf(campos[1]);
            filaFinalSubida =Integer.valueOf(campos[2]);
            columnaFinalSubida=Integer.valueOf(campos[3]);
        }
        if (linea.contains(inicioBajada)) {
            String lineaDeCampos = linea.substring(inicioBajada.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            filaInicialRetroceso = Integer.valueOf(campos[0]);
            columnaInicialRetroceso=Integer.valueOf(campos[1]);
            filaFinalRetroceso =Integer.valueOf(campos[2]);
            columnaFinalRetroceso=Integer.valueOf(campos[3]);
        } 
    }

}
