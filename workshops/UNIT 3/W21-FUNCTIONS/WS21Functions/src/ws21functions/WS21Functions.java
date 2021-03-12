/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float distance;
        float speed;
        float time;
        float inicialmileage;
        float finalmileage;
        float totalliters;
        float kilometersperliter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("AUTHOR EMILIA VALENTINA CALVACHE");
        System.out.println("Kilometers per liter of gasoline that your car uses");
        System.out.println("Please enter the inicial mileage");
        inicialmileage = scanner.nextFloat();
        System.out.println("Please enter the final mileage");
        finalmileage = scanner.nextFloat();
        System.out.println("Please enter the liters of gasoline you need");
        totalliters = scanner.nextFloat();

        kilometersperliter = calculateKilometerPerLiter(inicialmileage, finalmileage, totalliters);
        System.out.println("The kilometers per liter of gasoline that your car uses are--" + kilometersperliter + "Km/l");

        System.out.println("");
        System.out.println("The vehicle speed");
        System.out.println("Please enter the  distance traveled");
        distance = scanner.nextFloat();
        System.out.println("Please enter the time traveled");
        time = scanner.nextFloat();

        speed = calculateSpeed(distance, time);
        System.out.println("The speed traveled were--" + speed + "Km/h");

    }

    public static float calculateSpeed(float distance, float time) {
        float speed;
        speed = distance / time;
        return speed;
    }

    public static float calculateKilometerPerLiter(float inicialmileage, float finalmileage, float totalliters) {
        float kilometersperliter;
        kilometersperliter = (inicialmileage - finalmileage) / totalliters;
        return kilometersperliter;
    }

}
