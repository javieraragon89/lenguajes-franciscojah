/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfaceImc {
    
    public static void main(String []oso){
                  
       Imc imc=new Imc(80,1.67f);
       imc.setpeso(90);
       
       System.out.println( imc.calcular());
       System.out.println(imc.getpeso());
    
       //Primitivos Integrales
       byte b=2;//solo contiene del 0 al 128
       short s=2;
       int i=2;
       long l=2;
       
     
       
       b=(byte)s;//Castung Forzado.
       s=b;
       i=(int)l;//Castung Forzado.
       i=s;
       s=(short)i;//Castung Forzado.
       
       
       float f=2.0f;
       double d=2.0;
       
       
       boolean valor=false; //Defecto es False
       
      Imc otro=new Imc();
      otro.setFlaco(true);
      System.out.print(otro.isFlaco());
      
       
       
    
    } 
}
