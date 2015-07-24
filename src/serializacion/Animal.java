/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-107
 */
public class Animal {
    
   private String Nombre;
   private boolean  Carnivoro;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean  getCarnivoro() {
        return Carnivoro;
    }

    public void setCarnivoro(boolean Carnivoro) {
        this.Carnivoro = Carnivoro;
    }
   
    
    
}
