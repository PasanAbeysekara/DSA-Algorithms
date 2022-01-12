package com.company.sorting;

public class BubbleSort {

    public static void machine(){
        int[] numbers = {84,32,99,65,42,34,74};
        int maxNum,minNum;
        for(int j=numbers.length-1;j>1;j--){
            for(int i=0;i<j;i++){
                maxNum = Math.max(numbers[i],numbers[i+1]);
                minNum = Math.min(numbers[i],numbers[i+1]);
                numbers[i+1]= maxNum;
                numbers[i]= minNum;
            }
        }
        for (int number: numbers){
            System.out.println(number+" ");
        }
    }
}
