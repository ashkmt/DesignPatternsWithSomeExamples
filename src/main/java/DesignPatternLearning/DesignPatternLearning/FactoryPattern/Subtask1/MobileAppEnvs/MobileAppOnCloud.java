package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask1.MobileAppEnvs;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class MobileAppOnCloud extends MobileAppEnv{

	AppiumDriver driver;
	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		driver = new AppiumDriver(dc);
		
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		driver.get("");
		System.out.println("Launched on Azure environment");
	}

}
