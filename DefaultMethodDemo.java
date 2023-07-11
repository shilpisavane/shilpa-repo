package com.sayali.collection;

public class DefaultMethodDemo implements Interface1{

	
	public static void main(String[] args) {
		
		DefaultMethodDemo demo = new DefaultMethodDemo();
		demo.test();
	}
	

	public void test() {
		System.out.println("override default method");
	}
}

interface Interface1{
	
	default void test() {
		System.out.println("inside default method");
	}
}

