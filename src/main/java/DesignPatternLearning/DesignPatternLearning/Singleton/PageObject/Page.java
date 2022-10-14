package DesignPatternLearning.DesignPatternLearning.Singleton.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Page {
	public WebDriverWait getPageWait();
	public WebDriver getDriver();
	public String getMessage();
	public void setMessage(String message);
}
