package com.stackroute.pe3;

public class ChessBoard {
    public

    String[][] matrix;
    int rows, columns;

    public void initialisation(int rows) {
        this.rows = rows;
        this.columns = rows;
        matrix = new String[rows][columns];

    }

    public String chessBoardPattern() {
        int k = 0;
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (k++ % 2 == 0) ? "BB" : "WW";

                result = result.concat(matrix[i][j]).concat(" ");
            }
            result= result.concat("\n");
        }
        return result;
    }
}
