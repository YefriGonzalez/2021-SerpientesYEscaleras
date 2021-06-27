
package manejoArchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import usuario.Usuario;

/**
 *
 * @author yefri1000
 */
public class CargarUsuarioBInario {
    public ArrayList<Usuario> cargarUsuarioBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Usuario> usuarios = new ArrayList<>();//indicamos un array list de pasaporte para leer los archivos
        String[] archivos=GuardarUsuarioBinario.ARCHIVOUSUARIO.list();
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarUsuarioBinario.ARCHIVOUSUARIO+"/"+archivo));
            Usuario user =((Usuario)leerArchivo.readObject());//leemos el objeto y lo casteamos a Usuario
            usuarios.add(user);//añadimos un usuario
            leerArchivo.close();//cerramos el lector
        }
        return usuarios;
    }
}
