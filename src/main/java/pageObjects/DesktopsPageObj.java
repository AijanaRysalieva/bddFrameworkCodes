package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObj extends Base {

	public DesktopsPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsButton;

	public void clickOnDesktopButton() {
		WebDriverUtility.clickOnElement(desktopsButton);
	}

	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement desktopsPCButton;

	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement desktopsMacPCButton;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement desktopsShowAllButton;

	public void clickOnDesktopsShowAllButton() {
		WebDriverUtility.clickOnElement(desktopsShowAllButton);
	}

	// Desktops List
	@FindBy(xpath = "//a[@class='list-group-item active']")
	private WebElement desktopsListMenue;

	@FindBy(xpath = "//a[@class='list-group-item'][1]")
	private WebElement desktopsListPC;

	@FindBy(xpath = "///a[@class='list-group-item'][2]")
	private WebElement desktopsListMac;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement desktopsListLaptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='Components (2)']")
	private WebElement desktopsListComponents;

	@FindBy(xpath = "//a[text()='//a[text()='Tablets (1)']")
	private WebElement desktopsListTablets;

	@FindBy(xpath = "//a[text()='Software (0)']")
	private WebElement desktopsListSoftware;

	@FindBy(xpath = "//a[text()='Phones & PDAs (3)']")
	private WebElement desktopsListPhonesAndPDAs;

	@FindBy(xpath = "//a[text()='Cameras (2)']")
	private WebElement desktopsListCameras;

	@FindBy(xpath = "//a[text()='MP3 Players (4)']")
	private WebElement desktopsListMP3Player;

	// Computer large picture
	@FindBy(xpath = "//img[@class='img-responsive' and @alt='HP Banner']")
	private WebElement desktopComputerLargeImg;

	// Computer small pictures
	@FindBy(xpath = "//img[@class='img-thumbnail']")
	private WebElement desktopComputerSmallImg;

	// Text Logo Desktop
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement desktops;

	// Refine Search
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;

	// List Button
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement listButton;

	// Grid Button
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement gridButton;

	// Product Compare
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productCompareLink;

	// Sort By button
	@FindBy(xpath = "//label[@class='input-group-addon' and @for='input-sort']")
	private WebElement sortBybutton;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortByWindow;

	// Show Button
	@FindBy(xpath = "//label[@class='input-group-addon' and @for='input-limit']")
	private WebElement showButton;
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement showWindow;

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
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement canonEOS5DSelectColorBtn;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement canonEOS5DSelectQuantityBtn;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement canonEOS5DAddToCartBtn;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement canonEOS5DsuccessAddedMessage;
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement canonEOS5DWriteAReviewLink;
	

	// HP LP3065
	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement hpLP3065LaptopImg;
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065LaptopText;
	@FindBy(xpath = "//button[contains(@onclick,'47') and contains(@onclick,'cart')]")
	private WebElement hpLP3065LaptopShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'47') and contains(@onclick,'wishlist')]")
	private WebElement hpLP3065LaptopWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'47') and contains(@onclick,'compare')]")
	private WebElement hpLP3065LaptopCompareBtn;
	@FindBy(xpath="//*[@id=\"input-quantity\"]")
	private WebElement addQuantity ;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement hpLP3065AddToCartBtn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement hpLP3065successAddedMessage;

	// HTC Touch HD
	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement htcTouchHDImg;
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement htcTouchHDText;
	@FindBy(xpath = "//button[contains(@onclick,'28') and contains(@onclick,'cart')]")
	private WebElement htcTouchHDShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'28') and contains(@onclick,'wishlist')]")
	private WebElement htcTouchHDWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'28') and contains(@onclick,'compare')]")
	private WebElement htcTouchHDCompareBtn;

	// iPhone
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

	// iPod Classic
	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImg;
	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement iPodClassicText;
	@FindBy(xpath = "//button[contains(@onclick,'48') and contains(@onclick,'cart')]")
	private WebElement iPodClassicShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'48') and contains(@onclick,'wishlist')]")
	private WebElement iPodClassicWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'48') and contains(@onclick,'compare')]")
	private WebElement iPodClassicCompareBtn;

	// macBook
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

	// MacBook Air
	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImg;
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAirText;
	@FindBy(xpath = "//button[contains(@onclick,'44') and contains(@onclick,'cart')]")
	private WebElement macBookAirShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'44') and contains(@onclick,'wishlist')]")
	private WebElement macBookAirWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'44') and contains(@onclick,'compare')]")
	private WebElement macBookAirCompareBtn;

	// Palm Treo Pro
	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImg;
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProText;
	@FindBy(xpath = "//button[contains(@onclick,'29') and contains(@onclick,'cart')]")
	private WebElement palmTreoProShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'29') and contains(@onclick,'wishlist')]")
	private WebElement palmTreoProWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'29') and contains(@onclick,'compare')]")
	private WebElement palmTreoProCompareBtn;

	// Product 8
	@FindBy(xpath = "//img[@title='Product 8']")
	private WebElement product_8_Img;
	@FindBy(xpath = "//a[text()='Product 8']")
	private WebElement product_8_Text;
	@FindBy(xpath = "//button[contains(@onclick,'35') and contains(@onclick,'cart')]")
	private WebElement product_8_ShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'35') and contains(@onclick,'wishlist')]")
	private WebElement product_8_WishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'35') and contains(@onclick,'compare')]")
	private WebElement product_8_CompareBtn;

	// Samsung SyncMaster 941BW
	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsung_SyncMaster_941BW_Img;
	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsung_SyncMaster_941BW_Text;
	@FindBy(xpath = "//button[contains(@onclick,'33') and contains(@onclick,'cart')]")
	private WebElement samsung_SyncMaster_941BW_ShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'33') and contains(@onclick,'wishlist')]")
	private WebElement samsung_SyncMaster_941BW_WishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'33') and contains(@onclick,'compare')]")
	private WebElement samsung_SyncMaster_941BW_CompareBtn;

	// Sony VAIO
	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement sony_VAIO_Img;
	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement sony_VAIO_Text;
	@FindBy(xpath = "//button[contains(@onclick,'46') and contains(@onclick,'cart')]")
	private WebElement sony_VAIO_ShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'46') and contains(@onclick,'wishlist')]")
	private WebElement sony_VAIO_WishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'46') and contains(@onclick,'compare')]")
	private WebElement sony_VAIO_CompareBtn;

	// showing pages 1 to 12

	@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPages;
	
	
	//Write a review
	@FindBy(css="#input-name")
	private WebElement yourNameField;
	@FindBy(css="#input-review")
	private WebElement yourReviewField;
	@FindBy(xpath="//label[contains(text(),'Rating')]")
	private WebElement rating;
	@FindBy(xpath="//input[@value='5']")
	private WebElement goodRating;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOnContinueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewSubmittedOutcome;
	
	
	
