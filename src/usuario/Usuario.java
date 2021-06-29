
package usuario;

import java.io.Serializable;

/**
 *
 * @author yefri1000
 */
public class Usuario implements Serializable{
    private String nombre;
    private String apellido;
    private int id;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
   

    /**
     * Constructor que recibe parametros para crear un nuevo usuario
     * @param nombre
     * @param apellido
     * @param id
     * @param partidasJugadas
     * @param partidasGanadas
     * @param partidasPerdidas 
     */
    public Usuario(String nombre, String apellido, int id,int partidasJugadas,int partidasGanadas,int partidasPerdidas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.partidasJugadas=partidasJugadas;
        this.partidasGanadas=partidasGanadas;
        this.partidasPerdidas=partidasPerdidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
     @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", partidasJugadas=" + partidasJugadas + ", partidasGanadas=" + partidasGanadas + ", partidasPerdidas=" + partidasPerdidas + '}';
    }
}
