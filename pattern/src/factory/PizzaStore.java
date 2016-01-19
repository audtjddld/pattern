/**
 * 
 */
package factory;

/**
 * @author 정명성
 * create date : 2016. 1. 19.
 * factory.PizzaStore.java
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		// 팩토리 객체가 아닌 PizzaStore에 있는 createPizza를 호출하게 됨
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
	
	// 기타 메소드
	
	// 팩토리 멧드가 PizzaStore의 추상메소드로 바뀜
	
	// Pizza 인스턴스를 만드는 일은 이제 팩토리 역할을 하는 메소드에서 맡아서 처리
	
}
