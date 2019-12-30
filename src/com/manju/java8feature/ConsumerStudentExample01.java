package com.manju.java8feature;

import java.util.List;
import java.util.function.Consumer;

import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class ConsumerStudentExample01 {

	public static void printNameAndActivities() {
		
		Consumer<Student> studentNames = (student)->System.out.print(student.getName() + ":");
		Consumer<Student> studentActvitites = (student)->System.out.println(student.getActivities());
		
		List<Student> listOfStrudents = StudentDataBase.getAllStudents();
		
		listOfStrudents.forEach(studentNames.andThen(studentActvitites));
		
	}
	
	public static void printNameAndActivitiesForGrade3() {
		
		Consumer<Student> studentNames = (student)->System.out.print(student.getName() + ":");
		Consumer<Student> studentActvitites = (student)->System.out.println(student.getActivities());
		
		List<Student> listOfStrudents = StudentDataBase.getAllStudents();
		
		listOfStrudents.forEach(student->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				studentNames.andThen(studentActvitites).accept(student);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		
		printNameAndActivities();
		System.out.println("List Of Students with Grade 3");
		printNameAndActivitiesForGrade3();
	}

}
