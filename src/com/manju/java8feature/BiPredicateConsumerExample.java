package com.manju.java8feature;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class BiPredicateConsumerExample {

	static BiPredicate<Integer, Double> biPredicateVar = (gradeVal,gpaVal)->gradeVal>=3 && gpaVal>=3.9;

//	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
//	static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

	static BiConsumer<String, List<String>> biConsumer01 = (name, activities) -> System.out
			.println(name + " : " + " " + activities);

	static Consumer<Student> studentConsumer = (student -> {
		if (biPredicateVar.test(student.getGradeLevel(),student.getGpa())) {
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
