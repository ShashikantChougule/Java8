package com.training;

import com.training.function.Calculator;

public class Test {
	
	public static void main(String[] args) {
		
		CalculatorImpl calc = new CalculatorImpl();
		System.out.println("Addition => " + calc.calculate(12, 34));
		
		// Using anonymous inner class
		Calculator calc2 = new Calculator() {

			@Override
			public int calculate(int x, int y) {
				return x - y;
			}			
		};
		
		System.out.println("Subtraction => " + calc2.calculate(12, 6));
		
		Calculator calc3 = (x, y) -> x * y;   // If we have only one statement and that returns some value, then we don't have to use return keyword explicitly.
		System.out.println("Multiplication => " + calc3.calculate(12, 6));
		
		Calculator calc4 = (x, y) -> {
			System.out.println("Inside lambda expression");
			return x / y;    // return keyword is mandatory here because we have multiple statements in the body of lambda expression.
		};		
		System.out.println("Division => " + calc4.calculate(12, 6));
		
	
	}
}












