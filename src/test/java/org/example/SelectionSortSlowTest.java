package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortSlowTest {

    @Test
    public void shouldSortNumbers(){
        int quantity = 1_000_000; // Took 339362ms with 1_000_000 numbers
        int [] numbers = new int[quantity];
        int [] numbersExpected = new int[quantity];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
           int number = random.nextInt(100_000);
           numbers[i] = number;
           numbersExpected = numbers;
        }
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        SelectionSortSlow.selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("");

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbersExpected);
        assertEquals(numbersExpected, numbers);

        System.out.println("Took " + (endTime - startTime) + "ms");
    }

}