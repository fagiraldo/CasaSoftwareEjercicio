/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.LenguajeExcepcion;
import excepciones.NombreExcepcion;
import excepciones.SalarioExcepcion;
import java.util.ArrayList;

/**
 *
 * @author Profe
 */
public class Lider extends Programador{
    private ArrayList<Programador> equipo;
    
    public Lider(int id, String nombre, double salario, String lenguaje) 
            throws NombreExcepcion, SalarioExcepcion, LenguajeExcepcion {
        super(id, nombre, salario, lenguaje);
        this.equipo= new ArrayList<>();
    }

    public ArrayList<Programador> getEquipo() {
        return equipo;
    }
    
    
    public void adicionarProgramador (Programador programador){
      this.equipo.add(programador);
    }
   
    @Override
    public double calcularSalario(){
      double salarioTotal = super.calcularSalario();
      salarioTotal+=(salarioTotal*(this.equipo.size()*0.1));
      return salarioTotal;
    }
    @Override
    public String mostrarInformacion(){
       String informacion = super.mostrarInformacion();
       informacion+=" -- Equipo ---\n";
        for (Programador programador : equipo) {
            informacion += " " + programador.mostrarInformacion();
        }
        return informacion;
    }
}
