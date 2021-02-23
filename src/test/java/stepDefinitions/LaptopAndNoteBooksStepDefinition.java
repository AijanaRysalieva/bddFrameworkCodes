package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Laptops_NoteBooksPageObj;
import utilities.WebDriverUtility;

public class LaptopAndNoteBooksStepDefinition extends Base {
	
	Laptops_NoteBooksPageObj laptops_NoteBooksPageObj = new Laptops_NoteBooksPageObj();
	
	
//Add and Remove a Mac book from Cart	
	@When("^User click on 'Laptop & NoteBook' tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
	   laptops_NoteBooksPageObj.clickOnlaptops_Notebooks_Button();
	   logger.info("User click on Laptop & NoteBook tab");
		WebDriverUtility.screenShot();
	}

	@And("^User click on Show all 'Laptop & NoteBook' option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
	   laptops_NoteBooksPageObj.clickOnDesktopsShowAllButton();
	   logger.info("User click on Show all 'Laptop & NoteBook' option");
		WebDriverUtility.screenShot();
	}

	@And("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
	   laptops_NoteBooksPageObj.clickOnMacBookImg();
	   logger.info("User click on MacBook item");
		WebDriverUtility.screenShot();
	}
	@And("^User click to Cart button$")
	public void user_click_to_Cart_button() throws Throwable {
		laptops_NoteBooksPageObj.macBookAddButton();
		logger.info("User click to Cart button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
	    Assert.assertTrue(laptops_NoteBooksPageObj.successMessageAddedInCart());
	    logger.info("User should see a message ‘Success: You have added MacBook to your shopping cart!’");
	    WebDriverUtility.screenShot();
	}

	@And("^User should see '(.+)' showed to the cart$")
	public void user_should_see_showed_to_the_cart(String value) throws Throwable {
		Assert.assertTrue(laptops_NoteBooksPageObj.itemShowedToTheCart());
	    logger.info("User should see '1tem(s)-602.00' showed to the cart’");
	    WebDriverUtility.screenShot();
	}

	@And("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
	   laptops_NoteBooksPageObj.showedCartButton();
	   logger.info("User click on cart option n");
	   WebDriverUtility.screenShot();
	}

	@And("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
	 laptops_NoteBooksPageObj.removeItemFromCartRedButton();
	 logger.info("user click on red X button to remove the item from cart");
	   WebDriverUtility.screenShot();
	}

	@Then("^item should be removed and cart should show '(.+)'$")
	public void item_should_be_removed_and_cart_should_show_item_s(String value) throws Throwable {
		Assert.assertTrue(laptops_NoteBooksPageObj.itemRemovedFromCart());
	    logger.info("item should be removed and cart should show '0 item(s)'");
	    WebDriverUtility.screenShot();
	}
	
	
//Product Comparison
	@And("^User click on product comparison icon on 'MacBook'$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
	    laptops_NoteBooksPageObj.macBookComparison();
	    logger.info("User click on product comparison icon on 'MacBook'");
	    WebDriverUtility.screenShot();
	}

	@When("^User click on product comparison on 'MacBook Air'$")
	public void user_click_on_product_comparison_on_MacBook_Air() throws Throwable {
		laptops_NoteBooksPageObj.macBookAirComparison();
	    logger.info("User click on product comparison icon on 'MacBook Air'");
	    WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
		Assert.assertTrue(laptops_NoteBooksPageObj.successComparisonMessage());
	    logger.info("User should see a message ‘Success: You have added MacBook Air to your product comparison!’");
	    WebDriverUtility.screenShot();
	}

	@And("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		laptops_NoteBooksPageObj.clickProductComparisonLink();
	    logger.info("User click on Product comparison link");
	    WebDriverUtility.screenShot();
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		Assert.assertTrue(laptops_NoteBooksPageObj.visibiltyOfProductComparisonChart());
	    logger.info("User should see Product Comparison Chart");
	    WebDriverUtility.screenShot();
	}
	
	
//Adding an item to Wish list
	@And("^User click on heart icon to add '(.+)' laptop to wish list$")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String value) throws Throwable {
		laptops_NoteBooksPageObj.clickToSonyVaioWishList();
		WebDriverUtility.screenShot();
		logger.info("User click on heart icon to add 'Sony VaIO' laptop to wish list");
	    
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
		Assert.assertTrue(laptops_NoteBooksPageObj.messageToLoginOrCreateAccount());
		WebDriverUtility.screenShot();
		logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’");
	    
	}
	
//Validate the price of MacBook Pro is '2000'
	@And("^User click on MacBook Pro item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		laptops_NoteBooksPageObj.clickOnMacBookPro();
	    logger.info("User click on MacBook Pro item");
	    WebDriverUtility.screenShot();
	}
	
	@Then("^User should see '(.+)' price tag is present on UI$")
	public void user_should_see_price_tag_is_present_on_UI(String value) throws Throwable {
		Assert.assertTrue(laptops_NoteBooksPageObj.macBookProPriceTag());
		WebDriverUtility.screenShot();
		logger.info("User should see '$2,000.00' price tag is present on UI");
	    
	  
	}

}
