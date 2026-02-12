package com.functionalPrograming;

public class Calculator {

	static void Calculate(AO ao) {
		ao.Calculate(10, 20);
	}
	
	public static void main(String[] args) {
		
		
Calculator.Calculate(( a, b)-> System.out.println(a+b));
Calculator.Calculate(( a,  b) ->System.out.println(b-a));
Calculator.Calculate(( a, b)->System.out.println(a*b));
Calculator.Calculate(( a, b)-> System.out.println(a/b));
	}
	
}
