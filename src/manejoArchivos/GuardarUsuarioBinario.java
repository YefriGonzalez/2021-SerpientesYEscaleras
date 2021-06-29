package manejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import usuario.Usuario;

/**
 *
 * @author yefri1000
 */
public class GuardarUsuarioBinario {
    
    public static final File ARCHIVOUSUARIO = new File("Usuarios");
    
    /**
     * metodo GuarddarUsuario
     * @param usuarios recibe un arrayList de usuarios y los guarda en archivos binario
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public void guardarUsuario(ArrayList<Usuario> usuarios) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;
        ObjectOutputStream objetoSalida;
        for (Usuario usuario : usuarios) {//indicamos que recorreremos un pasaporte, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(ARCHIVOUSUARIO+"/"+usuario.getNombre());//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(usuario);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
    
    /**
     * MetodoTablaUusarios
     * @param usuarios recibe los usuarios recibidos de los binarios
     * @param tabla muestra los usuarios en una tabla en la ventana de reportes
     */
    
    public static void tablaUsuarios(ArrayList<Usuario> usuarios,JTable tabla){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Partidas Jugadas");
        modeloTabla.addColumn("Partidas Ganadas");
        modeloTabla.addColumn("Partidas Perdidas");
        for (Usuario usuario: usuarios) {
            modeloTabla.addRow(new Object[]{usuario.getId(),usuario.getNombre(),usuario.getApellido(),usuario.getPartidasJugadas(),usuario.getPartidasGanadas(),usuario.getPartidasPerdidas()});
        }
    }
    
}
