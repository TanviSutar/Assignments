package com.tw.practice;

import java.util.Scanner;

public class ArrayType {
    public static String getArrayType(int sizeOfArray, int[] inputArray){
        int evenCount = 0, oddCount = 0;
        for(int i=0; i<sizeOfArray; i++){
            if(inputArray[i]%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        if(evenCount != 0 && oddCount != 0) return "Mixed";
        else if(oddCount != 0) return "Odd";
        else return "Even";
    }
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);

        int sizeOfArray = scannerObj.nextInt();

        int[] inputArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i] = scannerObj.nextInt();
        }

        if(sizeOfArray > 0) {
            System.out.println(getArrayType(sizeOfArray, inputArray));
        }
        else{
            System.out.println("Empty array.");
        }
    }
}
