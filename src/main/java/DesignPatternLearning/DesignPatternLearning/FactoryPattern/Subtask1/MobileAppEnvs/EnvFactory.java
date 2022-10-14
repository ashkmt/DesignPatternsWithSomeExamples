package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask1.MobileAppEnvs;
/**
 * 
 * @author Ashish_Kumawat
 *	This class extends AbsEnvFactory and implements the Factory method(CreateEnvironment),
 *	this will return the environment based on the input.
 *	This is the subclass responsible for creating instance as per Factory method principle.
 */
public class EnvFactory extends AbsEnvFactory {

	@Override
	public MobileAppEnv createEnvironment(String env) {
		// TODO Auto-generated method stub
		if (env == "Local") {
			return new MobileAppOnLocalEnvironment();
		} else if (env == "Simulator") {
			return new MobileAppOnSimulator();
		} else if (env == "Cloud") {
			return new MobileAppOnCloud();
		} else
			return null;
	}

}