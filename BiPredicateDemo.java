package com.sayali.collection;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate = (a,b)-> (a+b)%2==0;
		System.out.println(biPredicate.test(10, 20));
		
		BiFunction<Integer,Integer, Integer>  biFunction = (a,b)->(a*b);
		System.out.println(biFunction.apply(10, 20));
	}
}
