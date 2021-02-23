package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Mp3_PlayersPageObj extends Base{
	
	public Mp3_PlayersPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3_PlayersButton;

	public void clickOnmp3_PlayersButton() {
		WebDriverUtility.clickOnElement(mp3_PlayersButton);
	}

		
	//MP3 Player Drop Down Menu Buttons
	@FindBy(xpath = "//a[text()='test 4 (0)']")
	private WebElement test4_Button;
	@FindBy(xpath = "//a[text()='test 5 (0)']")
	private WebElement test5_Button;
	@FindBy(xpath = "//a[text()='test 6 (0)']")
	private WebElement test6_Button;
	@FindBy(xpath = "//a[text()='test 7 (0)']")
	private WebElement test7_Button;
	@FindBy(xpath = "//a[text()='test 8 (0)']")
	private WebElement test8_Button;
	@FindBy(xpath = "//a[text()='test 9 (0)']")
	private WebElement test9_Button;
	@FindBy(xpath = "//a[text()='test 11 (0)']")
	private WebElement test11_Button;
	@FindBy(xpath = "//a[text()='test 12 (0)']")
	private WebElement test12_Button;
	@FindBy(xpath = "//a[text()='test 15 (0)']")
	private WebElement test15_Button;
	@FindBy(xpath = "//a[text()='test 16 (0)']")
	private WebElement test16_Button;
	@FindBy(xpath = "//a[text()='test 17 (0)']")
	private WebElement test17_Button;
	@FindBy(xpath = "//a[text()='test 18 (0)']")
	private WebElement test18_Button;
	@FindBy(xpath = "//a[text()='test 19 (0)']")
	private WebElement test19_Button;
	@FindBy(xpath = "//a[text()='test 20 (0)']")
	private WebElement test20_Button;
	@FindBy(xpath = "//a[text()='test 21 (0)']")
	private WebElement test21_Button;
	@FindBy(xpath = "//a[text()='test 22 (0)']")
	private WebElement test22_Button;
	@FindBy(xpath = "//a[text()='test 23 (0)']")
	private WebElement test23_Button;
	@FindBy(xpath = "//a[text()='test 24 (0)']")
	private WebElement test24_Button;

	
	@FindBy(xpath = "//a[text()='Show All MP3 Players']")
	private WebElement mp3PlayersShowAllButton;

	public void clickOnmp3PlayersShowAllButton() {
		WebDriverUtility.clickOnElement(mp3PlayersShowAllButton);
	}
	
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

	
	


}
