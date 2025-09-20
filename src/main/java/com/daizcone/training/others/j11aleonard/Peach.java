package com.daizcone.training.others.j11aleonard;

import java.util.Objects;

public class Peach implements Fruit {

	  private  String type;
	  private  int weight;
	  private  String origin;
	    
	  public Peach() {
		  
	  }

	  public Peach(String type, int weight, String origin) {
		super();
		this.type = type;
		this.weight = weight;
		this.origin = origin;
	}

	  public String getType() {
		  return type;
	  }
	  
	  public int getWeight() {
		  return weight;
	  }
	   
	  public String getOrigin() {
		return origin;
	}

	  @Override
	  public int hashCode() {
		return Objects.hash(type, weight,origin, Math.random()*12);
	  }

	  @Override
	  public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peach other = (Peach) obj;
		return Objects.equals(type, other.type) && weight == other.weight && Objects.equals(origin, other.origin);
	  }
	  
	  @Override
	  public String toString() {
		return "Peach [type=" + type + ", weight=" + weight + ", origin=" + origin + "]";
	  }
	  
	  
	  
}