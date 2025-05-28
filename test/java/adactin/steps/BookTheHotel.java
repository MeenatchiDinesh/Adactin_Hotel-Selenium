package adactin.steps;

import java.io.IOException;

import adactin.pages.BookHotel;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookTheHotel extends AdactinUtility{
	
	BookHotel bookHotel = new BookHotel();
	
	@Given("enter the name and address")
	public void enter_the_name_and_address() throws IOException, InterruptedException {		
		System.out.println(pagetext(bookHotel.getPageTitle()));
		enterText(bookHotel.getFirstName(), getValueFor("first_name"));		
		enterText(bookHotel.getLastName(), getValueFor("last_name"));		
		enterText(bookHotel.getBillingAddress(), getValueFor("billing_address"));				
	}
	
	@Then("fill the card details")
	public void fill_the_card_details() throws IOException {
     	enterText(bookHotel.getCardNumber(), getValueFor("card_number"));		
		selectFromDropDown(bookHotel.getCardType(), getValueFor("card_type"));		
		selectFromDropDown(bookHotel.getExpiryMonth(), getValueFor("expiry_month"));		
		selectFromDropDown(bookHotel.getExpiryYear(), getValueFor("expiry_year"));		
		enterText(bookHotel.getCcvNumber(), getValueFor("ccv_number"));
	}
	
	@Then("book the hotel")
	public void book_the_hotel() throws InterruptedException {
		clickButton(bookHotel.getBookNow());
		Thread.sleep(8000);
	}



}
