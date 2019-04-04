/**
 * 
 */
package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * @author 정명성 create date : 2016. 1. 13. decorator.condiment.Mocha.java
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see decorator.condiment.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 모카";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see decorator.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.5 + beverage.cost();
	}

	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub
		
	}

}
