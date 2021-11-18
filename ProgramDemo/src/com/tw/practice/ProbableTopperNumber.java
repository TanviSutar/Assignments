package com.tw.practice;

import java.util.Scanner;

public class ProbableTopperNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        long inputNo = scanner.nextLong();

        long oddSum = 0, evenSum = 0;

        while(inputNo > 0){

            long tmp = inputNo%10;

            inputNo = inputNo/10;

            if((tmp & 1) == 1){//gives 1 for odd numbers and 0 for even
                oddSum += tmp;
            }
            else{
                evenSum += tmp;
            }
        }

        if(evenSum == oddSum) System.out.println("yes");
        else System.out.println("no");
    }
}
