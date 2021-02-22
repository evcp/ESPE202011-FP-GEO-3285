/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] farmAnimals = {"cows ", "sheeps", "pigs", "horses ", "chickens", "rabbits"};
        for (String farmAnimal : farmAnimals) {
            System.out.println("The animals we have in the farm are--" +farmAnimal);
        }
        int[] animals;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of animals");
        int n;
        n = input.nextInt();
        horsesByBarn = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of animals");
            animals[i] = input.nextInt();

        }
        for (int horse : horsesByBarn) {
            System.out.println("Horses of the barn are " + horse);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Horses of the barn --" + (i + 1) + "--" + horsesByBarn[i]);
        }
        float[] gainOfMilk = {10.2F, 4.4F, 8.02F, 60.23F, 7.34F, 56.5F};
        for (int i = 0; i < gainOfMilk.length; i++) {
            System.out.println("Gains of the milk--" + (i + 1) + "--" + gainOfMilk[i]);
        }
    }

}
