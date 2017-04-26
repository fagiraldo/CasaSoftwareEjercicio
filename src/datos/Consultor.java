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
public class Consultor implements Contrato{
    protected int id;
    protected String labor;

    public Consultor(int id, String labor) {
        this.id = id;
        this.labor = labor;
    }

    
    public int getId() {
        return id;
    }

    public String getLabor() {
        return labor;
    }
    
    
    @Override
    public double calcularSalario() {
        return 100;
    }

    @Override
    public String mostrarInformacion() {
        return "Consultor"  + this.id + " " + this.labor;
    }
    
}
