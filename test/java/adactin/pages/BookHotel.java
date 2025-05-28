package adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utility.AdactinUtility;

public class BookHotel extends AdactinUtility {

	public BookHotel() {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="(//td[@class='login_title'])[2]")
	private WebElement pageTitle;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;

	@FindBy(name="address")
	private WebElement billingAddress;
	
	@FindBy(name="cc_num")
	private WebElement cardNumber;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
		
}
