package adactin.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinUtility {
	
	
	public static WebDriver driver;
	
//utility functions
	
	public static void takeScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("/Users/Meenatchi/eclipse-workspace/AcadtinHotelUsingCucumber/ErrorImage" + System.currentTimeMillis() + ".png"));
	}

	public static String pagetext(WebElement element) {
		return element.getText();
	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void selectFromDropDown(WebElement element, String text) {

		Select select = new Select(element);
		element.click();
		select.selectByValue(text);
	}
	
	public static void HandleAlertMessage(String response) {
		if(response.equalsIgnoreCase("ok"))
		driver.switchTo().alert().accept();
		else if(response.equalsIgnoreCase("cancel"))
			driver.switchTo().alert().dismiss();
	}

	
	
	public static String getValueFor(String key) throws IOException {
		File file = new File("/Users/Meenatchi/eclipse-workspace/AcadtinHotelUsingCucumber/src/test/resources/Data.properties");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		return properties.getProperty(key);
	}
	
	public static void quitdriver(){
		driver.quit();
	}
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	