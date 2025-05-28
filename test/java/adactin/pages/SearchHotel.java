package adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utility.AdactinUtility;

public class SearchHotel extends AdactinUtility{

	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement pageTitle;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	private WebElement selectLocation;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	private WebElement selectHotel;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement selectRoom;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	private WebElement selectNumberOfRooms;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	private WebElement selectNumberOfAdults;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getSelectNumberOfRooms() {
		return selectNumberOfRooms;
	}

	public WebElement getSelectNumberOfAdults() {
		return selectNumberOfAdults;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
}
