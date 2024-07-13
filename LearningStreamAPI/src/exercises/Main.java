package exercises;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> test = List.of(3, 5, 9);

		// EX01
		System.out.println(ExerciseSolution.sortAsc(numbers));

		// EX02
		System.out.println(ExerciseSolution.sumEvenNumbers(numbers));

		// EX03
		System.out.println(ExerciseSolution.allPositive(numbers));

		// EX04
		System.out.println(ExerciseSolution.removeAllOddNumbers(numbers));

		// EX05
		System.out.println(ExerciseSolution.averageOfNumbersGreaterThanFive(numbers));

		// EX06
		System.out.println(ExerciseSolution.anyNumberGreaterThanTen(numbers));

		// EX07
		System.out.println(ExerciseSolution.getSecondLargestNumber(numbers));

		// EX08
		System.out.println(ExerciseSolution.sumDigits(numbers));

		// EX09
		System.out.println(ExerciseSolution.areAllDistinct(numbers));

		// EX10
		System.out.println(ExerciseSolution.groupOddMultiplesOfThreeOrFive(numbers));

		// EX11
		System.out.println(ExerciseSolution.sumOfSquareNumbers(numbers));

		// EX12
		System.out.println(ExerciseSolution.multiplyNumbers(numbers));

		// EX13
		System.out.println(ExerciseSolution.numberIsInRange(numbers, 5, 8));

		// EX14
		System.out.println(ExerciseSolution.getLargestPrime(numbers));

		// EX15
		System.out.println(ExerciseSolution.anyNegativeNumber(numbers));

		// EX16
		Map<String, List<Integer>> mapEx16 = ExerciseSolution.groupNumbers(numbers);
		System.out.println(mapEx16.get("even"));
		System.out.println(mapEx16.get("odd"));

		// EX17
		System.out.println(ExerciseSolution.getPrimeNumbers(numbers));

		// EX18
		System.out.println(ExerciseSolution.allNumbersEqual(numbers));

		// EX19
		System.out.println(ExerciseSolution.sumMultiplyNumbers(numbers));

	}
}
