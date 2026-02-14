package com.functionalPrograming.Predefinedfunction;

import java.util.function.BiPredicate;

public class DemoBiPredicate {

	  public static void main(String[] args) {
		
		  
		  
		 BiPredicate<Integer,Integer> biPredicate =(x,y)->{
			 
			 
			 return x>y;
			 
		 };
		 
		 System.out.println(biPredicate.test(12, 10));
		  
		  
	}
	
	
}
