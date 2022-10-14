package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * 
 * @author Ashish_Kumawat
 *	This will help to achieve polymorphism in Env Capabilities factory classes.
 */

public abstract class AbsEnvCapabilities {

	public abstract DesiredCapabilities getCapabilities();
}
