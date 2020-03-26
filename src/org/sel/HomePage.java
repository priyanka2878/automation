package org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	@FindBy(xpath="//img[@alt=\"My Store\"]")
	private WebElement login;
	@FindBy(xpath="//strong[text()=\\\"0123-456-789\\\"]")
	private WebElement mobno;
	@FindBy(xpath="//a[text()=\"Contact us\"]")
	private WebElement contact;
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signin;
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	private WebElement search;
	@FindBy(xpath="//a[text()=\"Women\"]")
	private WebElement women;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirts;
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement sign;
	@FindBy(xpath="//h1[text()='Authentication']")
	private WebElement auth;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getMobno() {
		return mobno;
	}
	public WebElement getContact() {
		return contact;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getTshirts() {
		return tshirts;
	}
	public WebElement getSign() {
		return sign;
	}
	public WebElement getAuth() {
		return auth;
	}
	public HomePage() {
		PageFactory.initElements(driver, this);
	}		
}
