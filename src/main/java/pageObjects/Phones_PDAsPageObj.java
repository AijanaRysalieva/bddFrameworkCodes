package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Phones_PDAsPageObj extends Base {
	
	public Phones_PDAsPageObj() {

		PageFactory.initElements(driver, this);

	}
//Phones & PDAs Top Button
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[text()='Phones & PDAs']")
	private WebElement phones_PDAs_Button;

	public void clickOnphones_PDAs_Button() {
		WebDriverUtility.clickOnElement(phones_PDAs_Button);
	}
	
	// Phones & PDAs
		@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Phones & PDAs']")
		private WebElement phones_PDAs_Top_Button;

		// Desktops List
		@FindBy(xpath = "//a[@class='list-group-item' and contains(text(),'Desktops (13)')]")
		private WebElement Desktops_13;

		@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
		private WebElement listLaptopsAndNotebooks;
		
		@FindBy(xpath = "//a[text()='Components (2)']")
		private WebElement listComponents;

		@FindBy(xpath = "//a[text()='//a[text()='Tablets (1)']")
		private WebElement listTablets;
		
		@FindBy(xpath = "//a[text()='Software (0)']")
		private WebElement listSoftware;
		
		@FindBy(xpath = "//a[text()='Phones & PDAs (3)']")
		private WebElement listPhonesAndPDAs;
		
		@FindBy(xpath = "//a[text()='Cameras (2)']")
		private WebElement listCameras;

		@FindBy(xpath = "//a[text()='MP3 Players (4)']")
		private WebElement listMP3Player;
		
		
		// Computer large picture
		@FindBy(xpath = "//img[@class='img-responsive' and @alt='HP Banner']")
		private WebElement ComputerLargeImg;

		// Text Logo Phones & PDAs
		@FindBy(xpath = "//h2[text()='Phones & PDAs']")
		private WebElement software_Logo;
		
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
		
		
		//Iphone
		@FindBy(xpath="//img[@title='iPhone']")
		private WebElement iphoneImage;
		@FindBy(xpath="//a[text()='iPhone']")
		private WebElement iPhoneText;
		@FindBy(xpath = "//button[contains(@onclick,'40') and contains(@onclick,'cart')]")
		private WebElement iPhoneShoppingCartBtn;
		@FindBy(xpath = "//button[contains(@onclick,'40') and contains(@onclick,'wishlist')]")
		private WebElement iPhoneWishListBtn;
		@FindBy(xpath = "//button[contains(@onclick,'40') and contains(@onclick,'compare')]")
		private WebElement iPhoneCompareBtn;
		
		
		//Palm Treo Pro
		@FindBy(xpath="//img[@title='Palm Treo Pro']")
		private WebElement palmTreoPro_Image;
		@FindBy(xpath="//a[text()='Palm Treo Pro']")
		private WebElement palmTreoPro_Text;
		@FindBy(xpath = "//button[contains(@onclick,'29') and contains(@onclick,'cart')]")
		private WebElement palmTreoPro_ShoppingCartBtn;
		@FindBy(xpath = "//button[contains(@onclick,'29') and contains(@onclick,'wishlist')]")
		private WebElement palmTreoPro_WishListBtn;
		@FindBy(xpath = "//button[contains(@onclick,'29') and contains(@onclick,'compare')]")
		private WebElement palmTreoPro_CompareBtn;
		
		//showing pages 1 to 3
		@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
		private WebElement showingPages;
		

}
