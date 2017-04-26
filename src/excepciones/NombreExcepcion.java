/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;


public class NombreExcepcion extends Exception{
    public NombreExcepcion(){
     super("Nombre debe tener 10 Caracteres");
    }
}
