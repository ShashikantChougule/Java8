package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test2 {

	public static void main(String[] args) {

//		public interface Consumer<T> {  
//			   public void accept(T t);
//		}

		Consumer<String> c = (e) -> System.out.println(e);
		c.accept("Hello");
		c.accept("How are you???");

//		public interface Predicate<T> {
//		    public boolean test(T t);
//		}

		Predicate<Integer> p = (e) -> e % 2 == 0;
		System.out.println(p.test(23));
		System.out.println(p.test(24));

//		public interface Supplier<T> {
//		    public T get();
//		}

		Supplier<String> s = () -> "Bye";
		System.out.println(s.get());

		List<String> names = Arrays.asList("Alex", "Anna", "Adam", "Bob", "Jason", "Peter");

		System.out.println("Names => ");
		System.out.println("==========================");
		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
//		default void forEach(Consumer<String> c) {
//			if (c == null) throw new NullPointerException(); 
//			for (String s: this) {
//				c.accept(s);
//			}
//		}
		
		//Consumer<String> c1 = (name) -> System.out.println(name);
		//names.forEach(c1);
		
		names.forEach(name -> System.out.println(name));

	}
	
}










