package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;
/**
 * Problem Statement:
 * My mobile application can be executed on the following environments local device, simulator/emulator and cloud.
 *	Using factory pattern, write code to initialise it to for your customised enviornments i.e. local, simulator/emulator or cloud implementations.
 *	e.g. my_local_enviornment, my_simulator_enviornment etc.
 *	
 *	Solution: All environment classes implements the AbsEnvFactory and is resposible to provide environment of
 *	corresponding type(for ex: CloudEnvFactory provide MobileAppOnCloud) incorporating the cpabilities which also has
 *	the factory implementation.
 */
import DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask1.MobileAppEnvs.MobileAppEnv;

public class MainClass {

	
	public static void main(String args[]) {
		
		// we are not instantiating the environment class directly but using factory
		// to get an instance of environment.
		AbsEnvFactory envfactory = new CloudEnvFactory();
		MobileAppOnCloud appOnCloud = (MobileAppOnCloud) envfactory.createEnvironment();
		appOnCloud.setUp();
		appOnCloud.launch();
	}
}
