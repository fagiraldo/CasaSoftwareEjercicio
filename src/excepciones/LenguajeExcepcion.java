/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Profe
 */
public class LenguajeExcepcion extends Exception{
    public LenguajeExcepcion(){
     super("Lenguaje debe ser diferente a GO");
    }
}
