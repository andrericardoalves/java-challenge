package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxDoubleSliceSumTest {

    int [] numbers1 , numbers2;

    int output1,  output2;

    @Before
    public void init(){
        numbers1 = new int[] {3, 2, 6, -1, 4, 5, -1, 2}; output1 = 17;
        numbers2 = new int[] {0, 10, -5, -2, 0}; output2 = 10;

    }

    @Test
    public void shouldFindDoubleSliceNumber(){
        MaxDoubleSliceSum maxDoubleSliceSum  = new MaxDoubleSliceSum();
        assertEquals(output1, maxDoubleSliceSum.solution(numbers1));
        assertEquals(output2, maxDoubleSliceSum.solution(numbers2));

    }

    @Test
    public void shouldFindDoubleSliceNumberV2(){
        MaxDoubleSliceSum maxDoubleSliceSum  = new MaxDoubleSliceSum();
        assertEquals(output1, maxDoubleSliceSum.solution2(numbers1));
        assertEquals(output2, maxDoubleSliceSum.solution2(numbers2));
    }
}