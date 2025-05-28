

Feature: Adactin hotel appliaction process
 
  @login
  Scenario: Login to adactin
 
    Given launch the url 
    Then login using the credentials in property file
   
  Scenario: Search Hotel
     Given fill all the mandatory fields 
     Then click Search 
 
     
  Scenario: Select Hotel
     Then select a hotel from the list displayed
   
  Scenario: Book Hotel
     Given enter the name and address 
     Then fill the card details
     Then book the hotel
     
   Scenario: Confirm Booking Infomation
     When validate that booking details matches the given details
     Then get the order number
     
   Scenario: Cancel the booked order
     Given search for the booked order
     Then select the order and cancel it
     And search for the cancelled order and do the validation
     
   @logout 
   Scenario: Logout 
     Then click on Logout button 
     And validate login link is displayed
     