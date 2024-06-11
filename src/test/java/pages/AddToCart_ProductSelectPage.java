package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_ProductSelectPage {

		public WebDriver driver;

		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]")
		private WebElement HPComputerButtonCart;

		public AddToCart_ProductSelectPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public AddtoCart_ProductDetailPage ProductSelect() {
			HPComputerButtonCart.click();
			return new AddtoCart_ProductDetailPage(driver);
		}

	}

