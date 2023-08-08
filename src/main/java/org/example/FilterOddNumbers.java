package org.example;

import java.util.List;

public class FilterOddNumbers {

    public List<Integer> solution(List<Integer> numbers){
        return numbers.stream().filter( n -> n % 2 != 0).toList();
    }
}
