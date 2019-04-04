/**
 * 
 */
package decorator.main;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;
import decorator.size.Size;

/**
 * @author 정명성 create date : 2016. 1. 13. decorator.main.Order.java
 */
public class Order {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " [" + beverage.getSize() + "] $ " + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);

		System.out.println(beverage2.getDescription() + " [" + beverage2.getSize() + "] $ " + beverage2.cost());

		/**
		 * 주문 순서 -> 음료 -> 사이즈 -> 추가
		 */
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.tall.toString());
		beverage3 = new Soy(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " [" + beverage3.getSize() + "] $ " + beverage3.cost());

	}
}
