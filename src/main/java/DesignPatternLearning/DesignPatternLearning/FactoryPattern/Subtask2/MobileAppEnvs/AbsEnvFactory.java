package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

/**
 * 
 * @author Ashish_Kumawat
 *	Abstract Environemnt factory class, this will be extended by factory subclasses to give
 *	required environment.
 */
public abstract class AbsEnvFactory {
	
	
	public abstract MobileAppEnv createEnvironment();

}
