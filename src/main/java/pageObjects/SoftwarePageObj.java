package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class SoftwarePageObj extends Base {

	public SoftwarePageObj() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[text()='Software']")
	private WebElement software_Button;

	public void clickOnSoftware_Button() {
		WebDriverUtility.clickOnElement(software_Button);
	}

	// software Top
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Software']")
	private WebElement software_Top_Button;

	// Desktops List
	@FindBy(xpath = "//a[@class='list-group-item' and contains(text(),'Desktops (13)')]")
	private WebElement Desktops_13;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement listLaptopsAndNotebooks;

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

	// Text Logo Software
	@FindBy(xpath = "//h2[text()='Software']")
	private WebElement software_Logo;
	
	
	//No Product Link
	@FindBy(xpath = "//p[text()='There are no products to list in this category.']")
	private WebElement no_Product_link;
	
	//Continue Button
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement continue_Button;

}
