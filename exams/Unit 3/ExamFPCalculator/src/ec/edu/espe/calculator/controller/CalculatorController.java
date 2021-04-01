/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Calculator;
import utils.FileManagers;

/**
 *
 * @author Emilia
 */
public class CalculatorController {

    public static void save(ec.edu.espe.calculator.view.Calculator calculator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void save(Calculator Calculator){
      String data=Calculator.getBrand() + " ; " + Calculator.getColor() + " ;" + Calculator.getIsModern()+ " ; " + Calculator.getNumberOfKeys() + " ; " + Calculator.getScreenLenght();
      FileManagers.save(data, "calculator");
    }
    public String read(){
        String data;
        data= FileManagers.read("Calculator");
        return data;
    }
}
    
    
    
 
