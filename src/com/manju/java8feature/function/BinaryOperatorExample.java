package com.manju.java8feature.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comp = (a,b)-> a.compareTo(b);
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryVar = (a,b)->a*b;		
		System.out.println(binaryVar.apply(5,4));
		
		BinaryOperator<Integer> maxByVar = BinaryOperator.maxBy(comp);
		System.out.println(maxByVar.apply(4,6));
		
		BinaryOperator<Integer> minByVar = BinaryOperator.minBy(comp);
		System.out.println(minByVar.apply(4,6));

	}

}
