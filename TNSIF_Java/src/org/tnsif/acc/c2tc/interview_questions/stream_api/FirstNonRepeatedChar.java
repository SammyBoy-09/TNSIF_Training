package org.tnsif.acc.c2tc.interview_questions.stream_api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> firstNonRepeated = input.chars()
            .mapToObj(c -> (char) c)
            // Use LinkedHashMap to preserve the insertion order
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() == 1L)
            .map(Map.Entry::getKey)
            .findFirst();

        firstNonRepeated.ifPresent(c -> 
            System.out.println("First non-repeated character: " + c));
    }
}