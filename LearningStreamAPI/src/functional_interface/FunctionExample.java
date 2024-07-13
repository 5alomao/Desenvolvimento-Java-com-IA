package functional_interface;

import java.util.Arrays;
import java.util.List;

// Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
// É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

public class FunctionExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//		Function<Integer, Integer> doubleNumber = number -> number * 2;

		List<Integer> doubledNumbers = numbers.stream().map(num -> num * 2).toList();

		doubledNumbers.forEach(System.out::println);
	}

}
