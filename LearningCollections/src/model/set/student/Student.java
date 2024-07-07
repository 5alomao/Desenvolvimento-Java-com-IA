package model.set.student;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private long registrationNumber;
	private String name;
	private double grade;

	public Student(long registrationNumber, String name, double grade) {
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}

	public double getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registrationNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return registrationNumber == other.registrationNumber;
	}

	@Override
	public String toString() {
		return "Registration-Number: " + this.registrationNumber + ", Name: " + this.name + ", Grade: " + this.grade;
	}
}
