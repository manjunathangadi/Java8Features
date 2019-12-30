package com.manju;

public class RunnableWithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("I am Runnable prior to Java8");
				
			}
		};
		
		Thread t1 = new Thread(runnable);
		
		t1.start();
		

	}

}
