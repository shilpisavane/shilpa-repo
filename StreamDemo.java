package com.sayali.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		ArrayList< Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(321);
		arrayList.add(40);
		
		List<Integer> list =arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> list1=arrayList.stream().map(i->(i*12)).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list);
		
		System.out.println(arrayList.stream().min((i,j) -> i.compareTo(j)));
	}
}


