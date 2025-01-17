Feature: Retail Page 

Background: 
	Given User is on Retail website 
	And User click  on MyAccount 
	When User click on Login 
	And User enter username 'r.jtem@gmail.com' and password '123abc'
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
	
Scenario: Register as an Affiliate user with Cheque Payment Method 
	When User click on 'Register for an Affiliate Account' link 
	And User fill affiliate form with below information 
		|company|website  |taxID  |paymentMethod| chequePayeeName |
		|Rjane  |rjane.com|1234567|    cheque   | janeR            |
	And User check on About us check box 
	And User should click on Continue button 
	Then User should see a success message 
	

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer 
	When User click on 'Edit your affiliate information' link 
	And user click on 'Bank Transfer' radio button 
	And User fill Bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|BOA     |77777    |77777    |rjane      |123456789    |
	And User click on Continue button 
	Then User see a success message 
	

Scenario: Edit your account Information 
	When User click on 'Edit your account information' link 
	And User modify below information 
		|firstname|lastName|email          |telephone|
		|Jane     |R       |r.tem@gmail.com|1234567899|
	And User click on continue button 
	Then User should seea message ‘Success: Your account has been successfully updated.’
	
