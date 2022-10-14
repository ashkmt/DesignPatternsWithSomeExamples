package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

import org.openqa.selenium.remote.DesiredCapabilities;

import DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities.LocalEnvCapabilitiesFactory;
import DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities.SimulatoryEnvCapabilitiesFactory;
import io.appium.java_client.AppiumDriver;

public class MobileAppOnSimulator extends MobileAppEnv{

	AppiumDriver driver;
	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		SimulatoryEnvCapabilitiesFactory simulatorEnvFactory = new SimulatoryEnvCapabilitiesFactory();
		DesiredCapabilities dc = simulatorEnvFactory.getEnvironmentCapabilities().getCapabilities();
		driver = new AppiumDriver(dc);
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("Launched on Mobile Simulator");
	}

}
