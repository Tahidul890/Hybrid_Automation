package tohid.usa.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tohid.usa.basepage.Super_Class;
import tohid.usa.genericfunctions.CommonMethods;
import tohid.usa.genericfunctions.WaitHelper;





public class PageFactoryElements extends Super_Class{
	
	public PageFactoryElements() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign In")
	@CacheLookup
	private WebElement singInBtn;

	public WebElement getSingInBtn() {
		return singInBtn;
	}
	
	@FindBy(id = "email")
	@CacheLookup

	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	@FindBy(id = "pass")
	@CacheLookup

	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	@FindBy(xpath = "//button[@id='send2']")
	@CacheLookup

	private WebElement ClickOnSignBtn;

	public WebElement getClickOnSignBtn() {
		return ClickOnSignBtn;
	}

	@FindBy(linkText = "Men")
	@CacheLookup

	private WebElement SelectMenModule;

	public WebElement getSelectMenModule() {
		return SelectMenModule;
	}

	@FindBy(linkText = "Tops")
	@CacheLookup

	private WebElement SelectTopsFromMenModule;

	public WebElement getSelectTopsFromMenModule() {
		return SelectTopsFromMenModule;
	}

	@FindBy(linkText = "Jackets")
	@CacheLookup

	private WebElement SelectJacketFromMenModule;

	public WebElement getSelectJacketFromMenModule() {
		return SelectJacketFromMenModule;
	}

	@FindBy(linkText = "Jupiter All-Weather Trainer")
	@CacheLookup

	private WebElement SelectJupiterAll_WeatherTrainer;

	public WebElement getSelectJupiterAll_WeatherTrainer() {
		return SelectJupiterAll_WeatherTrainer;
	}
	
	@FindBy(xpath = "//div[@id='option-label-size-143-item-169']") // .. //div[@id='option-label-size-143-item-168'])[1]
	@CacheLookup
	private WebElement selectSize;

	public WebElement getSelectSize() {
		return selectSize;
	}
	@FindBy(xpath = "//*[@id='option-label-color-93-item-53']")
	@CacheLookup

	private WebElement SelectColor;

	public WebElement getSelectColor() {
		return SelectColor;
	}

	//
	@FindBy(xpath = "//*[@id='qty']")
	@CacheLookup

	private WebElement SelectQuantity;

	public WebElement getSelectQuantity() {
		return SelectQuantity;
	}//

	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	@CacheLookup

	private WebElement ClickOnAddtoCart;

	public WebElement getClickOnAddtoCart() {//
		return ClickOnAddtoCart;
	}
	
	@FindBy(linkText = "shopping cart")
	@CacheLookup

	private WebElement ClickShoppingCart;

	public WebElement getClickShoppingCart() {//
		return ClickShoppingCart;
	}

	@FindBy(xpath = "(//*[contains(text(),'Proceed to Checkout')])[2]")
	@CacheLookup

	private WebElement Proceed_to_Checkout;

	public WebElement getProceed_to_Checkout() {//
		return Proceed_to_Checkout;
	}
	
	//Add new address
	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup

	private WebElement clickNewAddress;

	public WebElement getclickNewAddress() {//
		return clickNewAddress;
	}
	
	//AddEmail
	@FindBy(id = "customer-email")
	@CacheLookup

	private WebElement enterEmail;

	public WebElement getenterEmail() {//
		return enterEmail;
	}
	
	//Enter first name
	@FindBy(xpath = "(//input[@class='input-text'])[6]")
	@CacheLookup

	private WebElement enterFirstName;

	public WebElement getenterFirstName() {//
		return enterFirstName;
	}
	
	//Enter last name
	@FindBy(xpath = "(//input[@class='input-text'])[7]")
	@CacheLookup

	private WebElement enterLastName;

	public WebElement getenterLastName() {//
		return enterLastName;
	}
	
	//Enter company name
	@FindBy(xpath = "(//input[@class='input-text'])[8]")
	@CacheLookup

	private WebElement enterCompanyName;

	public WebElement getenterCompanyName() {//
		return enterCompanyName;
	}
	
	//Enter street address
	@FindBy(xpath = "(//input[@class='input-text'])[9]")
	@CacheLookup

	private WebElement enterStreetName;

	public WebElement getenterStreetName() {//
		return enterStreetName;
	}
	
	//Enter city
	@FindBy(xpath = "(//input[@class='input-text'])[12]")
	@CacheLookup

	private WebElement enterCityName;

	public WebElement getenterCityName() {//
		return enterCityName;
	}
	
	//Select state
	@FindBy(xpath = "(//select[@class='select'])[1]")
	@CacheLookup

	private WebElement selectState;

	public WebElement getselectState() {//
		return selectState;
	}
	
