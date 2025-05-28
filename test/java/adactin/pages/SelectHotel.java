package adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utility.AdactinUtility;

public class SelectHotel extends AdactinUtility {

	public SelectHotel() {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement pageTitle;
	
	@FindBy(id="radiobutton_0")
	private WebElement selectHotelRadioButton;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getSelectHotelRadioButton() {
		return selectHotelRadioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
}
