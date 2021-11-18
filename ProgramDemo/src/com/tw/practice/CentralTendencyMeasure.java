package com.tw.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CentralTendencyMeasure {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);

        int arraySize = scannerObj.nextInt();

        double[] array = new double[arraySize];
        HashMap<Double, Integer> frequencyMap = new HashMap<>();
        int arraySum = 0;

        for(int i=0; i<arraySize; i++){
            array[i] = scannerObj.nextInt();
            arraySum += array[i];
            if(frequencyMap.containsKey(array[i])){
                frequencyMap.put(array[i], frequencyMap.get(array[i]));
            }
            else{
                frequencyMap.put(array[i], 1);
            }
        }

        Arrays.sort(array);

        double mode = -1;
        int highestFrequency = -1;
        for(Map.Entry<Double, Integer> entry: frequencyMap.entrySet()){
            if(highestFrequency < entry.getValue()){
                highestFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        double median;
        if(arraySize % 2 == 0){
            median = (array[arraySize/2] + array[arraySize/2-1])/2;
        }
        else{
            median = array[arraySize/2];
        }

        double mean = arraySum/arraySize;

        System.out.println("Mean: "+String.format("%.2f", mean)+"\nMedian: "+String.format("%.2f", median)+"\nMode: "+String.format("%.2f", mode));
    }
}
