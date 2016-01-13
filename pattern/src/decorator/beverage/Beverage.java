/**
 * 
 */
package decorator.beverage;

/**
 * @author 정명성
 * create date : 2016. 1. 13.
 * decorator.Beverage.java
 */
public abstract class Beverage {
	
	protected String description;

	public String getDescription() {
		return description;
	}
	
	public abstract double cost(); 
}
