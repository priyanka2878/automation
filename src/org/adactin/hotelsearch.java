package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class hotelsearch extends BaseClass{
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement roomnos;
@FindBy(id="datepick_in")
private WebElement indate;
@FindBy(id="checkin_span")
private WebElement errormessage;
@FindBy(id="datepick_out")
private WebElement outdate;
@FindBy(id="checkout_span")
private WebElement errormessage1;
public WebElement getErrormessage() {
	return errormessage;
}
public WebElement getErrormessage1() {
	return errormessage1;
}
@FindBy (id="adult_room")
private WebElement adultroom;
@FindBy(id="child_room")
private WebElement childroom;
@FindBy(id="Submit")
private WebElement submit;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomnos() {
	return roomnos;
}
public WebElement getIndate() {
	return indate;
}
public WebElement getOutdate() {
	return outdate;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildroom() {
	return childroom;
}
public WebElement getSubmit() {
	return submit;
}
public hotelsearch() {
	PageFactory.initElements(driver, this);
}
}
