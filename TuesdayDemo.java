package com.sayali.collection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TuesdayDemo {

		
	public static void main(String[] args) {
		int[] array = {5,2,8,3,1};
		IntStream stream =  Arrays.stream(array);
		
			stream.sorted().forEach(System.out::println);
		
	}
}
