Feature: Testing UpWork Website


	Scenario: User reaches to the Upwork Website
		Given User navigate to the Upwork Website using the link
	
	Scenario: Sign up on UpWork
		Given User navigate to the Signup page
    And User fill the form and submit
	 
 	Scenario: Login on UpWork
		Given User navigate to the Login page
		And User enter Username or EmailId and Password
 		
 	Scenario: Searching using Search box
 		Given The Home page displays
 		And User Enter keywords in the search box and submit 
 		
 	Scenario: Reading Article
 		Given  User click Content types
 		And User click Article
 		
 	Scenario: Calculting using YouTube Money Calculator
 		Given User click more option
 		And User click YouTube Money Calculator
 		And User Enter RPM and Number of Views and submit
 	