package stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopsPageObj;
import utilities.WebDriverUtility;

public class DesktopsStepDefinition extends Base {

	DesktopsPageObj desktopsPageObj = new DesktopsPageObj();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desktopsPageObj.clickOnDesktopButton();
		logger.info("User click on Desktops tab");
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desktopsPageObj.clickOnDesktopsShowAllButton();
		logger.info("User click on Show all desktops");
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
//		List<Boolean> allItems =new ArrayList<Boolean>(Arrays.asList(new Boolean[12]));
//	    System.out.println(allItems.size());
//		allItems.add(desktopsPageObj.appleCinema30ImageIsDisplayed());
//		allItems.add(desktopsPageObj.canonEOS5DImageIsDisplayed());
//		allItems.add(desktopsPageObj.hpLP3065LaptopImgIsDisplayed());
//		allItems.add(desktopsPageObj.htcTouchHDImgIsDisplayed());
//		allItems.add(desktopsPageObj.iphoneImageIsDisplayed());
//		allItems.add(desktopsPageObj.iPodClassicImgIsDisplayed());
//		allItems.add(desktopsPageObj.macBookImageIsDisplayed());
//		allItems.add(desktopsPageObj.macBookAirImgIsDisplayed());
//		allItems.add(desktopsPageObj.palmTreoProImgIsDisplayed());
//		allItems.add(desktopsPageObj.product_8_ImgIsDisplayed());
//		allItems.add(desktopsPageObj.samsung_SyncMaster_941BW_ImgIsDisplayed());
//		allItems.add(desktopsPageObj.sony_VAIO_ImgIsDisplayed());
//
//		for (int i = 1; i < allItems.size(); i++) {
//			System.out.println(i + " Item is present" + allItems);
//			WebDriverUtility.screenShot();
//		}
//		
		Assert.assertTrue(desktopsPageObj.appleCinema30ImageIsDisplayed());
		logger.info("Apple Cinema30 Image Is Displayed");
		Assert.assertTrue(desktopsPageObj.canonEOS5DImageIsDisplayed());
		logger.info("Canon EOS5D Image Is Displayed()");
		Assert.assertTrue(desktopsPageObj.hpLP3065LaptopImgIsDisplayed());
		logger.info("HP LP3065 Laptop Image Is Displayed()");
		WebDriverUtility.screenShot();
		Assert.assertTrue(desktopsPageObj.htcTouchHDImgIsDisplayed());
		logger.info("HTC TouchHD Image Is Displayed()");
		Assert.assertTrue(desktopsPageObj.iphoneImageIsDisplayed());
		logger.info("Iphone Image Is Displayed()");
		Assert.assertTrue(desktopsPageObj.iPodClassicImgIsDisplayed());
		logger.info("IPod Classic Image Is Displayed()");
		WebDriverUtility.screenShot();
		Assert.assertTrue(desktopsPageObj.macBookImageIsDisplayed());
		logger.info("MacBook Image Is Displayed()");
		Assert.assertTrue(desktopsPageObj.macBookAirImgIsDisplayed());
		logger.info("MacBook Air Image Is Displayed()");
		Assert.assertTrue(desktopsPageObj.palmTreoProImgIsDisplayed());
		logger.info("Palm Treo Pro Image IsDisplayed()");
		Assert.assertTrue(desktopsPageObj.product_8_ImgIsDisplayed());
		logger.info("Product 8 Image Is Displayed()");
		WebDriverUtility.screenShot();
		Assert.assertTrue(desktopsPageObj.samsung_SyncMaster_941BW_ImgIsDisplayed());
		logger.info("Samsung SyncMaster 941BW Image Is Displayed()");
		Assert.assertTrue(desktopsPageObj.appleCinema30ImageIsDisplayed());
		logger.info("Sony VAIO Image Is Displayed()");

	}
//HP LP 3065
	@When("^User click ADD TO CART option on '(.+)' item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_3065_item(String value) throws Throwable {
		desktopsPageObj.clickOnAddHPToCartBtn();
		logger.info("User click ADD TO CART option on 'HP LP 3065' item");
		WebDriverUtility.screenShot();
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantityOfHP(String quantity) throws Throwable {
		desktopsPageObj.clickOnAddQuantity();
		desktopsPageObj.enterQuantity("1");
		logger.info("User select quantity of item '1' ");
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktopsPageObj.clickOnAddToCartButton();
		logger.info("User click add to Cart button");
	}

	@Then("^User should see a message ‘Success: you have added 'HPLP3065' to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HPLP3065_to_your_Shopping_cart() throws Throwable {
		Assert.assertTrue(desktopsPageObj.hpSuccessAddedOutcome());
		WebDriverUtility.screenShot();
		logger.info("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’");
	}

//Cannon EOS 5D
	@When("^User click ADD TO CART option on '(.+)'item$")
	public void user_click_ADD_TO_CART_option_on_item(String value) throws Throwable {
		desktopsPageObj.clickOnAddCanonToCartBtn();
		logger.info("User click ADD TO CART option on 'Canon EOS 5D'item");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown '(.+)'$")
	public void user_select_color_from_dropdown(String value) throws Throwable {
		desktopsPageObj.clickOnSelectColorBtn();
		logger.info("User select color from dropdown 'Red'");
		WebDriverUtility.screenShot();
	}

	@When("^User select quantity of item (\\d+)$")
	public void user_select_quantity_Of_item(String Value) throws Throwable {
		desktopsPageObj.clickOnAddQuantity();
		desktopsPageObj.enterQuantity("1");
		logger.info("User select quantity of item '1' ");
	}

	@When("^User click add to cart buttons$")
	public void user_click_add_to_cart_buttons() throws Throwable {
		desktopsPageObj.canonEOS5DClickOnAddToCartButton();
		logger.info("User click add to cart buttons");

	}

	@Then("^User should see a message ‘Success: You have added 'CanonEOS5D' to your shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_CanonEOS5D_to_your_shopping_cart() throws Throwable {
		Assert.assertTrue(desktopsPageObj.canonSuccessAddedOutcome());
		logger.info("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’");
		WebDriverUtility.screenShot();
	}

//Review
	@When("^User click on '(.+)' item$")
	public void user_click_on_item(String value) throws Throwable {
		desktopsPageObj.clickOncanonEOS5D();
		logger.info("User click on 'Canon EOS 5D' item");
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		desktopsPageObj.clickWriteAReviewcanonEOS5Dlink();
		logger.info("User click on write a review link");
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable reviewInformation) throws Throwable {
		List<Map<String, String>> reviewInformationDataValues = reviewInformation.asMaps(String.class, String.class);
		desktopsPageObj.enterYourName(reviewInformationDataValues.get(0).get("yourName"));
		desktopsPageObj.enterYourReview(reviewInformationDataValues.get(0).get("yourReview"));
		desktopsPageObj.rateProductCanonEOS5D();
		WebDriverUtility.screenShot();
		logger.info("user fill the review information with below information");

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		desktopsPageObj.clickContinueButton();
		logger.info("User click on Continue Button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval’$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		Assert.assertTrue(desktopsPageObj.reviewWasSuccessfullySubmitted());
		logger.info(
				"User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval’ ");
		WebDriverUtility.screenShot();
	}
}
