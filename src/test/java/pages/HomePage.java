package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropDown;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[1]/span")
	private WebElement addToCartButton;
	
		@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
		private WebElement MenuLaptopsNotebooks;

		@FindBy(xpath = "//a[text()='Show AllLaptops & Notebooks']")
		private WebElement ShowAllLaptopsNotebooks;

		@FindBy(xpath = "//div[@class='button-group']/button[1]")
		private WebElement ProductPage_button_cart;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMyAccount() {
		myAccountDropDown.click();
	}

	public LoginPage selectLoginOption() {
		loginOption.click();
		return new LoginPage(driver);
	}
	
	public void selectRegisterOption() {
		registerOption.click();
	}
	
	public AddToCart_ProductSelectPage ClickOnLaptopNotebook() {
		MenuLaptopsNotebooks.click();
		ShowAllLaptopsNotebooks.click();
		return new AddToCart_ProductSelectPage(driver);
	}
	
}

