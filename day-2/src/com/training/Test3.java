package com.training;

import com.training.model.Car;
import com.training.model.Insurance;
import com.training.model.Person;

public class Test3 {

	public static void main(String[] args) {
		
		Insurance insurance = new Insurance("ABC Pvt Ltd");
		Car car = new Car(insurance);
		Person person = new Person(car);
		
		String insuranceCompanyName = getInsuranceCompanyName(person);
		System.out.println(insuranceCompanyName);
	}
	
	public static String getInsuranceCompanyName(Person person) {
		
//		if (person != null) {
//			Car car = person.getCar();
//			if (car != null) {
//				Insurance insurance = car.getInsurance();
//				if(insurance != null) {
//					return insurance.getName();
//				}
//			}
//		}
//		return "Unknown";
		
		
//		if (person == null) 
//			return "Unknown";
//		
//        Car car = person.getCar();
//        if (car == null) 
//        	return "Unknown";
//        
//        Insurance insurance = car.getInsurance();
//        if (insurance == null) 
//        	return "Unknown";
//        
//        return insurance.getName(); 
		
		return "Unknown";
	}
}














