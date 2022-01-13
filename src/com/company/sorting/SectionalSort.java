package com.company.sorting;

public class SectionalSort {
    public static void machine(){
//        int[] numbers = {84,32,99,65,42,34,74};
//        for(int j=numbers.length-1;j>0;j--){
//            int bigIdx = 0;
//            for(int i=0;i<=j;i++){
//                if(numbers[i]>numbers[bigIdx]){
//                    bigIdx = i;
//                }
//                System.out.print(bigIdx+", ");
//            }
//            System.out.println();
//            int bigNum = numbers[bigIdx];
//            numbers[bigIdx] = numbers[j];
//            numbers[j] = bigNum;
//            for(int number:numbers){
//                System.out.print(number+" ");
//            }
//            System.out.println(" bigNum : "+bigNum);
//        }
        int[] numbers = {84,32,99,65,42,34,74};
        for(int j=numbers.length-1;j>0;j--){
            int bigIdx = 0;
            for(int i=0;i<=j;i++){
                if(numbers[i]>numbers[bigIdx]){
                    bigIdx = i;
                }
            }
            int bigNum = numbers[bigIdx];
            numbers[bigIdx] = numbers[j];
            numbers[j] = bigNum;
        }
        for(int number:numbers){
            System.out.print(number+" ");
        }
    }
}
