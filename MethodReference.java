package com.sayali.collection;

public class MethodReference {

	public static void m1(){
		System.out.println("m1() method");
	}
	
	public static void main(String[] args) {
		
		Test r= MethodReference::m1;
		r.m1();
		
	}
	
}
interface Test{
	public void m1();
}
