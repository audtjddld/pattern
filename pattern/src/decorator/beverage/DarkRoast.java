package decorator.beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description = "다크로스트";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.8;
	}

	@Override
	public void setSize(String size) {
		description += "[ " + size + " ]";
	}

}
