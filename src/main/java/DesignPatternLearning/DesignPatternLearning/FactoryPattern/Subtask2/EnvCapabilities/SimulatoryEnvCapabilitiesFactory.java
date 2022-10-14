package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities;

public class SimulatoryEnvCapabilitiesFactory extends AbsEnvCapabilitiesFactory{

	/**
	 * Factory class returning instances of Simulator environment capabilities, note that this subclass is 
	 * taking care of instantiation of 'SimulatorEnvCapabilities' class as per GOF.
	 */
	@Override
	public AbsEnvCapabilities getEnvironmentCapabilities() {
		// TODO Auto-generated method stub
		return new SimulatorEnvCapabilities();
	}

}
