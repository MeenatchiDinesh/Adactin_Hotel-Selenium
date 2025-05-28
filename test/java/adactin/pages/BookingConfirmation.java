package adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utility.AdactinUtility;

public class BookingConfirmation extends AdactinUtility{

	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='hotel_name']")
	private WebElement hotelName;
	
	@FindBy(xpath="//input[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//input[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//input[@name='adults_room']") 
	private WebElement adults;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='total_rooms']")
	private WebElement numberOfRooms;
	
	public void setNumberOfRooms(WebElement numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}


	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderNo;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement pageTitle;
	
	@FindBy(id="my_itinerary")
	private WebElement myItinery;
	
	@FindBy(xpath="(//input[@name='ids[]'])[1]")
	private WebElement orderIdCheckBox;
	
	@FindBy(name="cancelall")
	private WebElement cancelButton;
	
	@FindBy(id="logout")
	private WebElement logoutButton;
	
	@FindBy(linkText="Click here to login again")
	private WebElement loginLink;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;

	public WebElement getHotelName() {
		return hotelName;
	}

	public void setHotelName(WebElement hotelName) {
		this.hotelName = hotelName;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getAdults() {
		return adults;
	}

	public void setAdults(WebElement adults) {
		this.adults = adults;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}

	public void setPageTitle(WebElement pageTitle) {
		this.pageTitle = pageTitle;
	}

	public void setMyItinery(WebElement myItinery) {
		this.myItinery = myItinery;
	}

	public void setOrderIdCheckBox(WebElement orderIdCheckBox) {
		this.orderIdCheckBox = orderIdCheckBox;
	}

	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}

	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getMyItinery() {
		return myItinery;
	}

	public WebElement getOrderIdCheckBox() {
		return orderIdCheckBox;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
		
	}
	
}
