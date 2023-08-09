package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    TwoSum solution = new TwoSum();

    @Test
    public void shouldFoundTwoSum(){
        int [] nums =  { 5,2 ,4 };
        int [] resultExpect = { 2, 1 };
        int target = 6;

       int [] result =  solution.twoSum(nums, target);
       assertArrayEquals(resultExpect, result);

    }

    @Test
    public void shouldNotFoundTwoSum(){
        int [] nums =  { 5,2 ,4 };
        int target = 8;

        int [] result =  solution.twoSum(nums, target);

        assertArrayEquals(nums, result);
    }

    @Test
    public void shouldFoundTwoSum2(){
        int [] nums =  { 5, 2 ,4 , 3};
        int [] resultExpect = { 3, 0 };
        int target = 8;

        int [] result =  solution.twoSum(nums, target);
        assertArrayEquals(resultExpect, result);
    }
}
