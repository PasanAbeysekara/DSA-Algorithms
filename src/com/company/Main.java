package com.company;

import com.company.sorting.BubbleSort;
import com.company.sorting.InsertionSort;
import com.company.sorting.SectionalSort;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SectionalSort.machine();
        long finish = System.currentTimeMillis();
        System.out.println("\nTime for Sectional Sort : "+(finish-start)+"mm\n");


        long start_1 = System.currentTimeMillis();
        BubbleSort.machine();
        long finish_1 = System.currentTimeMillis();
        System.out.println("\nTime for Bubble Sort : "+(finish_1-start_1)+"mm\n");

        long start_2 = System.currentTimeMillis();
        InsertionSort.machine();
        long finish_2 = System.currentTimeMillis();
        System.out.println("\nTime for Insertion Sort : "+(finish_2-start_2)+"mm\n");

    }
}
