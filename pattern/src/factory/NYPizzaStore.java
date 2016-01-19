/**
 * 
 */
package factory;

/**
 * @author 정명성
 * create date : 2016. 1. 19.
 * factory.NYPizzaStore.java
 */
public class NYPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see factory.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		return new NYStyleCheesePizza();
	}

}
