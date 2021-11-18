package com.tw.practice;

import java.util.Scanner;

public class UpperTriangleTest {
    public static boolean isUpperTriangle(int rows, int[][] inputMatrix){
        boolean rightUpperTriangle = true, leftUpperTriangle = true;

        //upper half check
        for(int i=0; i<rows; i++){
            for(int j=0; j<=rows-i-1; j++){
                if(inputMatrix[i][j] == 0){
                    leftUpperTriangle = false;
                }
                if(inputMatrix[i][rows-j-1] == 0){
                    rightUpperTriangle = false;
                }
            }
        }

        //lower half check
        for(int i=1; i<rows; i++){
            for(int j=rows-1; j>rows-i-1; j--){
                if(inputMatrix[i][j] != 0){
                    leftUpperTriangle = false;
                }
                if(inputMatrix[i][rows-j-1] != 0){
                    rightUpperTriangle = false;
                }
            }
        }

        return (leftUpperTriangle || rightUpperTriangle);
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

        if(isUpperTriangle(rows, inputMatrix)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
