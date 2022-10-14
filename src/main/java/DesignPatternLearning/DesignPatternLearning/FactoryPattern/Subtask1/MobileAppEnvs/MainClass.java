package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask1.MobileAppEnvs;
/**
 * 
 * @author ashish
 * Problem Statement:
 * My mobile application can be executed on the following environments local device, simulator/emulator and cloud.
 *	Using factory pattern, write code to initialise it to for your customised enviornments i.e. local, simulator/emulator or cloud implementations.
 *	e.g. my_local_enviornment, my_simulator_enviornment etc.
 *
 *	Solution: EnvFactory implements AbsEnvFactory which will return the environment based on the string input.
 */

public class MainClass {
	
	public static void main(String args[]) {
	AbsEnvFactory envs = new EnvFactory();
	// we are not instantiating the environment class directly but using factory
	// to get an instance of environment.
	MobileAppEnv envOnCloud = envs.createEnvironment("Cloud");
	envOnCloud.setUp();
	envOnCloud.launch();
	}
}
