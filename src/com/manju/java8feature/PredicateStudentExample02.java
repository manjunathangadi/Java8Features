package com.manju.java8feature;

import java.util.List;
import java.util.function.Predicate;

import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class PredicateStudentExample02 {
	
	public static Predicate<Student> p1 = (student) -> student.getGradeLevel()>=3;
	public static Predicate<Student> p2 = (student) -> student.getGpa()>=3.9;
	
	public static void printStudentWithGradeLeve3() {
		List<Student> allStudents = StudentDataBase.getAllStudents();	
		allStudents.forEach(student->{
			if(p1.test(student))
				System.out.println(student);
			});		
	}	
	public static void printAllStudentBasedOnGPAandGrade() {
		List<Student> allStudents = StudentDataBase.getAllStudents();		
		allStudents.forEach(student->{
			if(p1.and(p2).test(student))
				System.out.println(student);
			});		
	}
	public static void main(String[] args) {
		//printStudentWithGradeLeve3();
		printAllStudentBasedOnGPAandGrade();
		
	}

}
