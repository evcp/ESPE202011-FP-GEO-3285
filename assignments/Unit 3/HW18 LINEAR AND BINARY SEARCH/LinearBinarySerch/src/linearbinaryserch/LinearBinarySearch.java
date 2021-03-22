/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearbinaryserch;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class LinearBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] ageOfPeople = {19, 23, 34, 44, 57, 69, 72};
        int target = 34;
        System.out.println("EMILIA CALVACHE");
        System.out.println("");
        binarySearch(ageOfPeople, target);
        System.out.println("");
        double[] heightOfAnimals = {1.20, 1.35, 1, 56, 1.63, 1.70, 1.90};
        double key = 1.30;
        System.out.println(key + " is found at height: " + linearSearch(heightOfAnimals, key));

    }

    public static void binarySearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        int lowEnd = 0;
        int highEnd = parameterOne.length - 1;
        while (highEnd >= lowEnd) {
            int middle = (lowEnd + highEnd) / 2;

            if (parameterOne[middle] == parameterTwo) {
                index = middle;
                break;
            } else if (parameterOne[middle] < parameterTwo) {
                lowEnd = middle + 1;
            } else if (parameterOne[middle] > parameterTwo) {
                highEnd = middle - 1;
            }
        }
        if (index == -1) {
            System.out.println("Your age integer does not exist in the array");
        } else {
            System.out.println("Your age integer is in index " + index + " of the array");
        }
    }

    public static int linearSearch(double[] heightOfAnimals, double key) {

        for (int i = 0; i < heightOfAnimals.length; i++) {
            if (heightOfAnimals[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
