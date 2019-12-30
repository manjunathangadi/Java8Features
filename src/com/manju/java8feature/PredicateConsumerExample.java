package com.manju.java8feature;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class PredicateConsumerExample {

	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

	static BiConsumer<String, List<String>> biConsumer01 = (name, activities) -> System.out
			.println(name + " : " + " " + activities);

	static Consumer<Student> studentConsumer = (student -> {
		if (p1.and(p2).test(student)) {
			biConsumer01.accept(student.getName(), student.getActivities());
		}
	});

	public static void main(String[] args) {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		printAllStudentGradeLevel3(allStudents);
	}

	private static void printAllStudentGradeLevel3(List<Student> allStudents) {
		allStudents.forEach(studentConsumer);
	}
}
