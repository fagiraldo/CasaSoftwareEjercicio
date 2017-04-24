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
public class SalarioExcepcion extends Exception{
    public SalarioExcepcion(){
      super("Salario debe ser mayor al minimo");
    }
}
