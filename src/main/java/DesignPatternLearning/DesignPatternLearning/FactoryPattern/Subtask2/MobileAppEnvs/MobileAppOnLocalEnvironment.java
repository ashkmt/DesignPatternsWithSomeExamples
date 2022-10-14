package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.MobileAppEnvs;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask2.EnvCapabilities.LocalEnvCapabilitiesFactory;
import io.appium.java_client.AppiumDriver;

public class MobileAppOnLocalEnvironment extends MobileAppEnv{

	AppiumDriver driver;
	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		LocalEnvCapabilitiesFactory localEnvFactory = new LocalEnvCapabilitiesFactory();
		DesiredCapabilities dc = localEnvFactory.getEnvironmentCapabilities().getCapabilities();
		driver = new AppiumDriver(dc);
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("launched on my Google Pixcel");
	}

	
}
