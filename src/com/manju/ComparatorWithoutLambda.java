package com.manju;

import java.util.Comparator;

public class ComparatorWithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Comparator<Integer> comparing = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Compartor Without Using the Lambda Expression " + comparing.compare(52,45));
		
	}

}
