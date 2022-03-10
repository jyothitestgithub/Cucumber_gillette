Feature: Product verification 

@smoke
Scenario: Verification of a Product 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.gillette.co.in/en-in" site 
	When User hovers on Products 
	And User clicks on "MACH3" under By Brands 
	Then Verify that text "Gillette MACH3 Turbo" is displayed under out of products list 
	And close browser