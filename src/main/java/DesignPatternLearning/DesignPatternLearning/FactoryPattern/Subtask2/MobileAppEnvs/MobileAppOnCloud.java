package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities.CloudEnvCapabilitiesFactory;
import DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities.LocalEnvCapabilitiesFactory;
import io.appium.java_client.AppiumDriver;

public class MobileAppOnCloud extends MobileAppEnv{

	AppiumDriver driver;
	@Override
	public void setUp() {
		CloudEnvCapabilitiesFactory cloudEnvFactory = new CloudEnvCapabilitiesFactory();
		
		DesiredCapabilities dc = cloudEnvFactory.getEnvironmentCapabilities().getCapabilities();
		driver = new AppiumDriver(dc);
		
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		driver.get("");
		System.out.println("Launched on Azure environment");
	}

}
