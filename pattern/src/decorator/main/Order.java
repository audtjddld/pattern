/**
 * 
 */
package decorator.main;

import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.condiment.Mocha;
import decorator.size.Size;

/**
 * @author 정명성
 * create date : 2016. 1. 13.
 * decorator.main.Order.java
 */
public class Order {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		
		espresso = new Mocha(espresso, Size.grande.toString());
		System.out.println(espresso.getDescription() + " $ " + espresso.cost());
		
		Beverage espresso2 = new Espresso();
		espresso2 = new Mocha(espresso2, Size.tall.toString());
		System.out.println(espresso2.getDescription() + " $ " + espresso2.cost());
		
		Beverage espresso3 = new Espresso();
		espresso3 = new Mocha(espresso3, Size.venti.toString());
		System.out.println(espresso3.getDescription() + " $ " + espresso3.cost());

		Beverage espresso4 = new Espresso();
		espresso4 = new Mocha(espresso4, Size.nomal.toString());
		System.out.println(espresso4.getDescription() + " $ " + espresso4.cost());
		
	}
}
