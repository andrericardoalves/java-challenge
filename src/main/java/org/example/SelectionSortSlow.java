package org.example;

/**
 *  Tutorial Coding with John: https://www.youtube.com/watch?v=dsqsnngsoD8
 *
 *  Big O Time complex: Big O squared
 *
 */

public class SelectionSortSlow {
    
    public static void selectionSort(int [] numbers){
        int legth = numbers.length;

        for (int i = 0; i < legth - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;

            for (int j =  i +1; j < legth ; j++) {
                if (numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;

    }
}
