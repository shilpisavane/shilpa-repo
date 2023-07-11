package com.sayali.collection;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		ArrayList< Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Sayali",65));
		students.add(new Student(2,"Trisha",90));
		students.add(new Student(3,"Sonali",80));
		students.add(new Student(4,"Diksha",60));
		students.add(new Student(5,"Vaibhavi",99));
		
		Predicate<Student> predicate = s -> s.percentage>50;
		Predicate<Student> predicate1 = s -> s.name.startsWith("S");
		
		for (Student student : students) {
			if(predicate.and(predicate1).test(student)){
				System.out.println(student);
			}
		}
		
		
		Function<Student, String> f=s->{
			String grade="";
			if(s.percentage>=80) grade="A";
			else if(s.percentage>=70) grade="B"; 
			else if(s.percentage>=60) grade="C";
			else if(s.percentage>=40) grade="D";
			return grade;
		};
		
		for (Student student : students) {
			System.out.println(student + " grade : "+ f.apply(student));
		}
	}
}

class Student {
	
	int id;
	String name;
	int percentage;
	
	public Student() {
	}
	
	public Student(int id,String name,int percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+this.id+" name : "+this.name+" percentage : "+this.percentage;
	}
}