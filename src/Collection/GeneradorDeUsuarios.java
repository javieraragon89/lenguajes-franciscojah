/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;


import java.util.ArrayList; 
import java.util.List; 



/**
 *
 * @author T-107
 */
public class GeneradorDeUsuarios {

    
         private List<Usuario> usuarios; 
     
     public GeneradorDeUsuarios(){ 
         Usuario u1=new Usuario("Javier", 20, "javier_89aragón@hotmail.com"); 
         Usuario u2=new Usuario("Abu", 21, "yosoyabu.freeman@hotmail.com"); 
         Usuario u3=new Usuario("Juanito", 19, "juanito@hotmail.com"); 
         Usuario u4=new Usuario("Mario", 50, "mario@hotmail.com");  
         usuarios=new  ArrayList<Usuario>(); 
         usuarios.add(u1);
         usuarios.add(u2);
         usuarios.add(u3);
         usuarios.add(u4);   
     
     
     }
 
     public List<Usuario> getUsuarios() { 
         return usuarios; 
     } 
 
 
     public void setUsuarios(List<Usuario> usuarios) { 
         this.usuarios = usuarios; 
     } 

    public  String agregarUsuario(String nombre, int edad, String email){
        Usuario u=new Usuario(nombre, edad, email);
        usuarios.add(u);
        return "usuario agregado con exito";
        
        
        
    }
    
    
    
    
    
}
