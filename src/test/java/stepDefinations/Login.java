package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
   
	WebDriver driver; 
	WebElement user;
	WebElement pass;
	

	@And("Enter The Url")
	public void userEnterUrl() {
		//System.out.println("Enter the url");
		driver.get("https://practice.expandtesting.com/login");
	}

	@When("User Enter the valid username and password")
	public void enterUserPass() {
     //  System.out.println("user enter valid username and password ");
		/** Find the WebElement Username Password*/
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("practice");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
		
	}
	
	@Then("user should be redirected to th logout page")
	public void verifyLogoutPage()
	{
		Assert.assertEquals("Test Automation Practice: Working with Secure Page",driver.getTitle());
	}
	
	@And("cliks on the login")
	public void clickOnLogin()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Given("Open the Chrome Browser")
	public void openChrome() {
		//System.out.println("Chrome is getting opened");
		driver=new ChromeDriver();
	}
	
	@Then("close the chromeBrowser")
	public void tearDown()
	{
		driver.close();
	}
	
	
	@And("Enter The Url {string}")
	 public void entersTheURl(String url)
	 {
		 driver.get(url);
	 }
	
	@When("User Enter the valid username {string} and password {string}")
	public void user_enter_the_valid_username_and_password(String user, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	}

	@Then("user should be redirected to login page with title {string}")
	public void user_should_be_redirected_to_login_page_with_title(String title) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(title,driver.getTitle());
	}
	
	
	//***************************Register ******************************************//
	
	@And("user gives input as male")
	public void inputMale()
	{
		driver.findElement(By.xpath("//input[@value='M']")).click();
	}
	
	@And("user enters the first name {string}")
	 public void enterFirstName(String name)
	 {
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(name);
	 }
	
	@Given("user enters the last name {string}")
	public void user_enters_the_last_name(String lastName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
	}

	@Then("click on Register")
	public void click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
	}
  




}
