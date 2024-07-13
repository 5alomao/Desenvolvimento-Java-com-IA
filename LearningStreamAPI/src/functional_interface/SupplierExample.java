package functional_interface;

import java.util.List;
import java.util.stream.Stream;

// Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
// É utilizada para criar ou fornecer novos objetos de um determinado tipo.

public class SupplierExample {

	public static void main(String[] args) {

//		Supplier<String> greeting = () -> "Olá, seja bem vindo(a)!";

		List<String> greetingList = Stream.generate(() -> "Olá, seja bem vindo(a)!").limit(3).toList();

		greetingList.forEach(System.out::println);
	}
}
