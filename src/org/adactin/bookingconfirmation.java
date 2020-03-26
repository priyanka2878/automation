package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class bookingconfirmation extends BaseClass{
@FindBy(id="order_no")
private WebElement orderno;


public WebElement getOrderno() {
	return orderno;
}


public bookingconfirmation() {
	PageFactory.initElements(driver, this);
}
}
