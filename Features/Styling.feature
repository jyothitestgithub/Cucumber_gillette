Feature: Styling verification 

@regression 
Scenario: Verification of styling 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.gillette.co.in/en-in" site 
	When User clicks on "Styling" under "Learn" in footer 
	Then Verify that text "Facial Hair Styles: The Anchor Beard" is displayed under list of articles under styling 
	And close browser