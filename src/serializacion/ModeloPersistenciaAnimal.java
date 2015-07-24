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
import java.io.*;
import java.util.ArrayList;

public class ModeloPersistenciaAnimal {
   
   String ruta="D:\\BASE DE DATOS/animalitos.txt";
    ArrayList<Animal> animales;
    public ModeloPersistenciaAnimal(){
        animales=new ArrayList<>()
    }
    
    
    
    
    
    public void guardar(Animal animal)throws Exception{
        //paso 1 crear el archivo donde se guarda el animal 
        File file =new  File("D:\\BASE DE DATOS/animalitos.txt");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
    }
    
    public Animal buscarTodos()throws  Exception{
    Animal A=new Animal();
    File F=new  File("D:\\BASE DE DATOS/animalitos.txt");
    FileInputStream fis=new ObjectInputStream(f);
    ObjectInputStream ois=new ObjectInputStream(fis);
    animales.add(animal);
    oos.writeObject(animales);
        System.err.println("");
          
   
          
        
     }
    
   public ArrayList<Animal> buscarTodos() throws Exception{
       Animal a=new Animal();
       File f=new File(D:\\BASE DE DATOS/animalitos.txt);
       FileInputStream fis=new ObjectInputStream(f); 
       ObjectInputStream ois=new ObjectInputStream(fis);
       animales=(ArrayList)
   }
    
    
}
