/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author Emilia
 */
public class ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        
        Scanner input = new Scanner (System.in);
        

        System.out.println("Enter two numbers");                
        operand1= input.nextFloat();
        operand2=input.nextFloat();
        
         System.out.println("ADDITION");
         result= BasicOperation.addTwoNumbers(operand1, operand2);
         System.out.println(operand1 + " + " + operand2 + " = " +result);
         
        System.out.println("---SUBTRACTION---");
        result= BasicOperation.substractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " +result);
                
        System.out.println("---MULTYPLICATION---");
        result= BasicOperation.multiplicateTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " +result);
        
        System.out.println("---DIVISION---");
        result= BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " +result);
        
    }
    
}
