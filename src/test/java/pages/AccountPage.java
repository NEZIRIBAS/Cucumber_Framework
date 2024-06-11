package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
		
		public WebDriver driver;
		
		
		@FindBy(linkText = "Logout")
		private WebElement AccountPagelogoutLink;
		
		
		public AccountPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public boolean validateDisplayStatusOfLogoutLink() {
			boolean displayStatus = AccountPagelogoutLink.isDisplayed();
			return displayStatus;
		}
		
		public void clickOnLogoutLink() {
			AccountPagelogoutLink.click();
		}

		

	}
