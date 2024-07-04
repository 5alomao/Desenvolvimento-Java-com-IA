package model.list.sum;

import java.util.ArrayList;
import java.util.List;

public class IntegerSum {

	private List<Integer> numbers;

	public IntegerSum() {
		this.numbers = new ArrayList<>();
	}

	public void addNumber(int number) {
		numbers.add(number);
	}

	public int calculateSum() {
		int sum = 0;
		if (!numbers.isEmpty()) {
			for (Integer integer : numbers) {
				sum += integer;
			}
		}
		return sum;
	}

	public int findMax() {
		if (numbers.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}

		int max = numbers.get(0);

		for (Integer integer : numbers) {
			if (max < integer)
				max = integer;
		}

		return max;
	}

	public int findMin() {
		if (numbers.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}

		int min = numbers.get(0);

		for (Integer integer : numbers) {
			if (min > integer)
				min = integer;
		}

		return min;
	}

	public void displayNumbers() {
		System.out.println(numbers);
	}
}
