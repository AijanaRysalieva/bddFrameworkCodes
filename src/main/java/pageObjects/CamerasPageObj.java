package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class CamerasPageObj extends Base {

	public CamerasPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement CamerasButton;

	public void clickOnCamerasButton() {
		WebDriverUtility.clickOnElement(CamerasButton);
	}

	@FindBy(xpath = "//a[text()='Canon (1)']")
	private WebElement cannon1_Button;

	@FindBy(xpath = "//a[text()='Nikon (1)']")
	private WebElement nikon1_Button;

	@FindBy(xpath = "//a[text()='Show All Cameras']")
	private WebElement camerasShowAllButton;

	public void clickOnDesktopsShowAllButton() {
		WebDriverUtility.clickOnElement(camerasShowAllButton);
	}

	// home button
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement home_Button;

	// Cameras
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Cameras']")
	private WebElement cameras_Top_Button;

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
	@FindBy(xpath = "//a[@class='list-group-item' and contains(text(), 'Canon (1)')]")
	private WebElement listCanon_1;
	@FindBy(xpath = "//a[@class='list-group-item' and contains(text(), 'Nikon (1)')]")
	private WebElement listNikon_1;

	@FindBy(xpath = "//a[text()='MP3 Players (4)']")
	private WebElement listMP3Player;

	// Computer large picture
	@FindBy(xpath = "//img[@class='img-responsive' and @alt='HP Banner']")
	private WebElement ComputerLargeImg;

	// Text Cameras
	@FindBy(xpath = "//h2[text()='Cameras']")
	private WebElement Cameras_Logo;

	// Refine Search
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;

	// Dotted Canon
	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Canon (1)']")
	private WebElement dotCanon;

	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Nikon (1)']")
	private WebElement dotNikon;

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
	
	// Nikon D300
	@FindBy(xpath = "//img[@title='Nikon D300']")
	private WebElement nikon_D300_Image;
	@FindBy(xpath = "//a[text()='Nikon D300']")
	private WebElement nikon_D300_Text;
	@FindBy(xpath = "//button[contains(@onclick,'31') and contains(@onclick,'cart')]")
	private WebElement nikon_D300_ShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'31') and contains(@onclick,'wishlist')]")
	private WebElement nikon_D300_WishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'31') and contains(@onclick,'compare')]")
	private WebElement nikon_D300_CompareBtn;
	
	
	//showing pages 1 to 2
	
	@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPages;
	
}
