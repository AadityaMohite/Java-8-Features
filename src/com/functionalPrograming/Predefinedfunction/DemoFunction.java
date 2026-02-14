package com.functionalPrograming.Predefinedfunction;

import java.util.function.Function;

import com.functionalPrograming.LambdaExpression.Student;

public class DemoFunction {
  public static void main(String[] args) {
	
//	  
//	  Function<Integer , String> f = (num)->{
//		
//		 return "Aadi"; 
//	  };
//	  
//	 System.out.println(f.apply(1000));
	 
//	 
//	 Function<int[],Integer> numFunction =(num)->{
//		 int sum = 0;
//		 
//		 for (int nums :num ) {
//			sum = + nums;
//		}
//		 
//		 return sum;
//	 };
//	System.out.println(numFunction.apply(new int[]{12,23,34}));
	  Function<Student ,Student> stu = (student2)->{
		 return new Student(1, "Aadi", "Mumbai");
	  };
	
	  
	  
	  
	  
	Student students = stu.apply(new Student(1, "Aadi", "Mumbai"));
	System.out.print(students);
	  
	  
}
}
