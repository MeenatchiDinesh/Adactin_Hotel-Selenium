package adactin.steps;

import java.io.IOException;

import adactin.pages.SearchHotel;
import adactin.utility.AdactinUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchForHotel extends AdactinUtility {
	
	SearchHotel searchHotel = new SearchHotel();

		
		@Given("fill all the mandatory fields")
		public void fill_all_the_mandatory_fields() throws IOException {
			
			System.out.println(pagetext(searchHotel.getPageTitle()).substring(0, 12));
			selectFromDropDown(searchHotel.getSelectLocation(), getValueFor("location"));
			selectFromDropDown(searchHotel.getSelectHotel(),getValueFor("hotel"));
			selectFromDropDown(searchHotel.getSelectRoom(), getValueFor("room"));
			selectFromDropDown(searchHotel.getSelectNumberOfRooms(), getValueFor("number_of_rooms"));
			selectFromDropDown(searchHotel.getSelectNumberOfAdults(), getValueFor("number_of_adults"));			
		}
		
		@Then("click Search")
		public void click_search() throws InterruptedException {
			
			clickButton(searchHotel.getSearchButton());
			Thread.sleep(2000);
		}
		
		

}
