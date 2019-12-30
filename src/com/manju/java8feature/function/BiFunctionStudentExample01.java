package com.manju.java8feature.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.manju.java8feature.PredicateStudentExample02;
import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class BiFunctionStudentExample01 {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentData = ((student, studentPredicate) -> {
		Map<String, Double> studentsMap = new HashMap<>();
		student.forEach(students -> {
			if (studentPredicate.test(students)) {
				studentsMap.put(students.getName(), students.getGpa());
			}
		});
		return studentsMap;
	});

	public static void main(String[] args) {
		System.out.println("BiFunction Method Call to fetch the Students above Grade 3 ");
		System.out.println("====================== ");
		System.out.println(studentData.apply(StudentDataBase.getAllStudents(),PredicateStudentExample02.p1));
		
		System.out.println("BiFunction Method Call to fetch the Students Grade >= 3 and GPA >= 3.9 ");
		System.out.println("====================== ");
		System.out.println(studentData.apply(StudentDataBase.getAllStudents(),PredicateStudentExample02.p2));
	
	}

}
