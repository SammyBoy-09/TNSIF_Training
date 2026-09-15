package org.tnsif.acc.c2tc.interview_questions.stream_api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {
		String sentence = "Java is fun and learning Java is rewarding";

		Map<String, Long> wordCounts = Arrays.stream(sentence.split("\\s+")).map(String::toLowerCase) // normalize case
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Word frequencies: " + wordCounts);
	}
}