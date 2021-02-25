/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfuntion;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW16MATRIXFUNCTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] c;
        int[][] a;
        int[][] b;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix dimensions");
        System.out.println("\n m--");
        m = input.nextInt();
        System.out.println("\n n--");
        n = input.nextInt();

        a = new int[m][n];
        b = new int[m][n];
        c = new int[m][n];

        System.out.println("---Enter the matrix dimensions for matrix A ---");
        getMatrixDimension(m, n, a, input);
        System.out.println("---Enter the matrix dimensions for matrix B ---");
        getMatrixDimension(m, n, b, input);
        computeSumMatrix(m, n, c, a, b);

        System.out.println("The additon of matrix A -> ");

        printMatrix(m, n, a);

        System.out.println("\n And Matrix B -> ");
        printMatrix(m, n, b);

        System.out.println("\n equals to -> ");
        printMatrix(m, n, c);
    }

    public static void printMatrix(int m, int n, int[][] a) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }
    }

    public static void computeSumMatrix(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void getMatrixDimension(int m, int n, int[][] a, Scanner input) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a" + (i + 1) + (j + 1));
                a[i][j] = input.nextInt();
            }
            
        }
    }
}
