package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

public class LocalEnvFactory extends AbsEnvFactory {
	/**
	 * Factory class returning instances of Local environment, note that this subclass is 
	 * taking care of instantiation of 'MobileAppOnLocalEnvironment' class as per GOF.
	 */
	@Override
	public MobileAppEnv createEnvironment() {
		// TODO Auto-generated method stub
		return new MobileAppOnLocalEnvironment();
	}
}