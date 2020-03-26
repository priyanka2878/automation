package org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAcc extends BaseClass{
	@FindBy(xpath="//h1[text()='My account']")
	private WebElement myAcc;
	@FindBy(xpath="//span[contains(text(),'history ')]")
	private WebElement orderHistory;
	@FindBy(xpath="//span[contains(text(),'wishlists')]")
	private WebElement wishList;
	@FindBy(xpath="(//a[@title=\"Dresses\"])[2]")
	private WebElement dresses;
	@FindBy(xpath="(//a[@title=\"Evening Dresses\"])[2]")
	private WebElement evngDrss;
	@FindBy(name="search_query")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement submitClick;
	@FindBy(xpath="//img[@alt=\"Printed Summer Dress\"]")
	private WebElement dressScroll;
	public WebElement getDressScroll() {
		return dressScroll;
	}
	public WebElement getSubmitClick() {
		return submitClick;
	}
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//img[@alt=\"Printed Dress\"]")
	private WebElement quickbox;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart1;
	public WebElement getAddtocart1() {
		return addtocart1;
	}
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickView;
	@FindBy(xpath="//i[@class=\"icon-plus\"]")
	private WebElement quantity;
	@FindBy(name="group_1")
	private WebElement size;
	@FindBy(name="Pink")
	private WebElement colour;
	@FindBy(name="Submit")
	private WebElement addToCart;
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private WebElement addToCart5;
	public WebElement getAddToCart5() {
		return addToCart5;
	}
	public WebElement getMyAcc() {
		return myAcc;
	}
	public WebElement getOrderHistory() {
		return orderHistory;
	}
	public WebElement getWishList() {
		return wishList;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getEvngDrss() {
		return evngDrss;
	}
	public WebElement getQuickbox() {
		return quickbox;
	}
	public WebElement getQuickView() {
		return quickView;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	public MyAcc() {
		PageFactory.initElements(driver, this);
	}		
}
