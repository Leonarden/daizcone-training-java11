package com.daizcone.training.others.j11aleonard;

import java.util.Objects;

public class Melon implements Fruit {

	  private final String type;
	  private final int weight;
	  private final String origin;
	    

	  public Melon(String type, int weight, String origin) {
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
		return Objects.hash(type, weight,origin);
	  }

	  @Override
	  public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Melon other = (Melon) obj;
		return Objects.equals(type, other.type) && weight == other.weight && Objects.equals(origin, other.origin);
	  }
	  
	  @Override
	  public String toString() {
		return "Melon [type=" + type + ", weight=" + weight + ", origin=" + origin + "]";
	  }
	  
	  
	  
}