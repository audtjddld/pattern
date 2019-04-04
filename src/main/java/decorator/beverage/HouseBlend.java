package decorator.beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "하우스블렌드";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}

}
