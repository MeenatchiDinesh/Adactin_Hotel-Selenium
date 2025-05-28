package adactin.steps;

import java.io.IOException;

import adactin.pages.Login;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginToAdactin extends AdactinUtility {

	
	
	@Given("launch the url")
	public void launch_the_url() throws IOException {

		driver.get(getValueFor("url"));
		driver.manage().window().maximize();
	}

	@Then("login using the credentials in property file")
	public void login_using_the_credentials_in_property_file() throws IOException, InterruptedException {

		Login login = new Login();
		System.out.println(pagetext(login.getTitle()));
		enterText(login.getUserNameTextBox(), getValueFor("username"));
		enterText(login.getPasswordTextBox(), getValueFor("password"));
		clickButton(login.getLoginButton());
		Thread.sleep(3000);

	}

}
