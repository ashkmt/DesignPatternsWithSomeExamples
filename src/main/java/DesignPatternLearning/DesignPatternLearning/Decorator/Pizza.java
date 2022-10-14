package DesignPatternLearning.DesignPatternLearning.Decorator;

/**
 * 
 * @author Ashish_Kumawat
 *	Abstract class for pizza classes, subclasses has
 *	to implement getCost() method.
 */
public abstract class Pizza {
	protected String description;
	public abstract int getCost();
	public String getDescription() {
		return description;
	}

}
