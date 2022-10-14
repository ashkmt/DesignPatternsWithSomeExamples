package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

public class CloudEnvFactory extends AbsEnvFactory{

	/**
	 * Factory class returning instances of Cloud environment, note that this subclass is 
	 * taking care of instantiation of 'MobileAppOnCloud' class as per GOF.
	 */
	
	@Override
	public MobileAppEnv createEnvironment() {
		// TODO Auto-generated method stub
		
		return new MobileAppOnCloud();
	}

}
