package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveTest {

    @Test
    public void shouldFindTheFirsMissingPositive(){
        FirstMissingPositive sl = new FirstMissingPositive();
        int [] numbers = {1,2,3,5,6,7};
        int expected = sl.firstMissingPositive(numbers);
        System.out.println(expected);
        assertEquals(expected, 0);
    }

    @Test
    public void shouldNotFindTheFirsMissingPositive(){
        FirstMissingPositive sl = new FirstMissingPositive();
        int [] numbers = { -1,-2,-3,-5,-6,-7};
        int expected = sl.firstMissingPositive(numbers);
        System.out.println(expected);
        assertEquals(expected, -1);
    }
}