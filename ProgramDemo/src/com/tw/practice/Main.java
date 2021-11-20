package com.tw.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfLabs = 3;
        int[] labCapacity = new int[noOfLabs];

        for(int i=0; i<noOfLabs; i++){
            int tmp = sc.nextInt();
            if(tmp <= 0){
                System.out.println("Invalid Entry. Enter again.");
                i--;
            }
            labCapacity[i] = tmp;
        }

        int noOfStudents;
        noOfStudents = sc.nextInt();

        int labAssigned = -1, extraSpace = Integer.MAX_VALUE; //initially no lab allocated

        for(int i=0; i<noOfLabs; i++){

            if(labCapacity[i] >= noOfStudents){

                if(labCapacity[i]-noOfStudents < extraSpace){
                    extraSpace = labCapacity[i]-noOfStudents;
                    labAssigned = i;
                }
            }

        }

        if(noOfStudents == 0) System.out.println("No lab is needed.");
        else if(labAssigned == -1) System.out.println("No lab with sufficient capacity");
        else System.out.println("Lab "+(labAssigned+1)+" with capacity " + labCapacity[labAssigned] +" is allocated.");
    }
}
