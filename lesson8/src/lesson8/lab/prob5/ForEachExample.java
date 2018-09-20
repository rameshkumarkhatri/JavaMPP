package lesson8.lab.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format

		//1. USE LAMBDA EXPRESSION


		list.forEach(x -> printUpperCase(x));
		//2. USE DIRECT METHOD
		list.forEach(ForEachExample::printUpperCase);



//		list.forEach(x -> System.out.println(x.toUpperCase()));
//		// OR
//		list.forEach(x -> System.out.println(getUppderCase(x)));
//
//		//2. USE DIRECT METHOD
//		list.forEach(System.out::println);
	}

	private static String getUppderCase(String x) {
		Function<String, String> f =  String::toUpperCase;
		return f.apply(x);
	}

	private static void printUpperCase(String s) {
		System.out.println(s.toUpperCase());
	}

	//implement a Consumer
	
	
}