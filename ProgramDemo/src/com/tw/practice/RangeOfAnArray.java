package com.tw.practice;

import java.util.Scanner;

public class RangeOfAnArray {
    public static int getRangeOfArray(int sizeOfArray, int[] inputArray) {
        int minimumElement = Integer.MAX_VALUE, maximumElement = Integer.MIN_VALUE;
        for (int i = 0; i < sizeOfArray; i++) {
            if (inputArray[i] < minimumElement) {
                minimumElement = inputArray[i];
            }
            if (inputArray[i] > maximumElement) {
                maximumElement = inputArray[i];
            }
        }
        return maximumElement - minimumElement;
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int sizeOfArray = scannerObj.nextInt();

        int[] inputArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i] = scannerObj.nextInt();
        }

        if(sizeOfArray > 0) {
            System.out.println("Range of the input array: " + getRangeOfArray(sizeOfArray, inputArray));
        }
        else{
            System.out.println("Empty array.");
        }
    }
}
