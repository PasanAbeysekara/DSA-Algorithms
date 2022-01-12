package com.company.searching;

public class LinearSearch {

    public static void machine(){
        int[] numbers = {3,5,7,1,9};
        int toFind = 1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==toFind){
                System.out.println("index "+i);
            }
        }
    }
}
