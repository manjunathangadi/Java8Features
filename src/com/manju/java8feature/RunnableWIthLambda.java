package com.manju.java8feature;

public class RunnableWIthLambda {

	public static void main(String[] args) {

		Runnable runMethod = () -> {
			System.out.println("Inside Runable With Lambda Feature");

		};
		new Thread(runMethod).start();

		System.out.println("================================================================");
		Runnable runMethod1 = () -> System.out.println("Inside Runable With Lambda Feature without curly braces");
		new Thread(runMethod1).start();

		System.out.println("================================================================");
		new Thread(() -> System.out.println("Inside Runable With Lambda Feature without runnable object")).start();
		System.out.println("================================================================");
	}

}
