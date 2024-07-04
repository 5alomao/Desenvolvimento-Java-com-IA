package model.list.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {

	private List<Person> personList;

	public PersonList() {
		personList = new ArrayList<>();
	}

	public void addPerson(String name, int age, double height) {
		personList.add(new Person(name, age, height));
	}

	public List<Person> sortByAge() {
		List<Person> sortedPeopleByAge = new ArrayList<>(personList);
//		O 'sort' ordena por idade devido ao Override do compareTo na classe Person
		Collections.sort(sortedPeopleByAge);
		return sortedPeopleByAge;
	}

	public List<Person> sortByHeight() {
		List<Person> sortedPeopleByHeight = new ArrayList<>(personList);
		Collections.sort(sortedPeopleByHeight, new HeightComparator());
		return sortedPeopleByHeight;
	}

}
