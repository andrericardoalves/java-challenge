package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveNumbersDuplicatedTest {

    @Test
    public void shouldRemoveDuplicatedNumbers(){
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 6, 6, 7, 8 , 8, 9, 9);
        RemoveNumbersDuplicated duplicated = new RemoveNumbersDuplicated();
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9) , duplicated.solution(numbers)); ;
    }
}