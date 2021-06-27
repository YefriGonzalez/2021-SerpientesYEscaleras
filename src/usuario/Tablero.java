
package usuario;

/**
 *
 * @author yefri1000
 */
public class Tablero {
        int[][] filasColumnas;
        int[][] pierdeTurno;
        int[][] tiraDados;
        int[][] avanza;
        int[][] retrocede;
        int cantPosicionesAvanza;
        int cantPosicionesRetrocede;
        int[][] filaColumnaInicialSubida;
        int[][] filaColumnaFinalSubida;
        int[][] filaColumnaInicialRetroceso;
        int[][] filaColumnaFinalRetroceso;

    public Tablero(int[][] filasColumnas, int[][] pierdeTurno, int[][] tiraDados, int[][] avanza, int[][] retrocede, int cantPosicionesAvanza, int cantPosicionesRetrocede, int[][] filaColumnaInicialSubida, int[][] filaColumnaFinalSubida, int[][] filaColumnaInicialRetroceso, int[][] filaColumnaFinalRetroceso) {
        this.filasColumnas = filasColumnas;
        this.pierdeTurno = pierdeTurno;
        this.tiraDados = tiraDados;
        this.avanza = avanza;
        this.retrocede = retrocede;
        this.cantPosicionesAvanza = cantPosicionesAvanza;
        this.cantPosicionesRetrocede = cantPosicionesRetrocede;
        this.filaColumnaInicialSubida = filaColumnaInicialSubida;
        this.filaColumnaFinalSubida = filaColumnaFinalSubida;
        this.filaColumnaInicialRetroceso = filaColumnaInicialRetroceso;
        this.filaColumnaFinalRetroceso = filaColumnaFinalRetroceso;
    }

    public int[][] getFilasColumnas() {
        return filasColumnas;
    }

    public int[][] getPierdeTurno() {
        return pierdeTurno;
    }

    public int[][] getTiraDados() {
        return tiraDados;
    }

    public int[][] getAvanza() {
        return avanza;
    }

    public int[][] getRetrocede() {
        return retrocede;
    }

    public int getCantPosicionesAvanza() {
        return cantPosicionesAvanza;
    }

    public int getCantPosicionesRetrocede() {
        return cantPosicionesRetrocede;
    }

    public int[][] getFilaColumnaInicialSubida() {
        return filaColumnaInicialSubida;
    }

    public int[][] getFilaColumnaFinalSubida() {
        return filaColumnaFinalSubida;
    }

    public int[][] getFilaColumnaInicialRetroceso() {
        return filaColumnaInicialRetroceso;
    }

    public int[][] getFilaColumnaFinalRetroceso() {
        return filaColumnaFinalRetroceso;
    }

    @Override
    public String toString() {
        return "Tablero{" + "filasColumnas=" + filasColumnas + ", pierdeTurno=" + pierdeTurno + ", tiraDados=" + tiraDados + ", avanza=" + avanza + ", retrocede=" + retrocede + ", cantPosicionesAvanza=" + cantPosicionesAvanza + ", cantPosicionesRetrocede=" + cantPosicionesRetrocede + ", filaColumnaInicialSubida=" + filaColumnaInicialSubida + ", filaColumnaFinalSubida=" + filaColumnaFinalSubida + ", filaColumnaInicialRetroceso=" + filaColumnaInicialRetroceso + ", filaColumnaFinalRetroceso=" + filaColumnaFinalRetroceso + '}';
    }

   
    
    
    
}
