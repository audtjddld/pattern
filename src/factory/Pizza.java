/**
 * 
 */
package factory;

import java.util.ArrayList;

/**
 * @author 정명성
 * create date : 2016. 1. 15.
 * factory.Pizza.java
 */
public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	// 준비
	void prepare() {
	    System.out.println("Preparing " + name);
	    System.out.println("Tossing dough..");
	    System.out.println("Adding sauce... ");
	    System.out.println("Adding toppings: ");
	    
	    for(int i=0; i< toppings.size(); i++) {
	      System.out.println("  "+ toppings.get(i));
	    }
	}
	
	// 굽기
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	// 자르기
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	// 포장
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	// 피자 이름 가져오기
	public String getName() {
		return name;
	}
	
}
