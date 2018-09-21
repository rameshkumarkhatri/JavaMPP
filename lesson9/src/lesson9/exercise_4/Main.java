package lesson9.exercise_4;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
	//Use the reduce method to produce a single space-separated String
	public static void main(String[] args) {
		Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
//		Optional<String> optionalS = (Optional<String>) strings.reduce("", (x, y) -> x+" "+y).

		Optional<String> optional = strings.reduce((o, o2) -> o +" "+o2);
		if(optional.isPresent())
			System.out.println(optional.get());

		
	}

}
