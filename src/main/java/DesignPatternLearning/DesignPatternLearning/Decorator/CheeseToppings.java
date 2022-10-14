package DesignPatternLearning.DesignPatternLearning.Decorator;

/**
 * 
 * @author ashish
 * Class extending CheeseToppings has to implement
 * both getDescription and getCost methods.
 *
 */

public class CheeseToppings extends PizzaToppings{

	private Pizza pizza;
	public CheeseToppings(Pizza pizza) {
		
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + "cheese";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost()+50;
	}

}
