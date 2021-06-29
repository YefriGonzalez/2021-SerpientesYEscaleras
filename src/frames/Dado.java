/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author yefri1000
 */
public class Dado {
    private int valor;
    
    /**
        *funcion  tirarNuemro
        *crea un random de 1 a 6 y devuelve el malor
    */
    public int tirarNumero(){
        valor=(int)(Math.random()*(6-1)+1);
            return valor;
    }
    
}
