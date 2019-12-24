package cstudy1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case1 {
	
	WebDriver driver;
	
	@Given("application is launched")
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver =  (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	
	@Given("testme app website is launched")
	public void testme_app_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("user clicks on signup btn")
	public void user_clicks_on_signup_btn() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enter proper data")
	public void user_enter_proper_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("saavi7");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("saavi");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("borkar");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("saavi@123");
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("saavi@123");
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("saavi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("1234567891");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("08/03/1997");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("pune");
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("gondia");
		//driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("clicks on register btn")
	public void clicks_on_register_btn() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	//----------------------CASESTUDY2---------------------------------------------------------------//
	@Given("Registered user clicks on Signin link")
	public void registered_user_clicks_on_Signin_link() {
	    //Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
	}

	@Given("he provides valid  username{string}")
	public void he_provides_valid_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string1);
	}

	@Given("he provides valid password for login{string}")
	public void he_provides_valid_password_for_login(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
	}

	@When("clicks on login btn for the login validation")
	public void clicks_on_login_btn_for_the_login_validation() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	//-----------------------------------------CASESTUDY3-------------------------------------------------------//
	
	@Given("user searches for item")
	public void user_searches_for_item() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("saavi1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("saavi@123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	}
      //Actions act= new Actions(driver);
	@Given("types the item name on search tab")
	public void types_the_item_name_on_search_tab() throws InterruptedException {
		 Actions act= new Actions(driver);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		act.moveToElement(searchbox).click();
		act.sendKeys("h").pause(1000).sendKeys("e").pause(1000).sendKeys("a").pause(1000).sendKeys("d").pause(1000).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
	}

	@When("user clicks on search tab")
	public void user_clicks_on_search_tab() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();//*[@id="myInputautocomplete-list"]/div
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("page with item information is displayed")
	public void page_with_item_information_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//String a=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText();
		//Assert.assertEquals("Cart 1", a);
	}

//----------------------------------------------CASESTUDY4------------------------------------------------------------//
	
	


}
