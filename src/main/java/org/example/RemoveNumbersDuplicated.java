package org.example;

import java.util.List;

public class RemoveNumbersDuplicated {

    public List<Integer> solution(List<Integer> numbers){
        return numbers.stream().distinct().toList();
    }
}
