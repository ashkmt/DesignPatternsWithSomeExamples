package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask1.MobileAppEnvs;
/**
 * 
 * @author Ashish_Kumawat
 *Abstract class for Environment Factory.
 */
public abstract class AbsEnvFactory {
	
	
	public abstract MobileAppEnv createEnvironment(String env);

}
