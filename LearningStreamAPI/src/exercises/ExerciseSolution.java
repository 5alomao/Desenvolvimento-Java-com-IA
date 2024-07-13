package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseSolution {

	private ExerciseSolution() {

	}

	public static List<Integer> sortAsc(List<Integer> numbers) {
		List<Integer> sortedNumbers = new ArrayList<>(numbers);

		return sortedNumbers.stream().sorted().toList();
	}

	public static int sumEvenNumbers(List<Integer> numbers) {
		return numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
	}

	public static boolean allPositive(List<Integer> numbers) {
		return numbers.stream().allMatch(n -> n >= 0);
	}

	public static List<Integer> removeAllOddNumbers(List<Integer> numbers) {
		List<Integer> evenNumbers = new ArrayList<>(numbers);
		evenNumbers.removeIf(n -> n % 2 != 0);
		return evenNumbers;
	}

	public static double averageOfNumbersGreaterThanFive(List<Integer> numbers) {
		return numbers.stream().filter(n -> n > 5).collect(Collectors.averagingInt(n -> n));
	}

	public static boolean anyNumberGreaterThanTen(List<Integer> numbers) {
		return numbers.stream().anyMatch(n -> n > 10);
	}

	public static int getSecondLargestNumber(List<Integer> numbers) {
		List<Integer> sortedNumbers = numbers.stream().distinct().sorted().toList();
		return sortedNumbers.get(sortedNumbers.size() - 2);

	}

	public static int sumDigits(List<Integer> numbers) {
		int result = numbers.stream().mapToInt(n -> {
			int num = n;
			int digitSum = 0;
			while (num != 0) {
				int digit = num % 10;
				digitSum += digit;
				num /= 10;
			}
			return digitSum;
		}).sum();

		return result;
	}

	public static boolean areAllDistinct(List<Integer> numbers) {
		return numbers.stream().distinct().count() == numbers.size();
	}

	public static List<Integer> groupOddMultiplesOfThreeOrFive(List<Integer> numbers) {
		List<Integer> responseList = new ArrayList<>(numbers);
		responseList = responseList.stream().filter(n -> n % 2 != 0).filter(n -> n % 3 == 0 || n % 5 == 0).toList();
		return responseList;
	}

	public static int sumOfSquareNumbers(List<Integer> numbers) {
		return numbers.stream().mapToInt(n -> n * n).sum();
	}

	public static int multiplyNumbers(List<Integer> numbers) {
		return numbers.stream().reduce(1, (n1, n2) -> n1 * n2);
	}

	public static List<Integer> numberIsInRange(List<Integer> numbers, int start, int end) {
		List<Integer> inRangeNumbers = new ArrayList<>(numbers);
		return inRangeNumbers.stream().filter(n -> n >= start && n <= end).toList();
	}

	public static int getLargestPrime(List<Integer> numbers) {
		return numbers.stream().filter(ExerciseSolution::isPrime).max(Integer::compareTo)
				.orElseThrow(() -> new RuntimeException("No prime numbers found"));
	}

	private static boolean isPrime(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

	public static boolean anyNegativeNumber(List<Integer> numbers) {
		return numbers.stream().anyMatch(n -> n < 0);
	}

	public static Map<String, List<Integer>> groupNumbers(List<Integer> numbers) {
		Map<String, List<Integer>> mapNumbers = new HashMap<>();

		mapNumbers.put("even", numbers.stream().filter(n -> n % 2 == 0).toList());
		mapNumbers.put("odd", numbers.stream().filter(n -> n % 2 != 0).toList());

		return mapNumbers;
	}

	public static List<Integer> getPrimeNumbers(List<Integer> numbers) {
		List<Integer> primeList = new ArrayList<>(numbers);
		return primeList.stream().filter(ExerciseSolution::isPrime).toList();
	}

	public static boolean allNumbersEqual(List<Integer> numbers) {
		return numbers.stream().distinct().count() == 1;
	}

	public static int sumMultiplyNumbers(List<Integer> numbers) {
		return numbers.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, Integer::sum);
	}
}
