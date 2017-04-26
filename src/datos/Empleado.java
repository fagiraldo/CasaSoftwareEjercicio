/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.NombreExcepcion;
import excepciones.SalarioExcepcion;

/**
 *
 * @author Profe
 */
public abstract class Empleado implements Contrato{
    protected int id;
    protected String nombre;
    protected double salario;

    public Empleado(int id, String nombre, double salario) 
            throws NombreExcepcion, SalarioExcepcion {
        if(nombre.length() <= 10)
            throw new NombreExcepcion();
        
        if(salario < 737000)
           throw new SalarioExcepcion();
        
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
