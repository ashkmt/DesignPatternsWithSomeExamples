package DesignPatternLearning.DesignPatternLearning.Decorator;
/**
 * 
 * @author Ashish_Kumawat
 *	This is abstract class for pizza decorator classes.
 *	The concrete class has to implement both getCost(),
 *	and getDescription() methods.
 */
public abstract class PizzaToppings extends Pizza{


	public abstract String getDescription();

}
