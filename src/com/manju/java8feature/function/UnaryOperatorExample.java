package com.manju.java8feature.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	/*Unary Operator Takes the single input and returns the same output*/	
	static UnaryOperator<String> unaryVariable = (name)->name.concat(" Angadi");
	public static void main(String[] args) {
		System.out.println(unaryVariable.apply("Manjunath"));
	}

}
