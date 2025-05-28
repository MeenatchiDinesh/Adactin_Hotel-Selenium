package adactin.steps;

import java.io.IOException;

import org.junit.Assert;

import adactin.pages.BookingConfirmation;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfirmBookingInfomation extends AdactinUtility{

	BookingConfirmation bookingConfirmation = new BookingConfirmation();
 
	public static String orderNo;
	
	@When("validate that booking details matches the given details")
	public void validate_that_booking_details_matches_the_given_details() throws IOException, InterruptedException {
		System.out.println(pagetext(bookingConfirmation.getPageTitle()));
		Thread.sleep(3000);
	    Assert.assertEquals(getValueFor("hotel"), bookingConfirmation.getHotelName().getDomAttribute("value"));
	    Assert.assertEquals(getValueFor("location"),bookingConfirmation.getLocation().getDomAttribute("value"));
	    //Assert.assertEquals(getValueFor("roomType"), bookingConfirmation.getRoomType().getDomAttribute("value"));
	    Assert.assertTrue((bookingConfirmation.getAdults().getDomAttribute("value").contains(getValueFor("number_of_adults"))) );
	    Assert.assertTrue((bookingConfirmation.getNumberOfRooms().getDomAttribute("value")).contains(getValueFor("number_of_rooms")) );
	    Assert.assertEquals(getValueFor("first_name"), bookingConfirmation.getFirstName().getDomAttribute("value"));
	    Assert.assertEquals(getValueFor("address"), bookingConfirmation.getAddress().getDomAttribute("value"));
		
	}
	
	@Then("get the order number")
	public void get_the_order_number() {
		orderNo = bookingConfirmation.getOrderNo().getDomAttribute("value");
		System.out.println("Order No :"+orderNo);
	}

}
