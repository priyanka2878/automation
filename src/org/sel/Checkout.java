package org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends BaseClass {
	@FindBy(xpath="//a[@title=\"Proceed to checkout\"] ")
	private WebElement proceedToCheckout;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed2;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed3;
	@FindBy(id="cgv")
	private WebElement condition;
	public WebElement getCondition() {
		return condition;
	}
	@FindBy(xpath="(//span[contains(text(),'Proceed ')])[2]")
	private WebElement proceed4;
	@FindBy(xpath="//a[@title=\"Pay by bank wire\"]")
	private WebElement paybybank;
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	private WebElement confirmorder;
	public WebElement getConfirmorder() {
		return confirmorder;
	}
	@FindBy(xpath="//a[@title=\"Log me out\"]")
	private WebElement signout;
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getPaybybank() {
		return paybybank;
	}
	public WebElement getProceed4() {
		return proceed4;
	}
	public WebElement getProceed3() {
		return proceed3;
	}
	public WebElement getProceed2() {
		return proceed2;
	}
	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	public Checkout() {
		PageFactory.initElements(driver, this);
		
	}

}

