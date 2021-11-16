package com.tw.practice;

import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int noOfRows, noOfColumns;

        noOfRows = scanner.nextInt();
        noOfColumns = scanner.nextInt();

        if(noOfRows <= 0){
            System.out.println("Number of rows should be greater than 0");
            return;
        }
        if(noOfColumns <= 0){
            System.out.println("Number of columns should be greater than 0");
            return;
        }

        int inputTreeNo;
        inputTreeNo = scanner.nextInt();

        if(inputTreeNo <= 0 || inputTreeNo > noOfRows*noOfColumns){
            System.out.println("No tree with the given number exists.");
            return;
        }

        if(inputTreeNo >= 1 && inputTreeNo <= noOfColumns){ //if the input tree is in first row
            System.out.println("yes");
        }
        else{
            boolean isMangoTree = false;
            for(int i=1; i<=noOfRows; i++){//simultaneously check for first column and last column of remaining rows
                int lastTreeOfRowI = noOfColumns*i;
                if(inputTreeNo == lastTreeOfRowI || inputTreeNo == lastTreeOfRowI-noOfColumns+1){
                    isMangoTree = true;
                    System.out.println("yes");
                    break;
                }
            }
            if(!isMangoTree){
                System.out.println("no");
            }
        }
    }
}
