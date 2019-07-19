package com.stackroute.pe3;

public class AdditionOfMatrix {
    public int[][] matrixresult(int[][] matrix1, int[][] matrix2, int row, int col) {
        int [][] mat1= new int[row][col];
        int [][] mat2= new int[row][col];
        int result[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = matrix1[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = matrix2[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            }
        return result;
    }
}