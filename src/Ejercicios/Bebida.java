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
public class Bebida {
    
    String tipo;
    String [] bebidas;

    public String[] obtenerRecomendaciones(){
        if(tipo.equals("alcoholicas")){ /// equals compara contenido
        
        String [] alcohol={"Cerveza Sol","Cerveza Indio","Whisky","Pulque","Tonaya"};
    return alcohol;
        }
    
    else{
        String [] sinalcohol={"Agua","Coca-cola","Pepsi","Agua Mineral","Red-bull"};
    return sinalcohol;
}
}
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      
}
