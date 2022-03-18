package com.training.model;

import java.util.Optional;

public class Person {

	private Car car;

	public Person() {
		super();
	}

	public Person(Car car) {
		super();
		this.car = car;
	}

//	public Car getCar() {
//		return car;
//	}
	
	public Optional<Car> getCar() {
		return Optional.of(car);
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
