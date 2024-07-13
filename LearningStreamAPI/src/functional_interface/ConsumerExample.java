package functional_interface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

// Utilizada para realizar ações ou efeitos colaterais nos elementos do Stream 
// sem modificar ou retornar um valor.

public class ConsumerExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//		Consumer<Integer> displayEvenNumbers = number -> {
//			if (number % 2 == 0) {
//				System.out.println(number);
//			}
//		};

//		numbers.stream().forEach(displayEvenNumbers);

		numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
	}
}
