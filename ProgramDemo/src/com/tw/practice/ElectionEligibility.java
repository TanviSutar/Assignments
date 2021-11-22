package com.tw.practice;

import java.util.Scanner;

public class ElectionEligibility {
    public static void isEligible(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException();
        }
        System.out.println("Eligible to vote.");
        //further processing if a valid voter
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int age = scannerObj.nextInt();

        try{
            isEligible(age);
        }
        catch (InvalidAgeException exception){
            System.out.println(exception);
        }
    }
}
