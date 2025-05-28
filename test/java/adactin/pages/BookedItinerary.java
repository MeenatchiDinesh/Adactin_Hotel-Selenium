package adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utility.AdactinUtility;

public class BookedItinerary extends AdactinUtility{


	public BookedItinerary() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="cancelall")
	private WebElement cancelButton;
	
	@FindBy(xpath="//label[@id='search_result_error']")
	private WebElement searchResult;
	
	public WebElement getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(WebElement searchResult) {
		this.searchResult = searchResult;
	}

	@FindBy(id="my_itinerary")
	private WebElement myItinery;
	
	@FindBy(xpath="(//input[@name='ids[]'])")
	private WebElement orderIdCheckBox;
	
	
	@FindBy(xpath="//input[@id='order_id_text']")
	private WebElement searchTextBox;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}

	public WebElement getMyItinery() {
		return myItinery;
	}

	public void setMyItinery(WebElement myItinery) {
		this.myItinery = myItinery;
	}

	public WebElement getOrderIdCheckBox() {
		return orderIdCheckBox;
	}

	public void setOrderIdCheckBox(WebElement orderIdCheckBox) {
		this.orderIdCheckBox = orderIdCheckBox;
	}

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public void setSearchTextBox(WebElement searchTextBox) {
		this.searchTextBox = searchTextBox;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public void setGoButton(WebElement goButton) {
		this.goButton = goButton;
	}

	@FindBy(xpath="//input[@value='Go']")
	private WebElement goButton;
	
	
	
}
