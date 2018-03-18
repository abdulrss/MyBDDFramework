Feature: Validate Login Feature
	//general description of use case, business rules or acceptance criteria 

Scenario: Validate_Login_Test_Scenario

Given User is already on the Login page
When User verifies tile of the page is freeCRM
Then User enters userid and password
Then User clicks on SubmitButton
Then User navigates to HomePage
