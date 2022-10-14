package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities;

public class CloudEnvCapabilitiesFactory extends AbsEnvCapabilitiesFactory{

	/**
	 * Factory class returning instances of Cloud environment capabilities, note that this subclass is 
	 * taking care of instantiation of 'CloudEnvCapabilities' class as per GOF.
	 */
	@Override
	public AbsEnvCapabilities getEnvironmentCapabilities() {
		// TODO Auto-generated method stub
		return new CloudEnvCapabilities();
	}

}
