/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println(" ========= Areas =======");
            System.out.println("1. -> Pentagon");
            System.out.println("2. -> Triangle");
            System.out.println("3. -> Rectangle");
            System.out.println("4. -> Circle");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1: 
                    int length;
                    int apothem;
                    int area;
                    System.out.println("enter length-- ");
                    length = input.nextInt();
                    System.out.println("enter apothem-- ");
                    apothem = input.nextInt();
                    area=(5*length*apothem)/2;
                    System.out.println(" The area of pentagon is --> " + area);
                    break;
                case 2:
                    int base;
                    int height;
                    int area2;
                    System.out.println("enter base-- ");
                    base = input.nextInt();
                    System.out.println("enter height-- ");
                    height = input.nextInt();
                    area2= (base*height)/2;
                    System.out.println(" The area of triangle is--> " + area2 );
                    break;
                case 3:
                    int length3;
                    int width;
                    int area3;
                    System.out.println("enter length--");
                    length3 = input.nextInt();
                    System.out.println("enter width--");
                    width = input.nextInt();
                    area3 = (length3*width);
                    System.out.println("The area of rectangle is-->" + area3 );
                    break;
                case 4:
                    int radio;
                    int area4;
                    System.out.println("enter radio--");
                    radio= input.nextInt();
                    area4= (int) (3.141592654*(radio*radio));
                    System.out.println("The area of circle is-->" + area4);
                    break;
                    case 5:
                    System.out.println("Good Bye dear");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }          
            
     } while (option != 9);

  }

}
                            
                    
                    
                           
    
    


        
        
    
    

