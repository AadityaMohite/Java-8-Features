package com.functionalPrograming.MethodReference;

public class Main {
  public static void main(String[] args) {
	
	  
	  Aadi aadi = new Aadi();
	  
	  Test test = aadi::fun;
	  
	  test.add();
	  
	  
	  Test test2 = aadi::run;
	  
	  test2.add();
	  
	  Test test3 = Aadi::new;
	  test3.add();
	  
}
}
