package DesignPatternLearning.DesignPatternLearning.Singleton.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ActionOnPage {

	private Page page;
	private WebDriverWait wait;
	private Logger logger = Logger.getInstance();
	public ActionOnPage(Page page) {
		this.page = page;
		wait = page.getPageWait();
	}
	
	public Page input_text(By Bylocator, String text) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(Bylocator)).sendKeys(text);
		logger.log("Input text "+text+" to field "+Bylocator.toString());
		return page;
	}
	
	public String get_text(By Bylocator) {
		// TODO Auto-generated method stub
		logger.log("Retrieved text from "+Bylocator.toString());
		return wait.until(ExpectedConditions.elementToBeClickable(Bylocator)).getText();
	}

	public Page clear_value(By Bylocator) {
		// TODO Auto-generated method stub
		logger.log("Cleared field "+Bylocator.toString());
		wait.until(ExpectedConditions.elementToBeClickable(Bylocator)).clear();
		return page;
	}
}
