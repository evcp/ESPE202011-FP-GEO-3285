/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Matrix;

/**
 *
 * @author Emilia
 */
public class MatrixOperation {
     public static int computeTransposeMatrix(int n, int m, int[][] t, int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = a[j][i];
                
            }
        }
        return 0;
    }


    public static int computeSumMatrix(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return 0;
    }

    public static int computeSubstractionMatrix(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return 0;
    }
}


