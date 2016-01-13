/**
 * 
 */
package decorator.beverage;

import decorator.size.Size;

/**
 * @author 정명성
 * create date : 2016. 1. 13.
 * decorator.beverage.HubTee.java
 */
public class HubTee extends Beverage{

	
	public HubTee() {
		// TODO Auto-generated constructor stub
		description = "허브티";
	}
	
	/* (non-Javadoc)
	 * @see decorator.beverage.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
