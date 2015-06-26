/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author T-107
 */
public class Antro {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        
        Bebida bebida=new  Bebida();
        bebida.setTipo("alcoholicas");
        String []reco= bebida.obtenerRecomendaciones();
        for(String be:reco){
        System.out.println("Bebida"+be);
    }
        
        // TODO code application logic here
    }
    
}
