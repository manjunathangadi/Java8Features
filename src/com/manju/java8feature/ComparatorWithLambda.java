package com.manju.java8feature;

import java.util.Comparator;

public class ComparatorWithLambda {

	public static void main(String[] args) {

		Comparator<Integer> comparing = (Integer a, Integer b) -> a.compareTo(b);

		System.out.println(
				"Comparing the Integers using Lambda Expression with TypeCasting " + comparing.compare(45, 55));

		Comparator<Integer> comparing1 = (a, b) -> a.compareTo(b);

		System.out.println(
				"Comparing the Integers using Lambda Expression without TypeCasting " + comparing1.compare(55, 55));

		// Comparator<Integer> comparing = (Integer a,Integer b) -> a.compareTo(b);

	}

}
