package strategy_pattern;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFlyBehaviour() {
		flyBehaviour.fly();
	}
	
	public void performQuackBehaviour() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
