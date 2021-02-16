package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	// Once we create Page Obj we need to extends the Base class to use Parent Class
	// properties such is Webdriver driver
	// we create a constructor and inside the constructor we define the
	// PageFactory.initElement
	// method to inisialize the Webelement in this page

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	// we need to store UI WebElements in a private WebElement using @Find By
	// annotation of
	// PageFactory class

	// Top LInks
	// Currency
	@FindBy(xpath = "//strong[text()='$']")
	private WebElement currencyIcon;
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyLink;
	@FindBy(xpath = "//i[@class='fa fa-caret-down']")
	private WebElement currencyArrow;
	// Telephone number link
	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement telNumber;
	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement telNumberIcon;
	// My account link
	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement myAccountIcon;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	@FindBy(xpath = "//span[@class='caret']")
	private WebElement myAccountArrow;
	// Wish list link
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement wishListIcon;
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishListLink;
	// Shopping cart link
	@FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
	private WebElement shoppingCartIcon;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCartLink;
	// checkOut link
	@FindBy(xpath = "//i[@class='fa fa-share']")
	private WebElement checkOutIcon;
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkOutLink;

	// Test Environment text
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentHomePageBtn;
	@FindBy(xpath = "//div[@class='row']")
	private WebElement testEnvironmentHomePageBtnRow;

	// search window and button
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	// Shopping Cart button
	@FindBy(xpath = "//button[@type='button' and @data-toggle='dropdown']")
	private WebElement shoppingCartButton;

	@FindBy(xpath = "//div[@id='cart']//i[@class='fa fa-shopping-cart']")
	private WebElement shoppingCartButtonIcon;

	@FindBy(xpath = "//button[@type='button' and @data-toggle='dropdown']")
	private WebElement shoppingCartButtonText;

	// DropDownButtons
	@FindBy(xpath = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
	private WebElement dropDownButtonsPannel;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsButton;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement Laptops_NoteBooksButton;

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement ComponentsButton;
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement TabletsButton;
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement SoftwareButton;
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement Phones_PDAsButton;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement CamerasButton;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement MP3_PlayersButton;

	// Banner and banner dots
	@FindBy(xpath = "//div[@class='swiper-viewport']//div[@id='slideshow0']")
	private WebElement bannerImage;
	@FindBy(xpath = "//span[contains(@class,'swiper-pagination-')][1]")
	private WebElement swiperUpperFirstDot;
	@FindBy(xpath = "//span[contains(@class,'swiper-pagination-')][2]")
	private WebElement swiperUpperSecondDot;

	// Featured frame
	@FindBy(xpath = "//h3[text()='Featured']")
	private WebElement featuredFrame;

	// MacBook

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookText;
	@FindBy(xpath = "//button[contains(@onclick,'43') and contains(@onclick,'cart')]")
	private WebElement macBookShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'43') and contains(@onclick,'wishlist')]")
	private WebElement macBookWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'43') and contains(@onclick,'compare')]")
	private WebElement macBookCompareBtn;

	// Iphone
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhoneText;
	@FindBy(xpath = "//button[contains(@onclick,'40') and contains(@onclick,'cart')]")
	private WebElement iPhoneShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'40') and contains(@onclick,'wishlist')]")
	private WebElement iPhoneWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'40') and contains(@onclick,'compare')]")
	private WebElement iPhoneCompareBtn;

	// Apple Cinema 30"
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinema30Image;
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinema30Text;
	@FindBy(xpath = "//button[contains(@onclick,'42') and contains(@onclick,'cart')]")
	private WebElement appleCinema30ShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'42') and contains(@onclick,'wishlist')]")
	private WebElement appleCinema30WishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'42') and contains(@onclick,'compare')]")
	private WebElement appleCinema30CompareBtn;

	// Cannon EOS 5D
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonEOS5DImage;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5DText;
	@FindBy(xpath = "//button[contains(@onclick,'30') and contains(@onclick,'cart')]")
	private WebElement canonEOS5DShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'30') and contains(@onclick,'wishlist')]")
	private WebElement canonEOS5DWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'30') and contains(@onclick,'compare')]")
	private WebElement canonEOS5DCompareBtn;

	// Advertisement Carousel
	@FindBy(xpath = "//div[@class='swiper-viewport']//div[@id='carousel0']")
	private WebElement carousel_swiper;

	// WebElements for Register page
	@FindBy(xpath = "(//a[text()='Register'])[1]")
	private WebElement registerOption;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(css = "#input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(xpath = "(//input[@value='1'])[1]")
	private WebElement yesSubscribeButton;
	
	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement noSubscribeButton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;

//	Scenario: Register as an Affiliate user with Cheque Payment Method 
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement accountCreatedContinueButton;
	
	@FindBy(xpath="//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliateAccount;
	
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement companyNameField;
	
	@FindBy(xpath="//input[@id='input-website']")
	private WebElement webSiteField;
	
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement taxIDField;
	
	@FindBy(xpath="//div[@id='payment-cheque']")
	private WebElement paymentMethodRadioBtn;
	
	@FindBy(xpath="//input[@id='input-cheque']")
	private WebElement chequePayeeNameField;
		
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement aboutUsCheckBbox;
//This Xpath used for three scenario	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement accountContinueButton;
	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement accountSuccessMessage;
	

//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer	
	@FindBy(xpath="//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliateInformationField;
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTransferRadioBtn;
	@FindBy(xpath="//input[@id='input-bank-name']")
	private WebElement bankNameField;
	@FindBy(xpath="//input[@id='input-bank-branch-number']")
	private WebElement abaNumberField;
	@FindBy(xpath="//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeField;
	@FindBy(xpath="//input[@id='input-bank-account-name']")
	private WebElement accountNameField;
	@FindBy(xpath="//input[@id='input-bank-account-number']")
	private WebElement accountNumberField;
	
//Scenario: Edit your account Information	
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editAccountInformationLink;
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement modifyFirstNameField;
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement modifyLastNameField;
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement modifyEmailField;
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement modifyTelephoneField;
		
	
	
	
	
	
	
	
	
	// we need to create public methods to perform required actions on each elements
	// we stored.

	public void enterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}

	public boolean iPhoneImageIsDisplayed() {

		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;
	}
	
	// we need to create method to perform on each WebElement.
	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(registerOption);
	}
	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);
	}
	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);
	}
	public void enterEmailName(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}
	public void enterTelephone(String phoneNumber) {
		WebDriverUtility.enterValue(telephoneField, phoneNumber);
	}
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}
	public void enterConfirmPasswordName(String confirmPassword) {
		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
	}
	
	public void subscribe(String valueOfSubscribe) {
		if(valueOfSubscribe.equalsIgnoreCase("yes")) {
			if(!yesSubscribeButton.isSelected())
			WebDriverUtility.clickOnElement(yesSubscribeButton);
		}else
			WebDriverUtility.clickOnElement(noSubscribeButton);
	}
	
	
	public void checkPrivacyPolicy() {
		
		if(privacyPolicyCheckBox.isDisplayed()) {
			privacyPolicyCheckBox.click();
		}
	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
	public boolean registrationOutcome() {
		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
	}
	
	
//User click on 'Register for an Affiliate Account' link
	public void accountCreatedContinueBtn() {
		WebDriverUtility.clickOnElement(accountCreatedContinueButton);
	}
	
	public void clickRegisterForAffiliateAccount() {
		WebDriverUtility.clickOnElement(registerForAffiliateAccount);
	}
	public void enterCompanyName(String company) {
		WebDriverUtility.enterValue(companyNameField, company);
	}
	
	public void enterWebSite(String website) {
		WebDriverUtility.enterValue(webSiteField, website);
	}
	
	public void enterTaxID(String taxID) {
		WebDriverUtility.enterValue(taxIDField, taxID);
	}
	
	public void clickChequeRadioButton() {
		WebDriverUtility.clickOnElement(paymentMethodRadioBtn);
	}
		
	public void enterChequePayeeName(String chequePayeeName) {
		WebDriverUtility.enterValue(chequePayeeNameField, chequePayeeName);
	}
	
	public void clickAboutUsCheckBox() {
		WebDriverUtility.clickOnElement(aboutUsCheckBbox);
	}
	
	public void clickOnAffiliateContinueButton() {
		WebDriverUtility.clickOnElement(accountContinueButton);
	}
	public boolean affiliateSuccessOutcome() {
		boolean successAffiliateMessage = accountSuccessMessage.isDisplayed();
		return successAffiliateMessage;
	}
	
	
//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	
	public void clickOnEditAffiliateInformation() {
		WebDriverUtility.clickOnElement(editAffiliateInformationField);
	}
	public void clickOnBankTransferRadioButton() {
		WebDriverUtility.clickOnElement(bankTransferRadioBtn);
	}
	public void enterBankName(String bankName) {
		WebDriverUtility.enterValue(bankNameField, bankName);
	}
	public void enterABANumber(String abaNumber) {
		WebDriverUtility.enterValue(abaNumberField, abaNumber);
	}
	public void enterSwiftCode(String swiftCode) {
		WebDriverUtility.enterValue(swiftCodeField, swiftCode);
	}
	public void enterAccountName(String accountName) {
		WebDriverUtility.enterValue(accountNameField, accountName);
	}
	public void enterAccountNumber(String accountNumber) {
		WebDriverUtility.enterValue(accountNumberField, accountNumber);
	}
	
//Scenario: Edit your account Information
	public void clickOnEditAccountInformation() {
		WebDriverUtility.clickOnElement(editAccountInformationLink);
	}
	public void enterModifiedFirstName(String firstname) {
		WebDriverUtility.clearText(modifyFirstNameField);
		WebDriverUtility.enterValue(modifyFirstNameField, firstname);
	}
	public void enterModifiedLasttName(String lastName) {
		WebDriverUtility.clearText(modifyLastNameField);
		WebDriverUtility.enterValue(modifyLastNameField, lastName);
	}
	public void enterModifiedEmail(String email) {
		WebDriverUtility.clearText(modifyEmailField);
		WebDriverUtility.enterValue(modifyEmailField, email);
	}
	public void enterModifiedTelephponeNumber(String telephone) {
		WebDriverUtility.clearText(modifyTelephoneField);
		WebDriverUtility.enterValue(modifyTelephoneField, telephone);
	}
	
	
}
