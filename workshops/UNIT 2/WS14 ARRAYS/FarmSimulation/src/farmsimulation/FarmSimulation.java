/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulation;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class FarmSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] eggsByCoop;
        String[] chickens = {"Lucy ", "Maruja", "Pepita"};
        float[] weightByCoop = {1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops--");
        n = input.nextInt();
        eggsByCoop = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];

//        eggsByCoop[0] = 7;
//        eggsByCoop[1] = 9;
//        eggsByCoop[2] = 3;
//        eggsByCoop[3] = 9;
//        eggsByCoop[4] = 8;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of eggs of the coop--" + (i + 1) + "--");
            eggsByCoop[i] = input.nextInt();
        }
        for (int eggs : eggsByCoop) {
            System.out.println("eggs of coop are " + eggs);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("eggs of the coop --" + (i + 1) + "--" + eggsByCoop[i]);
        }
        for (String chicken : chickens) {
            System.out.println("chicken name -> " + chicken);
        }
        for (int i = 0; i < weightByCoop.length; i++) {
            System.out.println("eggs of the coop--" + (i + 1) + "--" + weightByCoop[i]);

        }
    }
}
