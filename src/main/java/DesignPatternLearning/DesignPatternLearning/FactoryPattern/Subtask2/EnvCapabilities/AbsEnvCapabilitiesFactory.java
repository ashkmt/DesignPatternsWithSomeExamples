package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * @author Ashish_Kumawat
 *	Abstract factory class for environment capabilities, this will be extended by factory subclasses to
 *	give required environments desired capabilities.
 */

public abstract class AbsEnvCapabilitiesFactory {

	
	public abstract AbsEnvCapabilities getEnvironmentCapabilities();
}
