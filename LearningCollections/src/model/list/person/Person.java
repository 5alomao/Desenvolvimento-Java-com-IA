package model.list.person;

import java.util.Comparator;

public class Person implements Comparable<Person> {

	private String name;
	private double height;
	private int age;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public int compareTo(Person p) {
		return Integer.compare(age, p.getAge());
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age:" + age + ", Height:" + height;
	}

}
