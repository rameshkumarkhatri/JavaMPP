package lesson9.huutamhuyhn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelVersusNonParallelStreams {
	
	private static List<String> myStrings = new ArrayList<>();

	public static void main(String[] args) {
		myStrings.add("a");
		myStrings.add("b");
		myStrings.add("bb");
		myStrings.add("aa");
		myStrings.add("c");
		myStrings.add("d");
		myStrings.add("e");
		myStrings.add("dd");
		
		myStrings.parallelStream()
			.filter(s -> s.length() > 1)
			.map(String::toUpperCase)
			.sorted()
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("======================");

		myStrings.stream()
		.filter(s -> s.length() > 1)
		.map(String::toUpperCase)
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
