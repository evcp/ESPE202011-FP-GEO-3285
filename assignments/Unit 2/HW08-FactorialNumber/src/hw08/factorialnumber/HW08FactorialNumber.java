/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial =1;
        int number;
        int i=1;
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to factorial");
        number=input.nextInt();
        if (number>15){System.out.println("I can´t factorial this number");}
        else {
        while(i<=number)
        {
            if(number==1 || i==1 ){
            factorial=1;
            }else{
                factorial=factorial*i;
            }
            
         i=i+1;
        }System.out.println("the factorial of "+number+"!is "+factorial );
        }
        
        
        
    }
    
}
