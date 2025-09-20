package com.daizcone.training.others.j11aleonard.ch8;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.daizcone.training.others.j11aleonard.Melon;

public class p173_Formula {

	
	public static final String problem = "p173";
	public static final String title = "Implementing the Loan Pattern (Interpreter)";
	
	private double result;
	private Scanner scanner=null;
	
	public p173_Formula() {
		new p173_Formula(new Scanner(System.in));
	}
	
	public p173_Formula(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public double compute( Function<p173_Formula, Double> f , Scanner scanner ) throws IOException {

		  p173_Formula formula = new p173_Formula(scanner);
		  double result = 0.0d;

		  try {
			  if (f!=null)
		  
			  result = f.apply(formula);
		  
		  } finally {
		    
			  formula.close();
		  
		  }

		  return result;
		}
	
	
	public p173_Formula add() {
		  if (scanner.hasNextDouble()) {
		    result += scanner.nextDouble();
		  }

		  return this;
		}

	public p173_Formula minus() {
		 if (scanner.hasNextDouble()) {
		    result -= scanner.nextDouble();
		  }

		  return this;
		}

	public p173_Formula multiplyWithSqrt() {
		  if (scanner.hasNextDouble()) {
		    result *= Math.sqrt(scanner.nextDouble());
		  }

		  return this;
		}
		//Since the result of the computation (the formula) is a double, we need to provide a Terminal method that returns the final result:

	public double result() {
		  return result;
	}
	
	public Scanner scanner() {
		return this.scanner;
	}
	
	private void close() {
	
		try {
			  
		    result = 0.0d;
		  }
		  finally {
			  scanner.close();
		  }
		
	}
	
	public static void run() {
		
		System.out.println("Running problem: " + problem);
		System.out.println("Problem title: "+ title);
		
		
		Readable sstream = new StringReader("1.4 3.14 2.83 3.1");
		
		Scanner scanner = new Scanner(sstream);
		Double result = 0.0d;
		
		p173_Formula f0 = new p173_Formula(scanner);
		p173_Formula f1 = new p173_Formula(scanner);
		try {
		
		result = f0.compute( t ->  t.minus().add().multiplyWithSqrt().result() , scanner);
		
		System.out.println("Result f0: " + result);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	
	} 
	
	
}
