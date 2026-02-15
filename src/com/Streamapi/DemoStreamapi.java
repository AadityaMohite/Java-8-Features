package com.Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamapi {
   public static void main(String[] args) {
	
	   
	   List<String> strings = Arrays.asList("Aadi","Rakesh","Ramesh","Aryan","Rohit");
	   
	   Stream<String> stream = strings.stream();
	   
	  Stream<String> changeStream = stream.filter(i->i.startsWith("A"));
	   
	    changeStream.forEach(i->{
	    	System.out.println(i);
	    });
	    
	    
	    List<Integer> integers = Arrays.asList(12,23,34,45,56,78);
	    Stream<Integer> stream2 = integers.stream();
	    
	      Stream<Integer> changeStream2 = stream2.filter(i->i%2==0);
	      
	      changeStream2.forEach(i->{
	    	  System.out.println(i);
	      });
	      
	      
	      Student stu = new Student(1, "Aadi", "Mumbai");
	      Student stu2 = new Student(2, "Raj", "Pune");
	      Student stu3 = new Student(3, "Vikram", "Mumbai");
	      Student stu4 = new Student(4, "Shrinath ", "Chennai");
	      
	      
	    List<Student> students =  List.of(stu,stu2,stu3,stu4);
	      
	    students.stream().filter(i->i.getCity().startsWith("M")).map(x->x.getName().toUpperCase()).forEach(y->System.out.println(y));
//	    
//	    stream3.filter(i->i.getCity().equals("Mumbai")).filter(i->i.getName().startsWith("V")).forEach(i->System.out.println(i));
	    
	    
	      
	    
	    
	    
	      
	    
}
}
