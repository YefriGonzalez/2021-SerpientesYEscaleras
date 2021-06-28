package usuario;

/**
 *
 * @author yefri1000
 */
public class Tablero {

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

    public Tablero(int filas, int columnas, int filaPierdeTurno, int columnaPierdeTurno, int filaTiraDados, int columnaTiraDados, int filaAvanza, int columnaAvanza, int cantPosicionesAvanza, int filaRetrocede, int columnaRetrocede, int cantPosicionesRetrocede, int filaInicialSubida, int columnaInicialSubida, int filaFinalSubida, int columnaFinalSubida, int filaInicialRetroceso, int columnaInicialRetroceso, int filaFinalRetroceso, int columnaFinalRetroceso) {
        this.filas = filas;
        this.columnas = columnas;
        this.filaPierdeTurno = filaPierdeTurno;
        this.columnaPierdeTurno = columnaPierdeTurno;
        this.filaTiraDados = filaTiraDados;
        this.columnaTiraDados = columnaTiraDados;
        this.filaAvanza = filaAvanza;
        this.columnaAvanza = columnaAvanza;
        this.cantPosicionesAvanza = cantPosicionesAvanza;
        this.filaRetrocede = filaRetrocede;
        this.columnaRetrocede = columnaRetrocede;
        this.cantPosicionesRetrocede = cantPosicionesRetrocede;
        this.filaInicialSubida = filaInicialSubida;
        this.columnaInicialSubida = columnaInicialSubida;
        this.filaFinalSubida = filaFinalSubida;
        this.columnaFinalSubida = columnaFinalSubida;
        this.filaInicialRetroceso = filaInicialRetroceso;
        this.columnaInicialRetroceso = columnaInicialRetroceso;
        this.filaFinalRetroceso = filaFinalRetroceso;
        this.columnaFinalRetroceso = columnaFinalRetroceso;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getFilaPierdeTurno() {
        return filaPierdeTurno;
    }

    public int getColumnaPierdeTurno() {
        return columnaPierdeTurno;
    }

    public int getFilaTiraDados() {
        return filaTiraDados;
    }

    public int getColumnaTiraDados() {
        return columnaTiraDados;
    }

    public int getFilaAvanza() {
        return filaAvanza;
    }

    public int getColumnaAvanza() {
        return columnaAvanza;
    }

    public int getCantPosicionesAvanza() {
        return cantPosicionesAvanza;
    }

    public int getFilaRetrocede() {
        return filaRetrocede;
    }

    public int getColumnaRetrocede() {
        return columnaRetrocede;
    }

    public int getCantPosicionesRetrocede() {
        return cantPosicionesRetrocede;
    }

    public int getFilaInicialSubida() {
        return filaInicialSubida;
    }

    public int getColumnaInicialSubida() {
        return columnaInicialSubida;
    }

    public int getFilaFinalSubida() {
        return filaFinalSubida;
    }

    public int getColumnaFinalSubida() {
        return columnaFinalSubida;
    }

    public int getFilaInicialRetroceso() {
        return filaInicialRetroceso;
    }

    public int getColumnaInicialRetroceso() {
        return columnaInicialRetroceso;
    }

    public int getFilaFinalRetroceso() {
        return filaFinalRetroceso;
    }

    public int getColumnaFinalRetroceso() {
        return columnaFinalRetroceso;
    }

    @Override
    public String toString() {
        return "Tablero{" + "filas=" + filas + ", columnas=" + columnas + ", filaPierdeTurno=" + filaPierdeTurno + ", columnaPierdeTurno=" + columnaPierdeTurno + ", filaTiraDados=" + filaTiraDados + ", columnaTiraDados=" + columnaTiraDados + ", filaAvanza=" + filaAvanza + ", columnaAvanza=" + columnaAvanza + ", cantPosicionesAvanza=" + cantPosicionesAvanza + ", filaRetrocede=" + filaRetrocede + ", columnaRetrocede=" + columnaRetrocede + ", cantPosicionesRetrocede=" + cantPosicionesRetrocede + ", filaInicialSubida=" + filaInicialSubida + ", columnaInicialSubida=" + columnaInicialSubida + ", filaFinalSubida=" + filaFinalSubida + ", columnaFinalSubida=" + columnaFinalSubida + ", filaInicialRetroceso=" + filaInicialRetroceso + ", columnaInicialRetroceso=" + columnaInicialRetroceso + ", filaFinalRetroceso=" + filaFinalRetroceso + ", columnaFinalRetroceso=" + columnaFinalRetroceso + '}';
    }

    
}
