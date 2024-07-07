package model.set.student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {

	private Set<Student> students;

	public StudentManager() {
		students = new HashSet<>();
	}

	public void addStudent(long registrationNumber, String name, double grade) {
		students.add(new Student(registrationNumber, name, grade));
	}

	public Student removeStudent(long registrationNumber) {
		Student studentFromRemove = null;

		if (!students.isEmpty()) {
			for (Student student : students) {
				if (student.getRegistrationNumber() == registrationNumber) {
					studentFromRemove = student;
					students.remove(studentFromRemove);
					break;
				}
			}
		}

		return studentFromRemove;
	}

	public Set<Student> sortByName() {
		Set<Student> sortedStudentsByName = new TreeSet<>(students);
		return sortedStudentsByName;
	}

	public Set<Student> sortByGrade() {
		Set<Student> sortedStudentsByGrade = new TreeSet<>(new StudentGradeComparator());
		sortedStudentsByGrade.addAll(students);
		return sortedStudentsByGrade;
	}

	public void displayStudents() {
		System.out.println(students);
	}
}
