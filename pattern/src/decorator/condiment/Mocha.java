/**
 * 
 */
package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * @author 정명성
 * create date : 2016. 1. 13.
 * decorator.condiment.Mocha.java
 */
public class Mocha extends CondimentDecorator{

	Beverage 	beverage;
	String 		size;

	public Mocha(Beverage beverage, String size) {
		// TODO Auto-generated constructor stub
		this.beverage 	= beverage;
		this.size 		= size;
	}
	
	/* (non-Javadoc)
	 * @see decorator.condiment.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return size == null ? beverage.getDescription() + ", 모카" : beverage.getDescription() + ", 모카 [ " + size + " ]";
	}

	/* (non-Javadoc)
	 * @see decorator.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return (1.5 * getSizePerCost()) + beverage.cost();
	}

	/* (non-Javadoc)
	 * @see decorator.condiment.CondimentDecorator#getSizePerCost()
	 */
	@Override
	public double getSizePerCost() {
		if (size.equals("tall")) {
			return 0.2;
		}else if(size.equals("grande")) {
			return 0.3;
		}else if(size.equals("venti")) {
			return 0.5;
		}else {
			return 1;
		}
	}

}
