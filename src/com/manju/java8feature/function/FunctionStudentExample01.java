package com.manju.java8feature.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.manju.java8feature.PredicateStudentExample02;
import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class FunctionStudentExample01 {

	static Function<List<Student>, Map<String, Double>> studentData = (students -> {

		Map<String, Double> studentNameGpa = new HashMap();

		students.forEach((student -> {
			/*Here we are filtering the students only with the grade more than 3.9
			 *  show to filter out we are using the predicate interface*/
			
			if (PredicateStudentExample02.p1.test(student)) {
				studentNameGpa.put(student.getName(), student.getGpa());
			}
		}));

		return studentNameGpa;

	});

	public static void main(String[] args) {

		System.out.println(studentData.apply(StudentDataBase.getAllStudents()));

	}

}
