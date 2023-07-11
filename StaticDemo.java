package com.sayali.collection;

import java.util.function.Predicate;

public class StaticDemo{
	public static void main (String[] args){
		
		int[] x ={2,12,34,4,6,7,5,2,8};
		Predicate<Integer> p = i->i%2==0;
		
		Predicate<Integer> p1 = i->i>10;
		
		
		for (int j : x) {
			if(p.equals(12)){
				System.out.println(j);
			}
		}
				
	}
	
}

interface Interf{
	static void m1(){
		System.out.println("static method in iterface");
	}
	
}



