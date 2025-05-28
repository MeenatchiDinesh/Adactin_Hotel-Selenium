package adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utility.AdactinUtility;

public class Login extends AdactinUtility{

	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement title;
	
	public WebElement getTitle() {
		return title;
	}

	
	@FindBy(id="username")
	private WebElement userNameTextBox;
	
	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}
	
	
	@FindBy(id="login")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
}
