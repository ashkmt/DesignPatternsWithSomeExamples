package DesignPatternLearning.DesignPatternLearning.Solid.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ActionOnPage {

	private Page page;
	private WebDriverWait wait;
	public ActionOnPage(Page page) {
		this.page = page;
		wait = page.getPageWait();
	}
	
	public Page input_text(By Bylocator, String text) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(Bylocator)).sendKeys(text);
		return page;
	}
	
	public String get_text(By Bylocator) {
		// TODO Auto-generated method stub
		
		return wait.until(ExpectedConditions.elementToBeClickable(Bylocator)).getText();
	}

	public Page clear_value(By Bylocator) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(Bylocator)).clear();
		return page;
	}
}
