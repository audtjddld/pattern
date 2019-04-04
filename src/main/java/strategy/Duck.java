package strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	
	public abstract void display();

	/**
	 * 나는 행동
	 * @Author  : 정명성
	 * @Date    : 2016. 1. 16.
	 * @Path    : strategy.Duck.java
	 */
	public void performFly() {
		flyBehavior.fly();
	}

	/**
	 * 꽥~
	 * @Author  : 정명성
	 * @Date    : 2016. 1. 16.
	 * @Path    : strategy.Duck.java
	 */
	public void performQuack() {
		quackBehavior.quiack();
	}

	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜹니다.");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
