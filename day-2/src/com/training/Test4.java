package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test4 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		// Original List => [1, 2, 3, 4, 5]    Expected List => [1, 2, 9, 14, 25]
		
//		List<Integer> squares = numbers.stream()
//														.map(n -> n * n)
//														.collect(Collectors.toList());
//		
//		System.out.println(squares);
		
		Optional<Integer> result = numbers.stream()
															.reduce((a, b) -> a + b);
		             
		if (result.isPresent()) {
			System.out.println("Sum => " + result.get());
		}   
		
		int sum = numbers.stream()
		                            .reduce(0, (a, b) -> a + b);
		
		System.out.println("Sum => " + sum);
		
		
	}
}
