package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {

	// In this class we will write actual java/selenium code associated to each
	// Scenario
	// Steps.

	RetailPageObj retailPage = new RetailPageObj();

//	@When("^User search for '(.+)'$")
//	public void user_search_for_iphone(String value) throws Throwable {
//		retailPage.enterValueToSearchBar(value);
//		logger.info("User entered value in search bar");
//		WebDriverUtility.screenShot();
//	}
//
//	@When("^User click on search button$")
//	public void user_click_on_search_button() throws Throwable {
//		retailPage.clickOnSearchButton();
//		logger.info("User clicked on search button");
//	}
//
//	@Then("^User should see Iphone image$")
//	public void user_should_see_Iphone_image() throws Throwable {
//		Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
//		WebDriverUtility.screenShot();
//	}
//
//	@When("^User click on Register option$")
//	public void user_click_on_Register_option() throws Throwable {
//		retailPage.clickOnRegister();
//		logger.info("User clicked on Register option");
//	}
//	@When("^User fill the Registration form with Below information$")
//	public void user_fill_the_Registration_form_with_Below_information(DataTable personalInfo) throws Throwable {
//		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
//		retailPage.enterFirstName(dataValues.get(0).get("firstName"));
//		retailPage.enterLastName(dataValues.get(0).get("lastName"));
//		retailPage.enterEmailName(dataValues.get(0).get("email"));
//		retailPage.enterTelephone(dataValues.get(0).get("telephone"));
//		retailPage.enterPassword(dataValues.get(0).get("password"));
//		retailPage.enterConfirmPasswordName(dataValues.get(0).get("confirmPassword"));
//		retailPage.subscribe(dataValues.get(0).get("subscribe"));
//		logger.info("User filled the information form");
//		WebDriverUtility.screenShot();
//	}
//	@When("^User accept the privacy and policy$")
//	public void user_accept_the_privacy_and_policy() throws Throwable {
//		retailPage.checkPrivacyPolicy();
//		logger.info("User check privacy and policy");
//		WebDriverUtility.screenShot();
//	}
//	@When("^user click on Continue button$")
//	public void user_click_on_Continue_button() throws Throwable {
//		retailPage.clickOnContinueButton();
//		logger.info("User clicked on Continue button");
//	}
//	@Then("^User should be registered in Retail Website$")
//	public void user_should_be_registered_in_Retail_Website() throws Throwable {
//		Assert.assertTrue(retailPage.registrationOutcome());
//		WebDriverUtility.screenShot();
//		logger.info("Account was created Successfully");
//	}
//	

//Assignment page#3

	@When("^User click on 'Register for an Affiliate Account' link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		retailPage.clickRegisterForAffiliateAccount();
		logger.info("User click on 'Register for an Affiliate Account' link");
		WebDriverUtility.screenShot();
	}

	@And("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable affiliateInformation) throws Throwable {
		List<Map<String, String>> affiliateDataValues = affiliateInformation.asMaps(String.class, String.class);
		retailPage.enterCompanyName(affiliateDataValues.get(0).get("company"));
		retailPage.enterWebSite(affiliateDataValues.get(0).get("rjane.com"));
		retailPage.enterTaxID(affiliateDataValues.get(0).get("1234567"));
		retailPage.clickChequeRadioButton();
		retailPage.enterChequePayeeName(affiliateDataValues.get(0).get("janeR"));
		logger.info("User fill affiliate form with below information");
		WebDriverUtility.screenShot();

	}

	@And("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		retailPage.clickAboutUsCheckBox();
		logger.info("User check on About us check box");
		WebDriverUtility.screenShot();
	}

	@And("^User should click on Continue button$")
	public void user_should_click_on_Continue_button() throws Throwable {
		retailPage.clickOnAffiliateContinueButton();
		logger.info("User should click on continue button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		Assert.assertTrue(retailPage.affiliateSuccessOutcome());
		WebDriverUtility.screenShot();
		logger.info("User should see a success message");
	}

//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	@When("^User click on 'Edit your affiliate information' link$")
	public void user_click_on_Edit_your_affiliate_information_link() throws Throwable {
		retailPage.clickOnEditAffiliateInformation();
		logger.info("User click on 'Edit your affiliate information' link");
		WebDriverUtility.screenShot();
	}

	@And("^user click on 'Bank Transfer' radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		retailPage.clickOnBankTransferRadioButton();
		logger.info("user click on 'Bank Transfer' radio button");
		WebDriverUtility.screenShot();
	}

	@And("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable bankTransfer) throws Throwable {
		List<Map<String, String>> bankTransferDataValues = bankTransfer.asMaps(String.class, String.class);
		retailPage.enterBankName(bankTransferDataValues.get(0).get("bankName"));
		retailPage.enterABANumber(bankTransferDataValues.get(0).get("abaNumber"));
		retailPage.enterSwiftCode(bankTransferDataValues.get(0).get("swiftCode"));
		retailPage.enterAccountName(bankTransferDataValues.get(0).get("accountName"));
		retailPage.enterAccountNumber(bankTransferDataValues.get(0).get("accountNumber"));
		logger.info("User fill Bank information with below information");
		WebDriverUtility.screenShot();

	}
	
	@And("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		retailPage.clickOnAffiliateContinueButton();
		logger.info("User click on continue button");
		WebDriverUtility.screenShot();
	}

	@Then("^User see a success message$")
	public void user_see_a_success_message() throws Throwable {
		Assert.assertTrue(retailPage.affiliateSuccessOutcome());
		WebDriverUtility.screenShot();
		logger.info("User  see a success message");
	}

//Scenario: Edit your account Information
	@When("^User click on 'Edit your account information' link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		retailPage.clickOnEditAccountInformation();
		logger.info("User click on 'Edit your account information' link");
		WebDriverUtility.screenShot();
	}

	@And("^User modify below information$")
	public void user_modify_below_information(DataTable accountInformation) throws Throwable {
		List<Map<String, String>> accountInformationDataValues = accountInformation.asMaps(String.class, String.class);
		retailPage.enterModifiedFirstName(accountInformationDataValues.get(0).get("firstname"));
		retailPage.enterModifiedLasttName(accountInformationDataValues.get(0).get("lastName"));
		retailPage.enterModifiedEmail(accountInformationDataValues.get(0).get("email"));
		retailPage.enterModifiedTelephponeNumber(accountInformationDataValues.get(0).get("telephone"));
		logger.info("User modify below information");
		WebDriverUtility.screenShot();

	}

	@And("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		retailPage.clickOnAffiliateContinueButton();
		logger.info("User click on continue button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should seea message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_seea_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		Assert.assertTrue(retailPage.affiliateSuccessOutcome());
		WebDriverUtility.screenShot();
		logger.info("User should see a success message");
	}

}