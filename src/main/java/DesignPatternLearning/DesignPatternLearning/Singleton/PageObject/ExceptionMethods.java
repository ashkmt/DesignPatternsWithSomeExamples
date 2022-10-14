package DesignPatternLearning.DesignPatternLearning.Singleton.PageObject;

public class ExceptionMethods {

	private Page page;
	public ExceptionMethods(Page page) {
		this.page = page;
	}
	
	public void element_not_found() {

		page.setMessage("Element not found");
	}
}
