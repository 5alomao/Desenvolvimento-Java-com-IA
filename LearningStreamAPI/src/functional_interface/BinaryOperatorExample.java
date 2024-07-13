package functional_interface;

import java.util.Arrays;
import java.util.List;

// Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo
// É utilizada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos

public class BinaryOperatorExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//		BinaryOperator<Integer> sum = (n1, n2) -> n1 + n2;

		int result = numbers.stream().reduce(0, Integer::sum);

		System.out.println(result);

	}
}
