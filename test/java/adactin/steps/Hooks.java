package adactin.steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import adactin.utility.AdactinUtility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends AdactinUtility{

	@Before("@login")
	public void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeStep
	public void takeScreenShotBeforeEachMethod() throws IOException {
		takeScreenShot();
	}
	
	@AfterStep
	public void takeScreenShotAfterEachMethod() throws IOException {
		takeScreenShot();
	}
	
	@After("@logout")
	public void quitDriver() {
		
		driver.quit();
	}
}
