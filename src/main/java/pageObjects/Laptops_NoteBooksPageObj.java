package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Laptops_NoteBooksPageObj extends Base {

	public Laptops_NoteBooksPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks' and @class='dropdown-toggle']")
	private WebElement laptops_Notebooks_Button;

	public void clickOnlaptops_Notebooks_Button() {
		WebDriverUtility.clickOnElement(laptops_Notebooks_Button);
	}

	@FindBy(xpath = "//a[text()='Macs (0)']")
	private WebElement laptops_Notebooks_Mac0Button;

	@FindBy(xpath = "//a[text()='Windows (0)']")
	private WebElement laptops_Notebooks_Windows_Button;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement laptops_Notebooks_ShowAll_Button;

	public void clickOnDesktopsShowAllButton() {
		WebDriverUtility.clickOnElement(laptops_Notebooks_ShowAll_Button);
	}

	// Laptops & Notebooks(5)
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Laptops & Notebooks']")
	private WebElement laptops_NotebooksButton;

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

	// Computer small pictures
	@FindBy(xpath = "//img[@class='img-thumbnail']")
	private WebElement ComputerSmallImg;

	// Text Logo Laptops & Notebooks
	@FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
	private WebElement laptops_Notebooks;

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

	// ______________________________________________________

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

	// macBook
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookText;
//	@FindBy(xpath = "//button[contains(@onclick,'43') and contains(@onclick,'cart')]")

	@FindBy(xpath = "//button[@id='button-cart']")
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

	// MacBook Pro
	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookProImg;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProText;
	@FindBy(xpath = "//button[contains(@onclick,'45') and contains(@onclick,'cart')]")
	private WebElement macBookProShoppingCartBtn;
	@FindBy(xpath = "//button[contains(@onclick,'45') and contains(@onclick,'wishlist')]")
	private WebElement macBookProWishListBtn;
	@FindBy(xpath = "//button[contains(@onclick,'45') and contains(@onclick,'compare')]")
	private WebElement macBookProCompareBtn;

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
	
	//showing pages 1 to 5
	
	@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPages1_5;
	
	
//Success message added to cart
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successAddedToCart;
	
//User should see '1tem(s)-602.00' showed to the cart
	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement itemShowedToTheCart;

//remove the Item button	
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement removeTheItemButton;
	
//item should be removed and cart should show '0 item(s)'	
	@FindBy(xpath="//span[text()=' 0 item(s) - $0.00']")
	private WebElement itemRemovedFromCartText;
	
//Success: You have added MacBook Air to your product comparison!
	@FindBy(xpath="//div[text()=' Success: You have added ' and 'MacBook Air']")
	private WebElement macBookAirComparison;
//User click on Product comparison link
	@FindBy(xpath="//a[contains(text(), 'product comparison')]")
	private WebElement productComparisonLink;
//User should see Product Comparison Chart
	@FindBy(xpath="//div[@id='content']")
	private WebElement productComparisonChart;
//User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’
	@FindBy(xpath="//div[contains(text(), 'You must')]")
	private WebElement messageToLoginCreateAccount;
	
//User should see '$2,000.00' price tag is present on UI
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement macBookProTag;
	
	
// Scenario #1	
	public void clickOnMacBookImg() {
		WebDriverUtility.clickOnElement(macBookImage);
	}
	
	public void macBookAddButton() {
		WebDriverUtility.clickOnElement(macBookShoppingCartBtn);
	}
	
	public boolean successMessageAddedInCart() {
		boolean successItemAdded = successAddedToCart.isDisplayed();
		return successItemAdded;
	}
	
	public boolean itemShowedToTheCart() {
		boolean successMessage = itemShowedToTheCart.isDisplayed();
		return successMessage;
	}
	public void showedCartButton() {
		WebDriverUtility.clickOnElement(itemShowedToTheCart);
	}
	public void removeItemFromCartRedButton() {
		WebDriverUtility.clickOnElement(removeTheItemButton);
	}
	
	public boolean itemRemovedFromCart() {
		boolean itemRemoved = itemRemovedFromCartText.isDisplayed();
		return itemRemoved;
	}

	
// Scenario #2
//User click on product comparison icon on 'MacBook' 
	
	public void macBookComparison() {
		WebDriverUtility.clickOnElement(macBookCompareBtn);
	}
//User click on product comparison on 'MacBook Air'
	public void macBookAirComparison() {
		WebDriverUtility.clickOnElement(macBookAirCompareBtn);
	}
	
//User should see a message ‘Success: You have added MacBook Air to your product comparison!’
	public boolean successComparisonMessage() {
		boolean successComparison = macBookAirComparison.isDisplayed();
		return successComparison;
	}
//User click on Product comparison link
	public void clickProductComparisonLink() {
		WebDriverUtility.clickOnElement(productComparisonLink);
	}
//User should see Product Comparison Chart	
	public boolean visibiltyOfProductComparisonChart() {
		boolean comparisonChart = productComparisonChart.isDisplayed();
		return comparisonChart;
	}
	
	
	
//Scenario #3 Adding an item to Wish list
	
	public void clickToSonyVaioWishList() {
		WebDriverUtility.clickOnElement(sony_VAIO_WishListBtn);
	}
//User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’	
	public boolean messageToLoginOrCreateAccount() {
		boolean messageToLogin = messageToLoginCreateAccount.isDisplayed();
		return messageToLogin;
	}
	
//Scenario #4 Validate the price of MacBook Pro is '2000' 
	
	public void clickOnMacBookPro() {
		WebDriverUtility.clickOnElement(macBookProImg);
	}
	
// User should see '$2,000.00' price tag is present on UI
	public boolean macBookProPriceTag() {
		boolean priceTag = macBookProTag.isDisplayed();
		return priceTag;
	}
}
