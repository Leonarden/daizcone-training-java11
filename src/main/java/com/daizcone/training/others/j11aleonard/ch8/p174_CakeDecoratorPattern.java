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

public class p174_CakeDecoratorPattern {
	
	public static final String problem = "p174";
	public static final String title = "Implementing the Decorator Pattern with lambdas";
	
	
	
	
	public class Cake {

		  private final String decorations;

		  public Cake(String decorations) {
		    this.decorations = decorations;
		  }

		  public Cake decorate(String decoration) {
		    return new Cake(getDecorations() + decoration);
		  }

		  public String getDecorations() {
		    return decorations;
		  }
		
	}
	
	
	
	
	public class CakeDecorator {

		
		  private Function<Cake, Cake> decorator;

		  
		  public CakeDecorator(Function<Cake, Cake>... decorations) {
		    reduceDecorations(decorations);
		  }

		  
		  public Cake decorate(Cake cake) {
		    return decorator.apply(cake);
		  }

		  
		  private void reduceDecorations(Function<Cake, Cake>... decorations) {
		    decorator = Stream.of(decorations)
		      .reduce(Function.identity(), Function::andThen);
		 
		  }
	  
	
	}	
	
	
	public static void run() {
		
		System.out.println("Running problem: " + problem);
		System.out.println("Problem title: "+ title);
		p174_CakeDecoratorPattern problem = new p174_CakeDecoratorPattern();
		CakeDecorator nutsAndCream = null;
		CakeDecorator saltAndPepper = null;
		p174_CakeDecoratorPattern.Cake cake = null;
		
				
		
		try {
		
			//Decorator 1
			nutsAndCream = problem.new CakeDecorator((p174_CakeDecoratorPattern.Cake c) -> c.decorate(" with Nuts"), (p174_CakeDecoratorPattern.Cake c) -> c.decorate(" with Cream") );

			//Decorator 2
			saltAndPepper = problem.new CakeDecorator((Cake c) -> c.decorate(" with Salt"),(Cake c) -> c.decorate(" with Pepper"));

			
			cake = saltAndPepper.decorate(nutsAndCream.decorate(problem.new Cake("Base cake")));

			
			// Base cake with Nuts with Cream
		     System.out.println(cake.getDecorations());

		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	
	} 
	
	
}
