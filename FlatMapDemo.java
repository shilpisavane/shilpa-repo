package com.sayali.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlatMapDemo {

				
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		
		List<Integer> list2 = Arrays.asList(4,5,6);

		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> list4 = Arrays.asList(list1,list2,list3);
		
		
		System.out.println(list4);
		
		List<Integer> list5 = list4.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		System.out.println(list5);
		
		
		List<String> states = Arrays.asList("Gujrat","Goa","Maharashra","Kerala","Karnataka","Tamilnadu");
		
		Predicate<String> predicate = s -> s.startsWith("G");
		
		
		states.stream()
         .filter(predicate)
         .forEach(System.out::println);
	
	}
}
