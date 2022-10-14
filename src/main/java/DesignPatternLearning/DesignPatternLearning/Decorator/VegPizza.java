package DesignPatternLearning.DesignPatternLearning.Decorator;

public class VegPizza extends Pizza{

	public VegPizza() {
		description = "VegPizza";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}
}
