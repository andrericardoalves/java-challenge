package org.example;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FilterListStringTest {

    @Test
    public void shouldFindListString(){
        List<String> inputList1 = List.of("123", "qwetestas", "4564test", "4564test");
        List<String> inputList2 = List.of("TeSt");
        List<String> inputList3 = List.of("TeSt", "test");
        String output1 = "qwetestas;4564test;4564test";

        FilterListString filter = new FilterListString();
        assertEquals(output1, filter.solution(inputList1));
        assertEquals("TeSt", filter.solution(inputList2));
        assertEquals("TeSt;test", filter.solution(inputList3));
    }

    @Test
    public void shouldFindStringEmpty(){
        List<String> inputList = List.of();
        String result = new FilterListString().solution(inputList);
        assertEquals("empty",result);
    }

    @Test
    public void shouldFindStringEmptyList(){
        List<String> inputList = List.of("123");
        String result = new FilterListString().solution(inputList);
        assertEquals("emptyList",result);
    }
}