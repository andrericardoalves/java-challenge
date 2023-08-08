package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterListString {

    public String solution(List<String> inputList){

        if(inputList.isEmpty())
            return "empty";

        return Optional.of(inputList.stream()
                .filter( v -> v.toUpperCase().contains("test".toUpperCase()))
                .peek(System.out::println)
                .collect(Collectors.joining(";")))
                .orElse("emptyList");
    }
}
