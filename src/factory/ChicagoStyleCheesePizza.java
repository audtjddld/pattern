package factory;

/**
 * @author 정명성
 * create date : 2016. 1. 19.
 * factory.ChicagoStyleCheesePizza.java
 */
public class ChicagoStyleCheesePizza extends Pizza {

	
	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
