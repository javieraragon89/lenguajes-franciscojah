/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrencia;

/**
 *
 * @author T-107
 */
public class TercerThread extends Thread{
 public void run (){
    while(true){
        
        try{
        Thread.sleep(1000);  
        System.out.println("YO SOY EL TERCER THREAD");
    }catch(InterruptedException e){
        
    }
    }//Se cierra el while
    }    
}
