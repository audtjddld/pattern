package factory;

/**
 * @author 정명성
 * create date : 2016. 1. 19.
 * factory.SimplePizzaFactory.java
 */
public class SimplePizzaFactory {
	public Pizza createPizza (String type) {
		Pizza pizza = null;
		
		// orderPizza() 메소드에서 뽑아낸 코드(피자의 종류를 결정)
		if(type.equals("cheese")){
			pizza = new ChicagoStyleCheesePizza();
		}
		
		return pizza;
	}
}
