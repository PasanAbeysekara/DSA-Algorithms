package com.company.searching;
// List must be !!! SORTED !!!
public class TernarySearch {
    private static int ternarySearch(int[] numbers,int toFind){
        int low =0;
        int high=numbers.length-1;
        while(low<=high){
            int mid1 = low + (high-low)/3;
            int mid2 = high - (high-low)/3;

            if(toFind<numbers[mid1]){
                high=mid1-1;
            }
            else if(toFind>numbers[mid2]){
                low=mid2+1;
            }
            else if(toFind==numbers[mid1]){
                return mid1;
            }
            else if(toFind==numbers[mid2]){
                return mid2;
            }
            else{
                low = mid1+1;
                high = mid2-1;
            }
        }
        return -1;
    }

    public static void machine(){
        int[] numbers = {32,65,824,4221,9999};
        int toFind = 65;
        int index = ternarySearch(numbers,toFind);
        System.out.println("index of "+toFind+" is : "+index);
    }
}
