package com.tw.practice;

import java.util.Scanner;

public class CollatzSequence {
    public static void printCollatzSequence(int inputNumber) {
        int operationsPerformed = 0;
        System.out.print(inputNumber+" ");
        while (inputNumber > 1) {
            if (inputNumber % 2 == 0) {
                inputNumber = inputNumber / 2;
            } else {
                inputNumber = 3 * inputNumber + 1;
            }
            System.out.print(inputNumber+" ");
            operationsPerformed++;
        }
        System.out.println(operationsPerformed);
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int inputNumber = scannerObj.nextInt();

        printCollatzSequence(inputNumber);
    }
}
