package org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends BaseClass{
	@FindBy(id="email_create")
	private WebElement email;
	@FindBy(id="email")
	private WebElement emailenter;
	@FindBy(id="passwd")
	private WebElement password1;
	public WebElement getEmailenter() {
		return emailenter;
	}
	public WebElement getPassword1() {
		return password1;
	}
	public WebElement getSignin1() {
		return signin1;
	}
	@FindBy(name="SubmitLogin")
	private WebElement signin1;

	@FindBy(id="SubmitCreate")
	private WebElement createanacc;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCreateanacc() {
		return createanacc;
	}
	public SignIn() {
		
		PageFactory.initElements(driver,this);
	}
}
