package adactin.steps;

import java.io.IOException;

import adactin.pages.SelectHotel;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.Then;

public class SelectAHotel extends AdactinUtility{

	
	@Then("select a hotel from the list displayed")
	public void select_a_hotel_from_the_list_displayed() throws IOException, InterruptedException {
	    
		SelectHotel selectHotel = new SelectHotel();
		System.out.println(pagetext(selectHotel.getPageTitle()));
		clickButton(selectHotel.getSelectHotelRadioButton());
		clickButton(selectHotel.getContinueButton());
		Thread.sleep(2000);
	
	}
}
