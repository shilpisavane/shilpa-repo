package com.sayali.collection;

public class DiomandClass implements P1,P2{

	public static void  main(String[] args) {
		DiomandClass class1 = new DiomandClass();
		class1.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		P1.super.m1();
		P2.super.m1();
	}
}
interface P1{
	
	default void m1(){
		System.out.println("P1 method");
	}
}

interface P2{

	default void m1(){
		System.out.println("P2 method");
	}

}


