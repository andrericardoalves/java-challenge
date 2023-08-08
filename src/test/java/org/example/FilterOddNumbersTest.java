package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FilterOddNumbersTest {

    @Test
    public void shouldRetrieveOddNumbers(){
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8 , 9);
        FilterOddNumbers filterOddNumbers = new FilterOddNumbers();
        Assertions.assertEquals(List.of(1, 3, 5, 7, 9) , filterOddNumbers.solution(numbers)); ;
    }
}