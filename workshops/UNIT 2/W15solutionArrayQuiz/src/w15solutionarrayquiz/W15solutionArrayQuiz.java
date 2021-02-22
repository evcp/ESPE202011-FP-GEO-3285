/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w15solutionarrayquiz;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class W15solutionArrayQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalOfPlayers=0;
        String[] players;
        float[]goalsAverages;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the amount of players you want to record-");
        totalOfPlayers= scanner.nextInt();
        
        players= new String[totalOfPlayers];
        goalsAverages= new float [totalOfPlayers];
        
       
        
        for (int i =0 ; i<totalOfPlayers; i++){
             scanner.nextLine();
        System.out.println("Please enter the name of the player #" + i + "-");
        players[i]= scanner.nextLine();
        System.out.println(" Enter " + players[i] + "goals average--");
        goalsAverages [i]= scanner.nextFloat();
    }
        System.out.println("Player - \t goal average");
    for (int i=0; i<totalOfPlayers; i++){
        System.out.println(players[i] + " - \t" + goalsAverages[i]);
    }
        
    }
    
}
