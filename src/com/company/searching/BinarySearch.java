package com.company.searching;

// to use binary search list should be sorted.
public class BinarySearch {

    private static int binarySearch(int[] numbers,int toFind){
        int low = 0;
        int high = numbers.length-1;
        while(low<=high){
            int k=(low+high)/2;
            if(numbers[k]>toFind){
                high = k-1;
            }
            else if(numbers[k]<toFind){
                low = k+1;
            }
            else{
                return k;
            }
        }
        return -1;
    }

    public static void machine(){
        int[] numbers = {0,1,2,3,4,5,6,17,19,20};
        int toFind = 17;
        int index = binarySearch(numbers,toFind);
        System.out.println(index);
    }
}
