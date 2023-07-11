package com.sayali.collection;

interface A{
	public void m1(int a, int b);
	
}

public class TestDemo {

	public static void main(String str[]){
		
		
		Runnable runnable = ()->{for (int i = 0; i < 5; i++) {
			System.out.println("child thread.. ");
		}};
		
		Thread  thread = new Thread(runnable);
		thread.start();
		
		A aInter = (a,b)->System.out.println("Sum :"+(a+b));
		aInter.m1(2,4);

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread ..");
		}
	}
}







