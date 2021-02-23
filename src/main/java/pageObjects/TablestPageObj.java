package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class TablestPageObj extends Base {

	public TablestPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[text()='Tablets']")
	private WebElement tablets_Button;

	public void clickOnTabletsButton() {
		WebDriverUtility.clickOnElement(tablets_Button);
	}

// Tablets
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Tablets']")
	private WebElement tablets_Top_Button;

// Desktops List
	@FindBy(xpath = "//a[@class='list-group-item active']")
	private WebElement listMenue;

	@FindBy(xpath = "//a[@class='list-group-item'][1]")
	private WebElement listPC;

	@FindBy(xpath = "///a[@class='list-group-item'][2]")
	private WebElement listMac;

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

// Text Logo Tablets
	@FindBy(xpath = "//h2[text()='Tablets']")
	private WebElement tablets_Logo;

//View buttons	
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement list_view_Button;
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement grid_View_Button;

	// Product-Compare
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement product_Compare;

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
	
	
	
//Samsung Galaxy Tab 10.1	
	@FindBy(xpath = "//img[@title = 'Samsung Galaxy Tab 10.1']")
	private WebElement samsung_Galaxy_Tab_Img;
	@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement samsung_Galaxy_Tab_Text;
	@FindBy(xpath = "//button[contains(@onclick,'49') and contains(@onclick,'cart')]")
	private WebElement samsung_Galaxy_Tab_ShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'49') and contains(@onclick,'wishlist')]")
	private WebElement samsung_Galaxy_Tab_WishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'49') and contains(@onclick,'compare')]")
	private WebElement samsung_Galaxy_Tab_CompareBtn;

	
	//showing pages 1 to 5
	
			@FindBy(xpath = "//div[text()='Showing 1 to 1 of 1 (1 Pages)']")
			private WebElement showingPages1_1;
}
