package adactin.steps;

import java.io.IOException;

import org.junit.Assert;

import adactin.pages.BookingConfirmation;
import adactin.pages.Login;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LogOut extends AdactinUtility {

	BookingConfirmation bookingConfirmation = new BookingConfirmation();
    Login login = new Login();
	@Then("click on Logout button")
	public void click_on_logout_button() throws InterruptedException {
		clickButton(bookingConfirmation.getLogoutButton());
		Thread.sleep(2000);
		
	}

	@And("validate login link is displayed")
	public void validate_login_link_is_displayed() throws IOException, InterruptedException {
		Assert.assertTrue(bookingConfirmation.getLoginLink().isDisplayed());
		clickButton(bookingConfirmation.getLoginLink());
		Thread.sleep(2000);
		Assert.assertTrue(login.getLoginButton().isDisplayed());
		
	}
}
