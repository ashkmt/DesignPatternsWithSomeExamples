package DesignPatternLearning.DesignPatternLearning.Solid.PageObject;
/**
 * The class is extended by other page classes, but there is 
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage implements Page{

	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofMillis(10000));
	}
	
	public WebDriverWait getPageWait() {
		return wait;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	}
