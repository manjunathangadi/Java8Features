package com.manju.java8feature;

import java.util.List;
import java.util.function.BiConsumer;

import com.manju.java8feature.Data.Student;
import com.manju.java8feature.Data.StudentDataBase;

public class BiConsumerExample01 {

	public static void printNameandActvities() {

		List<Student> studentList = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumerVar = (name, actvities) -> System.out
				.println(name + " : " + actvities);
		studentList.forEach(student -> biConsumerVar.accept(student.getName(), student.getActivities()));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BiConsumer Example");
		BiConsumer<String, String> biConsumerVar = (a, b) -> System.out
				.println("Value of A is : " + a + " Value of B is : " + b);
		biConsumerVar.accept("Manjunath", "Angadi");

		System.out.println("BiConsumer Example for Airtihmetic Operations");
		BiConsumer<Integer, Integer> biConsumerAddVar = (a, b) -> System.out
				.println("Addition Of Two Numbers :" + (a + b));
		BiConsumer<Integer, Integer> biConsumerSubVar = (a, b) -> System.out
				.println("Substraction Of Two Numbers :" + (a - b));
		BiConsumer<Integer, Integer> biConsumerMultiVar = (a, b) -> System.out
				.println("Multiplication Of Two Numbers :" + (a * b));
		BiConsumer<Integer, Integer> biConsumerDivVar = (a, b) -> System.out
				.println("Division Of Two Numbers :" + (a / b));
		biConsumerAddVar.andThen(biConsumerSubVar).andThen(biConsumerMultiVar).andThen(biConsumerDivVar).accept(10, 5);

		System.out.println("Printing the list of the name and their actvities");

		printNameandActvities();

	}

}
