/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

import static java.time.Clock.system;

/**
 *
 * @author Emilia
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int  adden1;
        int adden2;
        
          
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplying;
        int multiplier;
        int product;
        
        int dividend;
        int divisor;
        int quotient;
        
        int base;
        int quantity;
        int percentage;
        
        base = 72;
        quantity = 9;
                
        dividend = 40;
        divisor = 12;
        
        multiplying = 6;
        multiplier = -10;
        
        
        minuend = -23;
        subtrahend= -6;
                
        adden1 = 5;
        adden2 = 18;
        
        sum = adden1 + adden2;
        
        System.out.println(" The addition of " + adden1 + " + " + adden2+ " is equal to -- " +sum);
        
        ++sum;
        System.out.println(" sum is equal to-- "+sum);
        
        sum++;
        System.out.println(" sum is equal to-- "+sum);
        System.out.println(" adding one to sum " + (sum++ ));
        System.out.println(" adding one to sum " + (sum++ ));
        System.out.println(" the subtraction of " + minuend + " - " + subtrahend + " is equal to " + (minuend - subtrahend));
        System.out.println( " the multiplication of " + multiplying + " * " + multiplier + " is equal to " + (multiplying * multiplier));
        System.out.println(" the division of " + dividend + "/" + divisor + " is equal to " + (dividend / divisor));
        System.out.println( " the modulus  of " + quantity + " % " + base + " is equal to " + ( quantity % base) );
        
        
        
        
       
        
        
        
                
        
    }
    
}
