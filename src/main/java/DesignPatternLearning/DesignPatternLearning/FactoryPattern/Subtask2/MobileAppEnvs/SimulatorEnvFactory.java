package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

public class SimulatorEnvFactory extends AbsEnvFactory{

	/**
	 * Factory class returning instances of Simulator environment, note that this subclass is 
	 * taking care of instantiation of 'MobileAppOnSimulator' class as per GOF.
	 */
	@Override
	public MobileAppEnv createEnvironment() {
		// TODO Auto-generated method stub
		return new MobileAppOnSimulator();
	}

}
