/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datos.CasaSoftware;
import java.io.FileNotFoundException;

/**
 *
 * @author Profe
 */
public interface CasaSoftwareDB {
    public void escribir(CasaSoftware cs) 
            throws FileNotFoundException;
    public CasaSoftware leer();
}
