package decorator.condiment;

import decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  beverage.getDescription() + ", 휘핑크림";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .5 + beverage.cost();
	}

}
