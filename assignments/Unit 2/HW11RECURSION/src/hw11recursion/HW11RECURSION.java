/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW11RECURSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
         
         Scanner input= new Scanner(System.in);
        int base;
        int exponent;
        System.out.println("Enter a number you want the potenciation");
        base= input.nextInt();
        System.out.println("Enter the exponet");
         exponent= input.nextInt();
         System.out.println("The potenciation is--" +showPotenciation(base, exponent));
        
 
    }
 
    public static double showPotenciation(int base, int exponent) {
 
        if (exponent == 0) { 
            return 1; 
        } else if (exponent == 1) { 
            return base; 
        } else if (exponent < 0) { 
            return showPotenciation(base, exponent + 1) / base;
        } else {  
            return base * showPotenciation(base, exponent - 1);
        }
 
    }
 
}
