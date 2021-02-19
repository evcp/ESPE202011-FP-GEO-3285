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
        int force;
        int mass;
        int aceleration1;
        int speed1;
        int distance;
        int time1;
        int finalspeed;
        int inicialspeed;
        int aceleration;
        int time;
        int radio;
        int area3;
        int base;
        int height;
        int area2;
        int length;
        int apothem;
        int area;

        do {
            System.out.println(" ========= AREAS =======");
            showMenuAreas();

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter length-- ");
                    length = input.nextInt();
                    System.out.println("enter apothem-- ");
                    apothem = input.nextInt();
                    area = computePentagonArea(length, apothem);
                    System.out.println(" The area of pentagon is --> " + area);
                    break;
                case 2:
                    System.out.println("enter base-- ");
                    base = input.nextInt();
                    System.out.println("enter height-- ");
                    height = input.nextInt();
                    area2 = computeTriangleArea(base, height);
                    System.out.println(" The area of triangle is--> " + area2);
                    break;
                case 3:

                    System.out.println("enter radio--");
                    radio = input.nextInt();
                    area3 = computeCircleArea(radio);
                    System.out.println("The area of circle is-->" + area3);
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
            showMenuPhysicsFormulas();

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter inicial speed-- ");
                    inicialspeed = input.nextInt();
                    System.out.println("enter final speed-- ");
                    finalspeed = input.nextInt();
                    System.out.println("enter time-- ");
                    time = input.nextInt();
                    aceleration = computeAceleration(finalspeed, inicialspeed, time);
                    System.out.println(" The aceleration --> " + aceleration + "m/sg^2");
                    break;
                case 2:
                    System.out.println("enter distance- ");
                    distance = input.nextInt();
                    System.out.println("enter time-- ");
                    time1 = input.nextInt();
                    speed1 = computeSpeed(distance, time1);
                    System.out.println(" The Speed is--> " + speed1 + "m/sg");
                    break;
                case 3:
                    System.out.println("enter mass--");
                    mass = input.nextInt();
                    System.out.println("enter aceleration--");
                    aceleration1 = input.nextInt();
                    force = computeForce(mass, aceleration1);
                    System.out.println("The Force is-->" + force + "N");
                    break;
                case 4:
                    System.out.println("Good Bye dear");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (option != 9);

    }

    public static void showMenuPhysicsFormulas() {
        System.out.println("1. -> Aceleration");
        System.out.println("2. -> Speed");
        System.out.println("3. -> Force");
        System.out.println("4. -> Exit");
    }

    public static void showMenuAreas() {
        System.out.println("1. -> Pentagon");
        System.out.println("2. -> Triangle");
        System.out.println("3. -> Circle");
        System.out.println("4. -> Exit");
    }

    private static int computeForce(int mass, int aceleration1) {
        int force;
        force = (mass * aceleration1);
        return force;
    }

    private static int computeSpeed(int distance, int time1) {
        int speed1;
        speed1 = distance / time1;
        return speed1;
    }

    private static int computeAceleration(int finalspeed, int inicialspeed, int time) {
        int aceleration;
        aceleration = (finalspeed - inicialspeed) / time;
        return aceleration;
    }

    private static int computeCircleArea(int radio) {
        int area3;
        area3 = (int) (3.141592654 * (radio * radio));
        return area3;
    }

    private static int computeTriangleArea(int base, int height) {
        int area2;
        area2 = (base * height) / 2;
        return area2;
    }

    private static int computePentagonArea(int length, int apothem) {
        int area;
        area = (5 * length * apothem) / 2;
        return area;
    }
}
