package com.training;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.training.model.Employee;

public class Test2 {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(101, "John Doe", "HR", 45000));
		employees.add(new Employee(33, "Kathy Sierra", "HR", 34000));
		employees.add(new Employee(66, "Jane Doe", "ADMIN", 12000));
		employees.add(new Employee(78, "Bob Martin", "ADMIN", 22000));
		employees.add(new Employee(12, "Alex Browning", "ADMIN", 10000));
		employees.add(new Employee(33, "Anna Parker", "ACCOUNTS", 42000));
		employees.add(new Employee(99, "Bert Bates", "ACCOUNTS", 22000));
		employees.add(new Employee(345, "John Conner", "ACCOUNTS", 18000));
		employees.add(new Employee(233, "Bryan Bash", "SALES", 62000));
		employees.add(new Employee(189, "George King", "SALES", 55000));
		employees.add(new Employee(200, "Jason Taylor", "SALES", 58000));
		
		// displayAllEmployees(employees);
		// displayAllEmployeesFromAdminDepartment(employees);
		// displayNameOfEmployeesFromAdminDepartment(employees);
		// List<Employee> salesEmployees = getAllEmployeesFromSalesDepartment(employees);
		// salesEmployees.forEach(e -> System.out.println(e));
		// findSumOfAllEmployeeSalaries(employees);
		// findMaximumSalaryOfEmployee(employees);
		// findMinimumSalaryOfEmployee(employees);
		// findAverageSalaryOfEmployees(employees);
		// displayTop3HighestPaidEmployees(employees);
		displayAllEmployeesGroupByDepartments(employees);
	}
	
	public static void displayAllEmployees(List<Employee> employees) {
		
		employees.forEach(e -> System.out.println(e));
	}
	
	public static void displayAllEmployeesFromAdminDepartment(List<Employee> employees) {
		
		employees.stream()
		               .filter(e -> e.getDepartment().equals("ADMIN"))
		               .forEach(e -> System.out.println(e)); 
	}
	
	public static void displayNameOfEmployeesFromAdminDepartment(List<Employee> employees) {
		
		employees.stream()
		               .filter(e -> e.getDepartment().equals("ADMIN"))
		               .map(e -> e.getName())
		               .forEach(n -> System.out.println(n));
		              // .forEach(e -> System.out.println(e.getName()));
	}
	
	public static List<Employee> getAllEmployeesFromSalesDepartment(List<Employee> employees) {
		
		List<Employee> salesEmployees = employees.stream()
		               											          .filter(e -> e.getDepartment().equals("SALES"))
		               											          .collect(toList());
		               
		return salesEmployees;
	}
	
	public static void findSumOfAllEmployeeSalaries(List<Employee> employees) {
        
		double totalSalary = employees.stream()
        		                                      .mapToDouble(e -> e.getSalary())
        		                                      .sum();  
      		  
	     System.out.println("Total Salary => " + totalSalary);                 
	}
	
	public static void findMaximumSalaryOfEmployee(List<Employee> employees) {
		
		OptionalDouble result = employees.stream()
															.mapToDouble(e -> e.getSalary())
															.max();
		
		if (result.isPresent()) {
			System.out.println("Maximum salary => " + result.getAsDouble());
		}
	}
	
	public static void findMinimumSalaryOfEmployee(List<Employee> employees) {
		
		OptionalDouble result = employees.stream()
															.mapToDouble(e -> e.getSalary())
															.min();
		
		if (result.isPresent()) {
			System.out.println("Minimum salary => " + result.getAsDouble());
		}
	}
	
	public static void findAverageSalaryOfEmployees(List<Employee> employees) {
		
		OptionalDouble result =  employees.stream()
					                                         .mapToDouble(e -> e.getSalary())
                                      		                .average();
		
		if(result.isPresent()) {
			System.out.println("Average salary => " + result.getAsDouble());
		}
	}
	
	public static void displayTop3HighestPaidEmployees(List<Employee> employees) {
		
		 employees.stream()
		                 .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
		                 .limit(3)
		                 .forEach(e -> System.out.println(e));			 
	}

	public static void displayAllEmployeesGroupByDepartments(List<Employee> employees) {
		
		 Map<String, List<Employee>> result =  employees.stream()
		                                                                          .collect(Collectors.groupingBy(e -> e.getDepartment()));
		
		 result.forEach((department, emps) -> {
			 System.out.println("Department => " + department);
			 emps.forEach(e -> System.out.println(e));
		 });
	}
	
}








 