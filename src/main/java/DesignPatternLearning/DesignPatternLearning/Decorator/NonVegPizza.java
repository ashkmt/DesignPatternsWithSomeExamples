package DesignPatternLearning.DesignPatternLearning.Decorator;

public class NonVegPizza extends Pizza{

	public NonVegPizza() {
		description = "NonVegPizza";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 150;
	}

}
