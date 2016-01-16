package decorator.condiment;

import decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.2 * + this.beverage.cost();
	}
}
