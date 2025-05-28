package adactin.steps;

import java.io.IOException;

import org.junit.Assert;

import adactin.pages.BookedItinerary;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CancelOrder extends AdactinUtility{

	BookedItinerary bookingItinerary = new BookedItinerary();
    
	@Given("search for the booked order")
	public void search_for_the_booked_order() throws InterruptedException {
		bookingItinerary = new BookedItinerary();
		clickButton(bookingItinerary.getMyItinery());
		Thread.sleep(3000);
	}
		
	
	@Then("select the order and cancel it")
	public void select_the_order_and_cancel_it() throws InterruptedException {
		enterText(bookingItinerary.getSearchTextBox(),ConfirmBookingInfomation.orderNo);
		clickButton(bookingItinerary.getGoButton());
		clickButton(bookingItinerary.getOrderIdCheckBox());
		clickButton(bookingItinerary.getCancelButton());
		Thread.sleep(2000);
		HandleAlertMessage("ok");
		Thread.sleep(2000);
	}
	
	@Then("search for the cancelled order and do the validation")
	public void search_for_the_cancelled_order_and_do_the_validation() throws InterruptedException, IOException {
		enterText(bookingItinerary.getSearchTextBox(),ConfirmBookingInfomation.orderNo);
		clickButton(bookingItinerary.getGoButton());
	    Assert.assertTrue(bookingItinerary.getSearchResult().getText().contains("0 result(s) found"));
	}
	
}
