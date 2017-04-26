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
public class Admon extends Empleado{

    public Admon(int id, String nombre, double salario) 
            throws NombreExcepcion, SalarioExcepcion {
        super(id, nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String mostrarInformacion() {
        return "Admon "  + this.nombre + " " + this.id;
    }
    
}
