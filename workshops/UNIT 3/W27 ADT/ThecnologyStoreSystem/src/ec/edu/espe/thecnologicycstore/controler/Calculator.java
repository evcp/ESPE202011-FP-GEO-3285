/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.thecnologicycstore.controler;

import ec.edu.espe.thecnologicycstore.model.calculator;
import utils.FileManager;

/**
 *
 * @author Emilia
 */
public class Calculator {
    public void save(calculator cellphone){
      String data=cellphone.getBrand() + " ; " + cellphone.getColor() + " ;" + cellphone.getRAM() + " ; " + cellphone.isIsNew() + " ; " + cellphone.isIsTactil();
      FileManager.save(data, "cellphones");
    }
    public String read(){
        String data;
        data= FileManager.read("cellphones");
        return data;
    }
}
    
    

