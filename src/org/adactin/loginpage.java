package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class loginpage extends BaseClass {
@FindBy(id="username")
private WebElement username;
@FindBy(id="password")
private WebElement passwrd;
@FindBy(id="login")
private WebElement loginbutton;
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;

public WebElement getLogout() {
	return logout;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPasswrd() {
	return passwrd;
}
public WebElement getLoginbutton() {
	return loginbutton;
}
public loginpage() {
	PageFactory.initElements(driver, this);
}
}
