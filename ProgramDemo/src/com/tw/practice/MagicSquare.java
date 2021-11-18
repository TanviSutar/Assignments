package com.tw.practice;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int noOfRows = scannerObj.nextInt();

        if (noOfRows <= 0) {
            System.out.println("Invalid dimensions for square matrix.");
            return;
        }

        int[][] inputMatrix = new int[noOfRows][noOfRows];

        boolean isMagicSquare = true;

        int commonSum = Integer.MIN_VALUE;

        for (int i = 0; i < noOfRows; i++) { //input matrix and simultaneously check for sum of rows
            int currentRowSum = 0;
            for (int j = 0; j < noOfRows; j++) {
                int temporary = scannerObj.nextInt();
                inputMatrix[i][j] = temporary;
                currentRowSum += temporary;
            }
            if (commonSum == Integer.MIN_VALUE) {
                commonSum = currentRowSum;
            } else if (currentRowSum != commonSum) {
                isMagicSquare = false;
            }
        }

        if (!isMagicSquare) {
            System.out.println("no");
            return;
        }

        for (int i = 0; i < noOfRows; i++) { // check for sum of columns
            int currentColumnSum = 0;
            for (int j = 0; j < noOfRows; j++) {
                currentColumnSum += inputMatrix[j][i];
            }
            if (commonSum != Integer.MIN_VALUE && currentColumnSum != commonSum) {
                isMagicSquare = false;
                break;
            }
        }

        if (!isMagicSquare) {
            System.out.println("no");
            return;
        }

        int forwardDiagonalSum = 0, backwardDiagonalSum = 0;

        for (int i = 0; i < noOfRows; i++) { // check for diagonal sums
            forwardDiagonalSum += inputMatrix[i][i];
            backwardDiagonalSum += inputMatrix[noOfRows - i - 1][noOfRows - i - 1];
        }

        if (forwardDiagonalSum != commonSum || backwardDiagonalSum != commonSum) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

    }
}
