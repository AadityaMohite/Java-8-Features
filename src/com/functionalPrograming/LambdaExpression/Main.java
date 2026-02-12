package com.functionalPrograming.LambdaExpression;

import java.util.ArrayList;

public class Main  {
  public static void main(String[] args) {
	
	  
//       Test test = (int[] nums)->{
//    	    int sum = 0;
//    	   
//    	    for( int n : nums) {
//				
//    	    	    sum = sum+n;
//    	    
//			}
//    	    
//    	   
//    	      return sum;
//       };
//	  
//       
//       int[] num = {12,23,34,45,56};
//       
//       
//       int number = test.add(num);
//       System.out.print("Addition of an Array is : "+number);
	  
	  
//	  Test test = (int[]nums)->{
//		  int max = 0;
//		  
//		  for (int num : nums) {
//			
//			  if(num>max) {
//				
//				  max = num;  
//			  }  
//		}
//		  
//		  return max;
//	  };
//	  
//	  int[] number = {23,45,67,12,78,34};
//       
//	  int maximum = test.max(number);
//	  System.out.print("Maximum Number is : "+maximum);
	  
//	  Test test = (int[] nums)->{
//		  int evensum = 0;
//		  
//		  for(int num : nums) {
//			  if(num%2==0) {
//				  evensum = evensum+num;
//			  }
//		  }
//		  
//		  return evensum;
//	  };
//	  
//	  int[] arr = {12,34,45,56,667,78,89,90,63};
//	  
//	  int evensum = test.sumeven(arr);
//	  
//	  System.out.print(evensum);
//	  
//	  Test test = (names)->{
//		  
//		  for (String name : names) {
//			
//			 if(name.startsWith("S")) {
//				 return name;
//			 }
//			  
//			  
//		}
//		  
//		  
//		  
//		return "No name found Starting with S";
//		  
//	  };
//	  
//	  
//	  String [] names = {"Sahil","Sakshi","Raj","Ramesh"};
//	  
//	  String name = test.getString(names);
//	  
//	  System.out.println(name);
	  
//	  Test test = (student)->{
//		  
//		  
//		int id =  student.getId();
//		 String name = student.getName();
//		 String address = student.getAddress();
//		 
//		 System.out.println("ID: "+id);
//		 System.out.println("Name: "+name);
//		 System.out.println("Address: "+address);
//		  System.out.println("------------------------");
//		  
//	  };
//	  
//	  Student student = new Student(1,"Aadi", "mumbai");
//	  Student student2 = new Student(2,"Raj", "Pune");
//	  
//	  test.takeStudent(student);
//	   test.takeStudent(student2);
//	  
//	  Test test = (students)->{
//		  
//		  for (Student stu : students) {
//			
//			  System.out.println("ID: "+stu.getId());
//			  System.out.println("Name: "+stu.getName());
//			  System.out.println("Address: "+stu.getAddress());
//			  System.out.println("-----------------------");
//			  
//		}
//		  
//		  
//		  
//		  
//	  };
//	  
//	  Student s1 = new Student(1, "Aadi", "Mumbai");
//	  Student s2 = new Student(2, "Raj", "Pune");
//	  Student s3 = new Student(3, "Parth", "Banglore");
//	  
//	  Student[] students = {s1,s2, s3};
//	  
//	   test.getStudent(students);
	  
	  
//	  Test test = ( )->{
//		  
//		  Student s1 = new Student(1, "Aaditya", "Mumbai");
//		  Student s2 = new Student(2, "Vikram", "Chennai");
//		  
//		  
//		  Student [] students = new Student[2] ;
//		  
//		  students[0] = s1;
//		  students[1] =s2;
//		  
//		  
//		  return students;
//	  };
//	  
//	  
//	Student[] students = test.getStudent();
//	  
//	  for (Student student : students) {
//		
//		  System.out.println(student);
//	}
	  
	  
//	  Test test = ()->{
//		  ArrayList<Student> students = new ArrayList<>();
//		  
//		  students.add(new Student(1, "Aadi", "Mumbai"));
//		  students.add(new Student(2, "Vikraam", "Pune"));
//		  
//		  
//		  
//		  return students;
//	  };
	  
//	 ArrayList<Student> student = test.getStudents();
//	 
//	   System.out.println(student);
	  
	  
//	Test<Integer> test = (a,b)->{
//		System.out.println(a+b);
//	};
//	
//	test.add(12, 23);
//	
//	Test<Float> test2 = (a,b)->{
//		System.out.println(a+b);
//	};
//	test2.add(3.56f, 4.5f);
//	
//	Test <Double> test3 = (a,b)->{
//		System.out.println(a+b);
//	};
//	test3.add(23.67, 78.90);
//	
//	
//Test <String> test4 = (a,b)->{
//	System.out.println(a+b);
//};
//test4.add("Aadi", " Mohite");
//	
	  
//	  Test<Integer, String> test = (a,b)->{
//		  System.out.println(a+b);
//	  };
//	  test.add(12, "Aadi");
	
	
}
}