//User should see all items are present in Desktop page
	public boolean appleCinema30ImageIsDisplayed() {

		if (appleCinema30Image.isDisplayed()) {
			return true;
		}else
			return false;
	}

	public boolean canonEOS5DImageIsDisplayed() {

		if (canonEOS5DImage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean hpLP3065LaptopImgIsDisplayed() {

		if (hpLP3065LaptopImg.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean htcTouchHDImgIsDisplayed() {

		if (htcTouchHDImg.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean iphoneImageIsDisplayed() {

		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean iPodClassicImgIsDisplayed() {

		if (iPodClassicImg.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean macBookImageIsDisplayed() {

		if (macBookImage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean macBookAirImgIsDisplayed() {

		if (macBookAirImg.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean palmTreoProImgIsDisplayed() {

		if (palmTreoProImg.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean product_8_ImgIsDisplayed() {

		if (product_8_Img.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean samsung_SyncMaster_941BW_ImgIsDisplayed() {

		if (samsung_SyncMaster_941BW_Img.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean sony_VAIO_ImgIsDisplayed() {

		if (sony_VAIO_Img.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//User click add to cart btn HP LP 3065	
	public void clickOnAddHPToCartBtn() {
		WebDriverUtility.clickOnElement(hpLP3065LaptopShoppingCartBtn);
	}

//user should select quantity 
	public void clickOnAddQuantity() {
		WebDriverUtility.clickOnElement(addQuantity);
		WebDriverUtility.clearText(addQuantity);
		
	}
	public void enterQuantity(String quantity) {
		WebDriverUtility.enterValue(addQuantity, quantity);
		
	}
//user add to cart	
	public void clickOnAddToCartButton() {
		WebDriverUtility.clickOnElement(hpLP3065AddToCartBtn);
	}

//Success: you have added HP LP 3065 to your Shopping cart!
	public boolean hpSuccessAddedOutcome() {
		boolean successMessage = hpLP3065successAddedMessage.isDisplayed();
		return successMessage;
	}
	
	
	

	// User click add to cart btn Canon EOS 5D
	public void clickOnAddCanonToCartBtn() {
		WebDriverUtility.clickOnElement(canonEOS5DShoppingCartBtn);
	}

//User should select color from dropdown Canon EOS 5D
	public void clickOnSelectColorBtn() {
		WebDriverUtility.clickOnElement(canonEOS5DSelectColorBtn);
		Select availableOptions = new Select(canonEOS5DSelectColorBtn);
		availableOptions.selectByIndex(1);
	}

	// user should select quantity Canon EOS 5D
	
	
	public void canonEOS5DClickOnAddToCartButton() {
		WebDriverUtility.clickOnElement(canonEOS5DAddToCartBtn);
	}
	public boolean canonSuccessAddedOutcome() {
		boolean successMessage = canonEOS5DsuccessAddedMessage.isDisplayed();
		return successMessage;
	}
	
	
		
		
//User click on Canon EOS 5D item 
		public void clickOncanonEOS5D() {
			WebDriverUtility.clickOnElement(canonEOS5DText);
		}
		//User click on Canon EOS 5D Write Review Button		
		public void clickWriteAReviewcanonEOS5Dlink() {
			WebDriverUtility.clickOnElement(canonEOS5DWriteAReviewLink);
		}
//Write a review	
		public void enterYourName(String yourName) {
			
			yourNameField.sendKeys(yourName);
		}
		
		public void enterYourReview(String yourReview) {
			yourReviewField.sendKeys(yourReview);
		}
		public void rateProductCanonEOS5D() {
				WebDriverUtility.clickOnElement(goodRating);
			}
		
		
//User should click on Continue Button
		public void clickContinueButton() {
			WebDriverUtility.clickOnElement(clickOnContinueButton);
		}
//User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.		
		public boolean reviewWasSuccessfullySubmitted() {
			boolean successMessage = reviewSubmittedOutcome.isDisplayed();
			return successMessage;
		}

}
