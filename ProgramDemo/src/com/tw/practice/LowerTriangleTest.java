package com.tw.practice;

import java.util.Scanner;

public class LowerTriangleTest {
    public static boolean isLowerTriangle(int rows, int[][] inputMatrix){
        boolean rightLowerTriangle = true, leftLowerTriangle = true;

        //upper half check
        for(int i=0; i<rows; i++){
            for(int j=i+1; j<=rows-i-1; j++){
                if(inputMatrix[i][j] != 0){
                    leftLowerTriangle = false;
                }
                if(inputMatrix[i][rows-j-1] != 0){
                    rightLowerTriangle = false;
                }
            }
        }

        //lower half check
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                if(inputMatrix[i][j] == 0){
                    leftLowerTriangle = false;
                }
                if(inputMatrix[i][rows-j-1] == 0){
                    rightLowerTriangle = false;
                }
            }
        }

        return (leftLowerTriangle || rightLowerTriangle);
    }
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);

        int rows = scannerObj.nextInt();

        int[][] inputMatrix = new int[rows][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                inputMatrix[i][j] = scannerObj.nextInt();
            }
        }

        if(isLowerTriangle(rows, inputMatrix)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
