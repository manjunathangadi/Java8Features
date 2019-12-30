package com.manju.java8feature;

import java.util.function.Consumer;

public class ConsumerExample01 {

	public static void main(String[] args) {
		
		Consumer<String> case01 = (s)->System.out.println(s.toUpperCase());

		case01.accept("manjunath");

	}

}
