package file_step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Driver_Factory.code;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddToCart_ProductSelectPage;
import pages.HomePage;

public class addtocart_stepdef {
	public WebDriver driver;

	@Before
	public void registerSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	public class AddToCart {

		public WebDriver driver;
		
		@Given("User navigates to add to product page")
		public void User_navigates_to_add_to_product_page() {
			 driver =code.getDriver();
			 
		}
		@When("User clicks on add to cart button to navigate product page")
		public void  User_clicks_on_add_to_cart_button() {
			HomePage homepage = new HomePage(driver);
			homepage.ClickOnLaptopNotebook();
		}
		@And("User clicks on add to cart")
		public void  User_clicks_on_add_to_cart() {
			AddToCart_ProductSelectPage productselect = new AddToCart_ProductSelectPage(driver);
			productselect.ProductSelect();
		}
		
	}
}
