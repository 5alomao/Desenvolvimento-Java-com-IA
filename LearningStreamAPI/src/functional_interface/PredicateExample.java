package functional_interface;

import java.util.Arrays;
import java.util.List;

// Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
// É utilizada para filtrar os elementos do Stream com base em alguma condição

public class PredicateExample {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("java", "kotlin", "javascript", "python", "c", "go", "ruby");

//		Predicate<String> moreThanFiveCharacters = word -> word.length() > 5;

		words.stream().filter(word -> word.length() < 5).forEach(System.out::println);
	}

}
