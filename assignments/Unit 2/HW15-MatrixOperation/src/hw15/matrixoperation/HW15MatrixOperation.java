/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] c;
        int [][] a;
        int [][] b;
         int m = 0;
        int n = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix dimensions");
        System.out.println("\n m--");
        m = input.nextInt();
        System.out.println("\n n--");
        n = input.nextInt();
        
        a = new int[m][n];
        b= new int[m][n];
        c = new int[m][n];
         
        System.out.println("---Enter the matrix dimensions for matrix A ---");
        for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("a" + (i+1) + (j+1));
                 a [i][j]= input.nextInt();
             }
            
        }
 System.out.println("---Enter the matrix dimensions for matrix B ---");
        for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("a" + (i+1) + (j+1));
                 b [i][j]= input.nextInt();
             }
            
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The additon of matrix A -> ");

        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }

        System.out.println("\n And Matrix B -> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }

        System.out.println("\n equals to -> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
    }
}
