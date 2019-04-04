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
	
	// 설명
	protected String description;
	// 음료 사이즈
	protected String size = "nomal";
	
	public String getDescription() {
		return description;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public abstract double cost();
	
	@Override
	public String toString() {
		return "Beverage [description=" + description + ", size=" + size + "]";
	} 
	
	
}
