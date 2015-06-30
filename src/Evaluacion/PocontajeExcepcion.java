/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

/**
 *
 * @author T-107
 */

public class PocontajeExcepcion extends Exception{
    
    public PocontajeExcepcion (){
       
        super("Tus pocentajes no suman el 100% revisalos");
    }
}