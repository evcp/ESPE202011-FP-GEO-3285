/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13task;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class WS13TASK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
          do {
            System.out.println(" ========= AREAS =======");
            System.out.println("1. -> Pentagon");
            System.out.println("2. -> Triangle");
            System.out.println("3. -> Circle");
            System.out.println("4. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1: 
                    computePentagonArea(input);
                    break;
                case 2:
                    computeTriangleArea(input);
                    break;
                case 3:
                    
               
                    computeCircleArea(input);
                    break;
                    case 4:
                    System.out.println("Good Bye dear");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }          
              System.out.println(" ========= PHYSICS FORMULAS =======");
            System.out.println("1. -> Aceleration");
            System.out.println("2. -> Speed");
            System.out.println("3. -> Force");
           
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1: 
                    computeAceleration(input);
                    break;
                case 2:
                    computeSpeed(input);
                    break;
                case 3:
                    computeForce(input);
                    break;
               
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }          
     } while (option != 9);

  }

    private static void computeForce(Scanner input) {
        int force;
        int mass;
        int aceleration1;
        System.out.println("enter mass--");
        mass = input.nextInt();
        System.out.println("enter aceleration--");
        aceleration1 = input.nextInt();
        force = (mass*aceleration1);
        System.out.println("The Force is-->" + force+ "N");
    }

    private static void computeSpeed(Scanner input) {
        int speed1;
        int distance;
        int time1;
        System.out.println("enter distance- ");
        distance = input.nextInt();
        System.out.println("enter time-- ");
        time1 = input.nextInt();
        speed1= distance/time1;
        System.out.println(" The Speed is--> " + speed1 +"m/sg" );
    }

    private static void computeAceleration(Scanner input) {
        int finalspeed;
        int inicialspeed;
        int aceleration;
        int time;
        System.out.println("enter inicial speed-- ");
        inicialspeed = input.nextInt();
        System.out.println("enter final speed-- ");
        finalspeed = input.nextInt();
        System.out.println("enter time-- ");
        time= input.nextInt();
        aceleration=(finalspeed-inicialspeed)/time;
        System.out.println(" The aceleration --> " + aceleration+ "m/sg^2");
    }

    private static void computeCircleArea(Scanner input) {
        int radio;
        int area3;
        System.out.println("enter radio--");
        radio= input.nextInt();
        area3= (int) (3.141592654*(radio*radio));
        System.out.println("The area of circle is-->" + area3);
    }

    private static void computeTriangleArea(Scanner input) {
        int base;
        int height;
        int area2;
        System.out.println("enter base-- ");
        base = input.nextInt();
        System.out.println("enter height-- ");
        height = input.nextInt();
        area2= (base*height)/2;
        System.out.println(" The area of triangle is--> " + area2 );
    }

    private static void computePentagonArea(Scanner input) {
        int length;
        int apothem;
        int area;
        System.out.println("enter length-- ");
        length = input.nextInt();
        System.out.println("enter apothem-- ");
        apothem = input.nextInt();
        area=(5*length*apothem)/2;
        System.out.println(" The area of pentagon is --> " + area);
    }

}