package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalEnvCapabilitiesFactory extends AbsEnvCapabilitiesFactory{

	/**
	 * Factory class returning instances of Local environment capabilities, note that this subclass is 
	 * taking care of instantiation of 'LocalEnvCapabilities' class as per GOF.
	 */
	

	@Override
	public AbsEnvCapabilities getEnvironmentCapabilities() {
		// TODO Auto-generated method stub
		return new LocalEnvCapabilities();
	}

}
