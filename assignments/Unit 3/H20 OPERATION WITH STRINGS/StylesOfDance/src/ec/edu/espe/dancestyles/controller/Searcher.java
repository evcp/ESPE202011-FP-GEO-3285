/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dancestyles.controller;

/**
 *
 * @author Emilia
 */
public class Searcher {
       public static int findStyleOfDance(String[] styleOfDance, String searchDanceStyle) {
       for (int i = 0; i < 6; i++) {
            if (searchDanceStyle.equals(styleOfDance[i])) {
                return 1;
            }
        }
    return -1;
    }
}
    

