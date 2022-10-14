package DesignPatternLearning.DesignPatternLearning.Singleton.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHelperClass {

	private Page page;
	private ExceptionMethods exceptionMethods;
	
	Logger logger = Logger.getInstance();
	public PageHelperClass(Page page) {
		this.page = page;
		exceptionMethods = new ExceptionMethods(page);
	}
	
	public WebElement get_element(By locator, WebDriver driver) throws Exception {
		
		if (driver==null) {
			return page.getDriver().findElement(locator);
		}
		else
			return driver.findElement(locator);
	}
	
	public By get_locator_by(String locator, String type) {
		try {
		if(type == "id") {
			return By.id(locator);
		}
		else if(type == "name") {
			return By.name(locator);
		}
		else {
			logger.log("Not a valid locator type:"+type);
			throw new Exception("Invalid locator type"+type);
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
