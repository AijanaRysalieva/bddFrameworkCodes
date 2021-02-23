package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RatailPageObject_Footer extends Base {
	
	public RatailPageObject_Footer() {

		PageFactory.initElements(driver, this);

	}
	
	
	//Footer Information
	@FindBy(xpath="//h5[text()='Information']")
	private WebElement informationFooter;
	@FindBy(xpath="//a[text()='About Us']")
	private WebElement aboutUsFooter;
	@FindBy(xpath="//a[text()='Delivery Information']")
	private WebElement deliveryInformationFooter;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	private WebElement privacyPolicy;
	@FindBy(xpath="//a[text()='ITerms & Conditions']")
	private WebElement terms_Conditions;
	
	//Footer Customer Service
	@FindBy(xpath="//h5[text()='Customer Service']")
	private WebElement customer_Service;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contact_Us;
	@FindBy(xpath="//a[text()='Returns']")
	private WebElement returns;
	@FindBy(xpath="//a[text()='Site Map']")
	private WebElement site_Map;
	
	//Footer Extras
	@FindBy(xpath="//h5[text()='Extras']")
	private WebElement extrasFooter;
	@FindBy(xpath="//a[text()='Brands']")
	private WebElement brandsFooter;
	@FindBy(xpath="//a[text()='Gift Certificates']")
	private WebElement gift_Certificates;
	@FindBy(xpath="//a[text()='Affiliate']")
	private WebElement affiliate;
	@FindBy(xpath="//a[text()='Specials']")
	private WebElement specials;
	
	
	
	
	//Footer My Account
	@FindBy(xpath="//h5[text()='My Account']")
	private WebElement my_Account_title;
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement my_Account;
	@FindBy(xpath="//a[text()='Order History']")
	private WebElement order_History;
	@FindBy(xpath="//a[text()='Wish List']")
	private WebElement wish_List;
	@FindBy(xpath="//a[text()='Newsletter']")
	private WebElement newsletter;
	
	
}
