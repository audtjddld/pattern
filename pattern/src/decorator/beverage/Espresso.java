/**
 * 
 */
package decorator.beverage;

import decorator.size.Size;

/**
 * @author 정명성
 * create date : 2016. 1. 13.
 * decorator.Espresso.java
 */
public class Espresso extends Beverage {

	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "에스프레소";
	}
	/* (non-Javadoc)
	 * @see decorator.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2;
	}


}
