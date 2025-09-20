package com.daizcone.training.others.j11aleonard.ch8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.daizcone.training.others.j11aleonard.Apple;
import com.daizcone.training.others.j11aleonard.Fruit;
import com.daizcone.training.others.j11aleonard.Melon;
import com.daizcone.training.others.j11aleonard.Peach;

public class p169_FruitFactory {


	public static final String problem = "p169";
	public static final String title = " Factory method pattern ";
	
	
	protected p169_FruitFactory() {
		
	}
	
	static Map<String,Supplier<Fruit>> factory = new HashMap<String,Supplier<Fruit>>();
	
	static {
		//Note: for constructors with many arguments we need N-Function instead of a Supplier<Fruit>
		factory.put("Apple",Apple::new);
		factory.put("Peach", Peach::new);
	}
	
	public static Fruit newInstance(Class<?> clazz) {
		
		Fruit ret = null;
		try {
		
			ret = (Fruit) factory.get(clazz.getSimpleName()).get(); //it's a supplier so get()
		
		}catch(IllegalArgumentException iex) {
			Exception e = new Exception(iex.getMessage() + " And  Wrong type of fruit!");
			e.printStackTrace();
		}
		
		return ret;
		
	}
	

	public static void run() {
		
		System.out.println("Running problem: " + problem);
		System.out.println("Problem title: "+ title);
		
		Map<Class<?>,Fruit> testFactoryMethod = new HashMap<>();
		testFactoryMethod.put(Apple.class, null);
		testFactoryMethod.put(Peach.class, null);
		
		//calling factory
		for(Class<?> clazz: testFactoryMethod.keySet()) {
			Fruit f = p169_FruitFactory.newInstance(clazz); //<- factory metod invocation
			if(f!=null)
				System.out.println("Fruit class: " + f.getClass().getSimpleName() + " object hash: " + f.hashCode());
		
			testFactoryMethod.put(clazz, f); 
		
		}
		
		
		//asserts
		assert(testFactoryMethod.get(Apple.class)!= null);
		assert(testFactoryMethod.get(Peach.class)!= null);
		
		
		return;
	} 
	
}
