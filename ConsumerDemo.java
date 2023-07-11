package com.sayali.collection;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumer = s->System.out.println("hi"+s);
		
		consumer.accept(10);
				
	}
}
