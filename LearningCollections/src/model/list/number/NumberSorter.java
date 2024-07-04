package model.list.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorter {

	private List<Integer> numbers;

	public NumberSorter() {
		this.numbers = new ArrayList<>();
	}

	public void addNumber(int number) {
		numbers.add(number);
	}
	
	public List<Integer> sortAsc() {

		List<Integer> sortedASC = new ArrayList<>(numbers);
		Collections.sort(sortedASC);

		return sortedASC;
	}
	
	public List<Integer> sortDesc() {
		
		List<Integer> sortedDesc = new ArrayList<>(numbers);
		Collections.sort(sortedDesc, new DescendingComparator());
		
		return sortedDesc;
	}
	
	public void displayNumbers() {
		System.out.println(numbers);
	}

}
