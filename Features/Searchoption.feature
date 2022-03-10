Feature: Search icon functionality 

@smoke
Scenario Outline: Verification of search functionality 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.gillette.co.in/en-in" site 
	When User clicks on Search icon 
	And User enters search <keyword> 
	And User again clicks on Search icon 
	Then Verify that text <result> is displayed at the top of search results
	And close browser 
	
	
Examples: 
|keyword        |result               |
|Razor          |Results For "Razor"  |	