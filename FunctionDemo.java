package com.sayali.collection;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		Function<Integer, Integer> f = i->i*i;
		
		Function<String, String> f1 = i->i.toUpperCase();
		
		System.out.println(f.apply(15));

		System.out.println(f1.apply("sayali"));
		
		Function<Integer,Integer> f2=i->2*i;
		Function<Integer,Integer> f3=i->i*i*i;
		
		System.out.println(f2.andThen(f3).apply(2));
		
		System.out.println(f2.compose(f3).apply(2));

	}
}


