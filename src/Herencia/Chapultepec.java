/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {
   
    
public static void main(String[] args ){
    
    //Vamos a crear Animalitos
    Pollo P1=new Pollo();
    P1.setNombre("Pollito Pio");
    
    Leon L1=new Leon();
    L1.setNombre("Timba");
    
    Leon L2=new Leon();
    L1.setNombre("Mu-fa-sa");
    
    Delfin D1=new Delfin();
    D1.setNombre("Flipper");
    
    Perro G1=new Perro();
    G1.setNombre("Petite");
 
    ComportamientoRuido animales[]=new ComportamientoRuido[5];
    animales[0]=P1;
    animales[1]=L1;
    animales[2]=L2;
    animales[3]=D1;
    animales[4]=G1;
    
  for(ComportamientoRuido algo:animales) {
           
         System.out.println(algo.hacerRuido());
        }
 
}
    
    
    
  //  Animal raro=new Animal();
    //       raro.setEdad(2);
      //     raro.setNombre("Rareza");
   //  Tortuga animal1=new Tortuga ();
     //      animal1.setNombre("Japonesa");
       //    animal1.setEdad(12);
     //Leon animal2=new Leon ();
       //    animal2.setNombre("Africano");
         //  animal2.setEdad(20);
           
          
} 

