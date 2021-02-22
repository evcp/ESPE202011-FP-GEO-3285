/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayquiz22.pkg02;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class ArrayQuiz2202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] animals;
        String[] animal = {"snail", "fish", "rabbit", "dog", "cat", "bird", "panda", "bug", "horse", "sheep", "cow", "mouse"};
        float[] weightAnimals = {7.5F, 8.25F, 4.50F, 3.00F, 0.23F, 0.15F, 3.50F, 2.07F, 2.50F, 2.00F, 3.00F, 4.50F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the animal number-> ");
        n = input.nextInt();

        animals = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of animals" + (i + 1) + " -> ");
            animals[i] = input.nextInt();
        }

        for (int animal1 : animals) {
            System.out.println(" animals " + animals);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" The animal-- " + (i + 1) + " -> " + animals[i]);
        }

        for (int animal1 : animals) {
            System.out.println("Animals -> " + animal);
        }

        for (int i = 0; i < weightAnimals.length; i++) {
            System.out.println(" -> " + weightAnimals[i] + " weight of animal " + (i + 1) + weightAnimals[i]);
        }
    
            int totalOfAnimals = 0;
            String[] animals1;
            float[] weightOfAnimals;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount of animals you want to record-");
            totalOfAnimals = scanner.nextInt();

            animals1 = new String[totalOfAnimals];
            weightAnimals = new float[totalOfAnimals];

            for (int j = 0; j < totalOfAnimals; j++) {
                scanner.nextLine();
                System.out.println(" Please enter the name of animal # "  + j + "-");
                animals1[j] = scanner.nextLine();
                System.out.println(" Enter " + animals1[j] + " weight of animal- -");
                weightAnimals[j] = scanner.nextFloat();
            }
            System.out.println("Animal - \t Weight animal ");
            for (int j = 0; j < totalOfAnimals; j++) {
                System.out.println(animals1[j] + " - \t" + weightAnimals[j]);
            }
        }
    }

