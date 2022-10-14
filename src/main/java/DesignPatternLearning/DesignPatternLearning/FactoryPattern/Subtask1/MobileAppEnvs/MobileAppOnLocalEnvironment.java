package DesignPatternLearning.DesignPatternLearning.FactoryPattern.Subtask1.MobileAppEnvs;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;

public class MobileAppOnLocalEnvironment extends MobileAppEnv{

	AppiumDriver driver;
	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		driver = new AppiumDriver(dc);
	}

	@Override
	public void launch() {
		driver.get("");
		// TODO Auto-generated method stub
		System.out.println("launched on my Google Pixcel");
	}

	
}
