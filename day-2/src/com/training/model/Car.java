package com.training.model;

import java.util.Optional;

public class Car {

	private Insurance insurance;

	public Car() {
		super();
	}

	public Car(Insurance insurance) {
		super();
		this.insurance = insurance;
	}

//	public Insurance getInsurance() {
//		return insurance;
//	}
	
	public Optional<Insurance> getInsurance() {
		return Optional.of(insurance);
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}
