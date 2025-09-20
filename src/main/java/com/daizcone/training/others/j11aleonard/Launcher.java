package com.daizcone.training.others.j11aleonard;

import com.daizcone.training.others.j11aleonard.ch8.p169_FruitFactory;
import com.daizcone.training.others.j11aleonard.ch8.p173_Formula;
import com.daizcone.training.others.j11aleonard.ch8.p174_CakeDecoratorPattern;

public class Launcher {

	protected static Integer CHAPTER = -1;
	protected static String CTITLE = "";
	
	
	
	
	public static void chapter_8() {
		CHAPTER = 8;
		CTITLE = "Introduction to Functional Programming";
		
		
		System.out.println("Chapter # : " + CHAPTER );
		System.out.println("Chapter title : " + CTITLE );
		//p168
		
		
		//p169
		p169_FruitFactory.run();
		
		//p173
		p173_Formula.run();
	
		//p174
		p174_CakeDecoratorPattern.run();
	

	}
	
	public static void main(String[] args) throws Exception {
		
		/*TODO:Invoke with relection...
		 * */
		
		chapter_8();
		
	}


}
