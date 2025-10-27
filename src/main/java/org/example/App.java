package org.example;

import java.util.Arrays;

public class App 
{
    public static void main(String[] args) {
        Integer[][] inputs = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18},
                {37, 57, 40, 13, 50}
        };

        for (int i = 0; i < inputs.length; i++) {
            Integer[] arr = inputs[i];
            System.out.println("Original " + (i+1) + ": " + Arrays.toString(arr));
            Integer[] sorted = BubbleSort.sort(arr);
            System.out.println("Sorted   " + (i+1) + ": " + Arrays.toString(sorted));
            System.out.println();
        }
    }
}
