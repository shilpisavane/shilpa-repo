package com.sayali.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,100,"sayali"));
		employees.add(new Employee(2,600,"trisha"));
		employees.add(new Employee(3,6600,"rahul"));
		employees.add(new Employee(4,400,"diksha"));
		
		
		Comparator<Employee> comparator = (o1,o2)->(o1.salary>o2.salary)?1:(o1.salary<o2.salary)?-1:0;
		Collections.sort(employees, comparator);
		employees.forEach(emp->{
			System.out.println(emp);
		});

		Comparator<Employee> comparator1 = (o1,o2)->(o1.name.compareTo(o2.name)>0)?1:(o1.name.compareTo(o2.name)<0)?-1:0;
		Collections.sort(employees, comparator1);
		
		
		employees.forEach(emp->{
			System.out.println(emp);
		});

	}
	
}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.name.compareTo(o2.name)>0){
			
		}
		
		return 0;
	}
	
}

class Employee {	
	int id;
	int salary; 
	String name;
	
	public Employee(int i, int salary, String name) {
		this.id=i;
		this.salary=salary;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "id :"+ id+ " salary : "+salary+" name: "+name;
	}
}