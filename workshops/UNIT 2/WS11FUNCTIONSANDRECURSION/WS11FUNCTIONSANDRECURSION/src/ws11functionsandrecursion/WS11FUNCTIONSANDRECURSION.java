/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11functionsandrecursion;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class WS11FUNCTIONSANDRECURSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DONE
        Scanner input = new Scanner(System.in); 
        int divd;
        int divr;
        float quotient;
        int result;
        int argument;
        int ensue;
        int product;
        int multiplier=1;
        int multiplicand;
        int stop=12;
        System.out.println("|||| F U N C T I O N S ||||");
        System.out.println("==========================="); 
        System.out.println("Enter a number for dividend ");
        divd= input.nextInt();
        System.out.println("Enter a number for divisor");
        divr= input.nextInt();
        quotient = divideTwoNumbers(divd, divr);
        System.out.println("Quotient of " + divd + " and "+ divr +" is--" + quotient);
        System.out.println("==========================================================");
        
        
         System.out.println("Enter a number for the square ");
         argument= input.nextInt();
         result= computeSquare(argument);
        System.out.println("the square of--" +argument+"--is equal to--" +result );
        System.out.println("==========================================================");
        
        System.out.println("Enter a number for composition function");
        argument= input.nextInt();
        ensue= computeParabola(argument);
        System.out.println("the composition function--" +argument+"--is equal to--" +result );
        System.out.println("==========================================================");
         
        int number=5;
        int fact=0;
        fact=factorial(5);
        System.out.println("factorial of" +number+ " is equal to ---" + fact);
        System.out.println("==========================================================");
        System.out.println("Enter a number for the multiplication table");
        multiplicand= input.nextInt();
        System.out.println("The table of " + multiplicand + " is-- ");
        
                for (int i = 1; multiplier <= stop; multiplier++) {
                    product = showTheMultiplicationTables( multiplicand, multiplier);
                    System.out.println(multiplicand + " x " + multiplier + " = " + product);
                   
                }
                System.out.println("==========================================================");
                
       
                      System.out.println(
                    "////////////////////////////////////// " + "\n"
                    + "|| ֍ G O O D  B Y E  D A R L Y I N G ֍ ||" + "\n"
                    + "/////////////////////////////////////");
                  System.out.println("---- E M I L I A  C  A L V A C H E----");
    }

   
    // function definition
    // return data type    name   parameter 1  parameter 2
    public static float divideTwoNumbers(int dividend, int divisor){   
        //body of the function
        float quotient=0.0F;
        
        quotient=(float) dividend/(float)divisor;
        
        return quotient;
    }
    public static int computeSquare(int argument){
        int result=0;
        
        result= argument * argument;
        return result;
    }
    public static int computeParabola(int argument){
        int ensue=0;
        
        ensue= argument * argument + 2 * argument +1;
        
        return ensue;
        
    }  
    public static int showTheMultiplicationTables(int multiplicand, int multiplier){
       int product=0;
       
       product= multiplicand*multiplier;
       
       return product;
    }
      public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
     }
    }
}    
 

