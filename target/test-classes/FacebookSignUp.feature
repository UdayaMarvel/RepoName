
@f
Feature: Facebook Signup


@s1 @s2 @s3 @s4
Scenario: Sign Up
	Given User create a new account
	When user enters firstname
	And User enters lastname
	And User enters emailId
	Then validate the signup page
	And Verify the signup is enabled
	
@s2	@s3
Scenario: Sign
	Given User create a new account
	When user enters firstname
	And User enters lastname
	And User enters emailId
	Then validate the signup page
	And Verify the signup is enabled