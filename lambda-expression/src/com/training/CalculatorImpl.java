package com.training;

import com.training.function.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int calculate(int x, int y) {
		return x + y;
	}

}
