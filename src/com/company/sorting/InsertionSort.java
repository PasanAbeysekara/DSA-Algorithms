package com.company.sorting;

public class InsertionSort {
    public static void machine(){
        int[] numbers = {84,32,99,65,42,34,74};
        for(int i=1;i<numbers.length;i++){
            int j = i,temp;
            while(numbers[j]<numbers[j-1]){
                temp = numbers[j];
                numbers[j] = numbers[j-1];
                numbers[j-1] = temp;
                if(j>1){
                    j--;
                }
            }
        }
        for(int number:numbers){
            System.out.print(number+" ");
        }
    }
}
