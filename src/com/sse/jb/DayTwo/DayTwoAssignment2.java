package com.sse.jb.DayTwo;

public class DayTwoAssignment2 {
    int[][] myMatrix = { { 0, 4, 2, 12 },
            { 25, 5, 23, 1 },
            { 4, 8, 1, 99 },
            { 7, 0, 3, 11 } };

    public static int maxNumberAndPositionInMatrix(int[][] matrix) {
        int matrixRowCount = matrix.length;
        int matrixColumnCount = matrix[0].length;

        int maxNumber = Integer.MIN_VALUE;
        int rowIndex = Integer.MIN_VALUE;
        int columnIndex = Integer.MIN_VALUE;

        for (int i = 0; i < matrixRowCount; i++) {
            for (int l = 0; l < matrixColumnCount; l++) {
                if (matrix[i][l] > maxNumber) {
                    maxNumber = matrix[i][l];
                    rowIndex = i;
                    columnIndex = l;
                }
            }
        }

        System.out.printf("The largest number in this 2D Array is: %d %n", maxNumber);
        System.out.printf("It can be found at coordinates: [%d][%d] %n", rowIndex, columnIndex);

        return maxNumber;
    }

}
