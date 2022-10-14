package DesignPatternLearning.DesignPatternLearning.Decorator;
/**
 * 
 * @author ashish
 *Problem Statement:
 *	I am building an for my pizza restaurant (interface)
	The application can have different types like veg options and non-veg options.
	The user can select many toppings choices based on the pizza type selected like cheese, jalapeno etc.
	Using the decorator pattern Decorator class that will use pizza interface to use which type of pizza 
	types the user wants along with the choice of toppings.
	
	Solution: A Pizza abstract class is extended by Veg/NonVeg Pizza and same class is extended by another
	abstract class PizzaToppings which is extended and implimented by CheeseToppings/JalapenoToppings.
	The CheeseToppings/JalapenoToppings class mantains a refrence to Pizza instance which helps to
	enhance the functionality of Pizza class(Decorate).
 */
public class MainClass {

	public static void main(String args[]) {
		
		Pizza vegPizza = new VegPizza();
		vegPizza = new CheeseToppings(vegPizza);
		vegPizza = new CheeseToppings(vegPizza);
		vegPizza = new JalapenoTopping(vegPizza);
		System.out.println(vegPizza.getDescription() + " " + vegPizza.getCost());
	}
	
}
