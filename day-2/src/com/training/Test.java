package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.training.model.Dish;
import com.training.model.DishType;

public class Test {
	public static void main(String[] args) {

		List<Dish> menu = new ArrayList<>();

		menu.add(new Dish("Chicken", false, 800, DishType.MEAT));
		menu.add(new Dish("Mutton", false, 900, DishType.MEAT));
		menu.add(new Dish("French Fries", true, 530, DishType.OTHER));
		menu.add(new Dish("Rice", true, 350, DishType.OTHER));
		menu.add(new Dish("Fruit Salad", true, 120, DishType.OTHER));
		menu.add(new Dish("Pizza", true, 550, DishType.OTHER));
		menu.add(new Dish("Prawns", false, 300, DishType.FISH));
		menu.add(new Dish("Salmon", false, 450, DishType.FISH));

		// Find out name of the low calorie dishes (should be less than 400)
//		List<String> dishNames = new ArrayList<>();
//		
//		for (Dish dish: menu) {
//			if (dish.getCalories() < 400) {
//				dishNames.add(dish.getName());
//			}
//		}
//		
//		for (String dishName: dishNames) {
//			System.out.println(dishName);
//		}

		// Find out name of low calorie dishes (less than 400) and display them
		// according to calorie in ascending order.

//		List<Dish> lowCalorieDishes = new ArrayList<>();
//		
//		for (Dish dish: menu) {
//			if (dish.getCalories() < 400) 
//				lowCalorieDishes.add(dish);
//		}
//		
//		Comparator<Dish> c = new Comparator<Dish>() {
//
//			@Override
//			public int compare(Dish dish1, Dish dish2) {
//				return Integer.compare(dish1.getCalories(), dish2.getCalories());
//			}
//		};
//		
//		Collections.sort(lowCalorieDishes, c);
//		
//		List<String> lowCalorieDishNames = new ArrayList<>();
//		for (Dish dish: lowCalorieDishes) {
//			lowCalorieDishNames.add(dish.getName());
//		}
//		
//		for (String dishName: lowCalorieDishNames) {
//			System.out.println(dishName);
//		}

		// displayLowCalorieDishNamesInAscendingOrderOfTheirCalories(menu);
		// displayAllVegeterianDishes(menu);

		// checkIfMenuIsHavingAtleastOneVegeterianDish(menu);
		// checkIfMenuContainsAllVegeterianDishes(menu);
		// checkAllMenuItemsAreHealthy(menu);
		// findAnyVegeterianDish(menu);
		findFirstVegeterianDish(menu);
	}

	public static void displayLowCalorieDishNamesInAscendingOrderOfTheirCalories(List<Dish> menu) {

		// Predicate<Dish> p = (dish) -> dish.getCalories() < 400;
		// Comparator<Dish> c = (dish1, dish2) -> Integer.compare(dish1.getCalories(),
		// dish2.getCalories());
		// Function<Dish, String> f = (dish) -> dish.getName();

		Stream<Dish> stream = menu.stream();

		stream.filter(dish -> dish.getCalories() < 400)
				.sorted((dish1, dish2) -> Integer.compare(dish1.getCalories(), dish2.getCalories()))
				.map(dish -> dish.getName()).forEach(name -> System.out.println(name));
	}

	public static void displayAllVegeterianDishes(List<Dish> menu) {

		menu.stream().filter(dish -> dish.isVegeterian()).forEach(dish -> System.out.println(dish));
	}

	public static void checkIfMenuIsHavingAtleastOneVegeterianDish(List<Dish> menu) {

		boolean result = menu.stream().anyMatch(dish -> dish.isVegeterian());

		if (result)
			System.out.println("Menu is having vegeterian dishes.");
		else
			System.out.println("Menu is having all non-vegeterian dishes.");
	}
	
	public static void checkIfMenuContainsAllVegeterianDishes(List<Dish> menu) {
		
		boolean result = menu.stream()
										  .allMatch(dish -> dish.isVegeterian());
		
		if (result)
			System.out.println("Pure Veg Hotel");
		else
			System.out.println("Not Pure Veg Hotel");
	}
	
	public static void checkAllMenuItemsAreHealthy(List<Dish> menu) {
		
		boolean isHealthyFood = menu.stream()
										  .noneMatch(dish -> dish.getCalories() >= 1000);
		
		if (isHealthyFood)
			System.out.println("All menu dishes are healthy.");
		else
			System.out.println("Menu contains some unhealthy dishes.");
	}
	
	public static void findAnyVegeterianDish(List<Dish> menu) {
		
		Optional<Dish> result = menu.stream()
													.filter(dish -> dish.isVegeterian())
													.findAny();
		if (result.isPresent()) {
			System.out.println("Menu contains vegeterian dish.");
			System.out.println(result.get());
		}
		else
			System.out.println("Menu doesn't contain any vegeterian dish.");
	}
	
	public static void findFirstVegeterianDish(List<Dish> menu) {
		
		Optional<Dish> result = menu.stream()
													.filter(dish -> dish.isVegeterian())
													.findFirst();
		
		if (result.isPresent()) {
			System.out.println("Menu contains vegeterian dish.");
			System.out.println(result.get());
		}
		else
			System.out.println("Menu doesn't contain any vegeterian dish.");
	}
}








