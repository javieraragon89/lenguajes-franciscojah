/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author T-107
 */
public class Usuario {
    private String nombre; 
     private Integer edad; 
     private String email; 
     
    public Usuario(String nombre, int edad, String email) { 
         this.nombre = nombre; 
         this.edad = edad; 
         this.email = email; 
     } 
 
 
     public String getEmail() { 
         return email; 
     } 
 
 
     public void setEmail(String email) { 
         this.email = email; 
     } 
 
 
     public String getNombre() { 
         return nombre; 
     } 
 
 
     public void setNombre(String nombre) { 
         this.nombre = nombre; 
     } 
 
 
     public Integer getEdad() { 
         return edad; 
     } 
 
 
     public void setEdad(Integer edad) { 
         this.edad = edad; 
     } 

    String getedad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getemail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      

}
