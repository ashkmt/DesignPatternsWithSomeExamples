package DesignPatternLearning.DesignPatternLearning.Solid.PageObject;
/**
 * With the Page interface we can avoid type dependency on concrete class.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Page {
	public WebDriverWait getPageWait();
	public WebDriver getDriver();
}
