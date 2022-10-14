package DesignPatternLearning.DesignPatternLearning.Decorator;

public class JalapenoTopping extends PizzaToppings{

	private Pizza pizza;
	public JalapenoTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + "Jalapeno";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 20;
	}

}


