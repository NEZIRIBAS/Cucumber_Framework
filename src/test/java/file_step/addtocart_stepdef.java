package file_step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

	  @Given ("user on the product page for a cameras")
	  public void user_on_the_product_page_for_a_laptop () {
		  driver.findElement(By.xpath("//input[@type='text']")).click();
	  }

	  @And("user selects the items")
	  public void user_selects_the_items () {
		  Assert.assertTrue(driver.findElement(By.linkText("Nikon D300")).isDisplayed());
		  
	  }
	  
	  @When("user clicks the add to cart button")
	  public void user_clicks_the_add_to_cart_button () {
		  driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	  }
	  
	  @Then("user should see a notification that says cameras added to cart")
	  public void user_should_see_a_notification_that_says_laptop_added_to_cart () {
		  driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		  
	  }

}
