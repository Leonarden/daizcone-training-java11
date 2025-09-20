package com.daizcone.training.others.j11aleonard.ch8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.daizcone.training.others.j11aleonard.Melon;

public class p166_Filters {
	
	
	public static final String problem = "p166";
	public static final String title = "";
	//step 7
	Predicate<Melon> notNullMelonPred = new Predicate<Melon>() {	
		
		public boolean test(Melon m) {
			  return (m!=null);
	  		}
		  
	  };

	//step 9
	
	public static List<Melon> filterMelons(
		     List<Melon> melons, Predicate<Melon> pred) {

		  List<Melon> result = new ArrayList<>();

		  for (Melon melon: melons) {
		    if (melon != null && pred.test(melon)) {
		      result.add(melon);
		    }
		  }

		  return result;
		}

	
	
	public static void run() {
		System.out.println("Running problem: " + problem);
		System.out.println("Problem title: "+ title);
		
		
		
	} 
	
	
}
