package com.manju.java8feature;

import java.util.function.Predicate;

public class PredicateExample01 {
	
	static Predicate<Integer> p1 = (i) -> i % 2 == 0;
	static Predicate<Integer> p2 = (i) -> i % 5 == 0;
	//System.out.println(p1.test(10));
	
	public static void PredicateAndOperation() {
		System.out.println(p1.and(p2).test(10));
	}

	public static void PredicateOrOperation() {
		System.out.println(p1.or(p2).test(10));
	}
	
	public static void PredicateNegateOperation() {
		System.out.println(p1.or(p2).negate().test(10));
	}
	
	public static void main(String[] args) {
		
		PredicateAndOperation();
		PredicateOrOperation();
		PredicateNegateOperation();
	}

}
