package com.manju.java8feature.function;

import java.util.function.Function;

public class FunctionExample01 {
	
	static Function<String,String> functionVar =  (name)->name.toUpperCase();
	static Function<String,String> concatVar =  (name)->name.toUpperCase().concat("Angadi");
	
	
	public static void main(String[] args) {
		
		System.out.println(functionVar.apply("manju "));
		System.out.println(functionVar.andThen(concatVar).apply("manju "));
		System.out.println(functionVar.compose(concatVar).apply("manju "));
		
	}

}
