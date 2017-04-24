/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Profe
 */
public class Programador extends Empleado{
    protected String lenguaje;

    public Programador(int id, String nombre, double salario,String lenguaje) {
        super(id, nombre, salario);
        this.lenguaje = lenguaje;
    }
    
    @Override
    public double calcularSalario() {
        double bonificacion = 0;
        if(this.lenguaje.equals("java"))
            bonificacion = this.salario *0.2;
        return this.salario + bonificacion;
    }

    @Override
    public String mostrarInformacion() {
       return "Programador " + this.nombre + " " + this.lenguaje;
    }
    
    
}