	//Enter postal code
	@FindBy(xpath = "(//input[@class='input-text'])[14]")
	@CacheLookup

	private WebElement enterPostalCode;

	public WebElement getenterPostalCode() {//
		return enterPostalCode;
	}
	
	//Select Country
	@FindBy(xpath = "(//select[@class='select'])[2]")
	@CacheLookup

	private WebElement SelectCountry;

	public WebElement getSelectCountry() {//
		return SelectCountry;
	}
	
	//Enter Phone number
	@FindBy(xpath = "(//input[@class='input-text'])[15]")
	@CacheLookup

	private WebElement enterPhoneNumber;

	public WebElement getenterPhoneNumber() {//
		return enterPhoneNumber;
	}
	
	//shipping-save-in-address-book
	@FindBy(id = "shipping-save-in-address-book")
	@CacheLookup

	private WebElement clickOnSaveInAddressBook;

	public WebElement getclickOnSaveInAddressBook() {//
		return clickOnSaveInAddressBook;
	}
	//Click on Ship here
	@FindBy(xpath = "//*[contains(text(),'Ship here')]")
	@CacheLookup

	private WebElement clickOnShipHere;

	public WebElement getclickOnShipHere() {//
		return clickOnShipHere;
	}
	
	//Select Shipping Method
	@FindBy(xpath = "(//*[@name='ko_unique_1'])[1]")
	@CacheLookup

	private WebElement ShippingMethod;

	public WebElement getShippingMethod() {//
		return ShippingMethod;
	}
	
	@FindBy(xpath = "//*[text()='Next']")
	@CacheLookup

	private WebElement ClickOnNext;

	public WebElement getClickOnNext() {//
		return ClickOnNext;
	}
	
	@FindBy(xpath = "(//*[@type='checkbox'])[2]")
	@CacheLookup

	private WebElement ClickOnSameAsShippingAddress;

	public WebElement getClickOnSameAsShippingAddress() {//
		return ClickOnSameAsShippingAddress;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Place Order')]")
	@CacheLookup

	private WebElement ClickOnPlaceOrder;

	public WebElement getClickOnPlaceOrder() {//
		return ClickOnPlaceOrder;
	}
	
	@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
	@CacheLookup

	private WebElement VerifyOrderConf;

	public WebElement getVerifyOrderConf() {//
		return VerifyOrderConf;
	}
public void applicationLogin() {
	WaitHelper.seleniumWait(getSingInBtn());;
	CommonMethods.actionClick(getSingInBtn());;
	
	WaitHelper.seleniumWait(getEnterUserName());
	getEnterUserName().sendKeys(prop.getProperty("UserName"));	
	
	WaitHelper.seleniumWait(getEnterPassword());
	getEnterPassword().sendKeys(prop.getProperty("PassWord"));
	
	WaitHelper.seleniumWait(getClickOnSignBtn());
	CommonMethods.actionClick(getClickOnSignBtn());;
  }

public void AddNewAddress() {
	WaitHelper.seleniumWait(getclickNewAddress());
	CommonMethods.jsClick(getclickNewAddress());
	
	/*WaitHelper.seleniumWait(getenterEmail());
	getenterEmail().clear();
	getenterEmail().sendKeys("dummypractice.qa@gmail.com");*/
	
	WaitHelper.seleniumWait(getenterFirstName());
	getenterFirstName().clear();
	getenterFirstName().sendKeys("Tahidul");
	
	WaitHelper.seleniumWait(getenterLastName());
	getenterLastName().clear();
	getenterLastName().sendKeys("Haque");
	
	WaitHelper.seleniumWait(getenterCompanyName());
	getenterCompanyName().sendKeys("Arora");
	
	WaitHelper.seleniumWait(getenterStreetName());
	getenterStreetName().sendKeys("617 East 28 Street");
	
	WaitHelper.seleniumWait(getenterCityName());
	getenterCityName().sendKeys("Brooklyn");
	
	WaitHelper.seleniumWait(getselectState());
	CommonMethods.dropDownMenu(getselectState(), "New York");
	
	WaitHelper.seleniumWait(getenterPostalCode());
	getenterPostalCode().sendKeys("11218");
	
	WaitHelper.seleniumWait(getSelectCountry());
	CommonMethods.dropDownMenu(getSelectCountry(), "United States");
	
	WaitHelper.seleniumWait(getenterPhoneNumber());
	getenterPhoneNumber().sendKeys("1234567890");
	
	//WaitHelper.seleniumWait(getclickOnSaveInAddressBook());
	//CommonMethods.actionClick(getclickOnSaveInAddressBook());
	
	WaitHelper.seleniumWait(getclickOnShipHere());
	CommonMethods.actionClick(getclickOnShipHere());
	
	}

}
