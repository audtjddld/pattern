/**
 * 
 */
package factory;

/**
 * @author 정명성
 * create date : 2016. 1. 19.
 * factory.NYStyleCheesePizza.java
 */
public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NYStyle Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grate Reggiano Cheese");
	}
}
