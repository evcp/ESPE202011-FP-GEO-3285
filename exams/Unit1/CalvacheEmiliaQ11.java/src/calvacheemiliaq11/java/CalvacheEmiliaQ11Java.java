/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calvacheemiliaq11.java;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class CalvacheEmiliaQ11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option;

        do {
           
            System.out.println(" ========= Multiplicate Table =======");
            System.out.println("1. -> table of ");
            System.out.println("0. -> exit");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

       switch (option){ 
           case 1 :
               int top=12;
               int product;
               int table;
                System.out.println("ENTER THE TABLE YOU WANT TO STUDY");   
                table = input.next.Int();
                System.out.println("Multiplication tables" + tables );
                for(int j =1; j<=top; j++ ){
                 product = table * j;
              System.out.println(table + " *  " + j + "=" + product);
            break;
        switch (option);
                case 0: 
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
       } 
       
       }
        }
        
    
    

