package luma.us.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.BasePage;

public class PurchaseProductElementsPage  extends BasePage{
	
	//How to initialize pagefactory concet
	
	public PurchaseProductElementsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement verifyLoginlanding_page;

	public WebElement getverifyLoginlanding_page() {
		return verifyLoginlanding_page;
	}
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement selectjacketfromMenModule;

	public WebElement getClickOnSignButton() {
		return selectjacketfromMenModule;
	}
	public void getLogin() {
		
		
	}

}
