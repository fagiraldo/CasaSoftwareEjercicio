/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Profe
 */
public class CasaSoftware {
    private ArrayList<Contrato> contratos;

    public CasaSoftware() {
        this.contratos = new ArrayList<>();
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }
    
    
    public void adicionarContrato(Contrato contrato){
      this.contratos.add(contrato);
    }
    
    public double calcularSalarioTotal(){
        double salarioTotal = 0;
        for (Contrato contrato : contratos) {
            salarioTotal+=contrato.calcularSalario();
        }
        return salarioTotal;
    }
    
    public String mostrarInformacion(){
      String informacion ="";
        for (Contrato contrato : contratos) {
            informacion+= " " + contrato.mostrarInformacion();
        }
        return informacion;
    }
   
    
    
}
