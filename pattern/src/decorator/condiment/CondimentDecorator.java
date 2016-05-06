/**
 * 
 */
package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * @author 정명성
 * create date : 2016. 1. 13.
 * decorator.condiment.CondimentDecorator.java
 */
public abstract class CondimentDecorator extends Beverage {
	
	double sizePercentCharge;
	
	public abstract String getDescription();

}
