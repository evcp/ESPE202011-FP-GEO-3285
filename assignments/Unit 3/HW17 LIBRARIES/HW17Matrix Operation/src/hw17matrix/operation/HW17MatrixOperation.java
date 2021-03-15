/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrix.operation;

import ec.edu.espe.Matrix.MatrixOperation;
import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class HW17MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] c;
        int[][] a;
        int[][] b;
        int[][] t;
        int m = 0;
        int n = 0;
        int sum;
        int subtraction;
        int transpose;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix dimensions");
        System.out.println("\n m--");
        m = input.nextInt();
        System.out.println(" n--");
        n = input.nextInt();

        a = new int[m][n];
        b = new int[m][n];
        c = new int[m][n];
        t = new int[n][m];

        System.out.println("---Enter the matrix dimensions for matrix A ---");
        getMatrixDimension(m, n, a, input);
        System.out.println("---Enter the matrix dimensions for matrix B ---");
        getMatrixDimension(m, n, b, input);

        sum = MatrixOperation.computeSumMatrix(m, n, c, a, b);

        System.out.println("The additon of matrix A -> ");

        printMatrix(m, n, a);

        System.out.println("\n And Matrix B -> ");
        printMatrix(m, n, b);

        System.out.println("\n equals to -> ");
        printMatrix(m, n, c);

        System.out.println("");
        subtraction = MatrixOperation.computeSubstractionMatrix(m, n, c, a, b);
        System.out.println("The subtraction of matrix A -> ");

        printMatrix(m, n, a);

        System.out.println("\n And Matrix B -> ");
        printMatrix(m, n, b);

        System.out.println("\n equals to -> ");
        printMatrix(m, n, c);

        System.out.println("");

        System.out.println("The transpose of matrix A -> ");

        printMatrix(m, n, a);
        transpose = MatrixOperation.computeTransposeMatrix(n, m, t, a);
        

        System.out.println("\n equals to -> ");
        printMatrix(m, n, t);

    }

    public static void printMatrix(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + matrix[i][j]);
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
