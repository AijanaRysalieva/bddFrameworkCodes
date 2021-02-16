package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class ComponentsPageObj extends Base {

	public ComponentsPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Components' and @class='dropdown-toggle']")
	private WebElement Components_Button;

	public void clickOnComponentsButton() {
		WebDriverUtility.clickOnElement(Components_Button);
	}

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Mice and Trackballs (0)']")
	private WebElement components_MiceAndTrackball_Button;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Monitors (2)']")
	private WebElement components_Monitors_Button;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Printers (0)']")
	private WebElement components_Printers_Button;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Scanners (0)']")
	private WebElement components_Scanners_Button;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Web Cameras (0)']")
	private WebElement components_WebCameras_Button;

	@FindBy(xpath = "//a[text()='Show All Components']")
	private WebElement components_ShowAll_Button;

	public void clickOnDesktopsShowAllButton() {
		WebDriverUtility.clickOnElement(components_ShowAll_Button);
	}

// Laptops & Notebooks(5)
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Components']")
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

// Text Logo Components
	@FindBy(xpath = "//h2[text()='Components']")
	private WebElement Components;

// Refine Search
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;

// dotted links
	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Mice and Trackballs (0)']")
	private WebElement miceAndTrackball_Link;

	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Monitors (2)']")
	private WebElement monitors_Link;

	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Printers (0)']")
	private WebElement printers_Link;

	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Scanners (0)']")
	private WebElement scanners_Link;

	@FindBy(xpath = "//div[@class='col-sm-3']//a[text()='Web Cameras (0)']")
	private WebElement webCameras_Link;
}
