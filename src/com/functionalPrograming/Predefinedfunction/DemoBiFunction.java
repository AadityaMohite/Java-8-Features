package com.functionalPrograming.Predefinedfunction;

import java.util.function.BiFunction;

public class DemoBiFunction {
  public static void main(String[] args) {
	
	 BiFunction<Integer, String, Float> biFunction  =(x,y)->{
		 
		 
		 return 23.034f;
		 
	 };
	  
	Float fuFloat =  biFunction.apply(23, "Aadi");
	  
	 System.out.println(fuFloat);
	  
}
}
