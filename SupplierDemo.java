package com.sayali.collection;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		Supplier<String>  supplier = ()->{
			return "sayali";
		};
		System.out.println(supplier.get());
	}

}
