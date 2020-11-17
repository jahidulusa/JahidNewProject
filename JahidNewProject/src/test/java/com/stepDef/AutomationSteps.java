package com.stepDef;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageFactory.AutomationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AutomationSteps {
	static WebDriver driver;
	static JavascriptExecutor js;
	static Actions action;
	static AutomationPage pf;
	static WebDriverWait wait;
	
	@Given("^user go to the automation practice homepage$")
	public void user_go_to_the_automation_practice_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		pf = PageFactory.initElements(driver, AutomationPage.class);
		wait= new WebDriverWait(driver, 20);
	   
	}

	@When("^user click on the log in button$")
	public void user_click_on_the_log_in_button() throws Throwable {
		pf.getLoginbutton().click();
	   
	}

	@When("^user enter valid email address and password$")
	public void user_enter_valid_email_address_and_password() throws Throwable {
		pf.getEmail().sendKeys("jahidul.usa@gmail.com");
		pf.getPassword().sendKeys("Welcome123");
	   
	}

	@When("^user click on the submit button$")
	public void user_click_on_the_submit_button() throws Throwable {
		pf.getSigninbutton().click();
	   
	}

	@When("^user verify the  website title as \"([^\"]*)\"$")
	public void user_verify_the_website_title_as(String arg1) throws Throwable {
		wait.until(ExpectedConditions.titleIs(driver.getTitle()));
		String title = driver.getTitle();
		System.out.println("This is the actual titleafter login: " + title);

		String expectedtitle = "My account - My Store";
		System.out.println("This is the expected title: " + expectedtitle);
		Assert.assertEquals(title, expectedtitle);
		if (title.equals(expectedtitle)) {
			System.out.println("Verified title: " + title);
		} else {
			System.out.println("Actual title doesn't match with expected title");
		}
	   
	}

	@Then("^user click on the dress button$")
	public void user_click_on_the_dress_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(pf.getDressbutton()));
		pf.getDressbutton().click();
	   
	}

	@Then("^user print all the prices values in decending order$")
	public void user_print_all_the_prices_values_in_decending_order() throws Throwable {
js.executeScript("window.scrollBy(0,900)");
		
		ArrayList<String> pricelist = new ArrayList<String>();
		wait.until(ExpectedConditions.visibilityOf(pf.getP1()));
		pricelist.add(pf.getP1().getText());
		pricelist.add(pf.getP2().getText());
		pricelist.add(pf.getP3().getText());
		pricelist.add(pf.getP4().getText());
		pricelist.add(pf.getP5().getText());

		for (String prices : pricelist) {

			System.out.println("Price values: " + (prices));
		}
		
		
		Collections.sort(pricelist, Collections.reverseOrder());
		for (String prices : pricelist) {
			System.out.println("Price Values in descending order: " + prices);
		} 
	   
	}

	@Then("^user select the second dress on that list$")
	public void user_select_the_second_dress_on_that_list() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf((pf.getRightblock())));
		action.moveToElement(pf.getRightblock()).perform();
		wait.until(ExpectedConditions.elementToBeClickable(pf.getAddtocart()));
		pf.getAddtocart().click();
		wait.until(ExpectedConditions.elementToBeClickable(pf.getProceedtocheckout()));
		pf.getProceedtocheckout().click();
	   
	}

	@Then("^user verify the total price with shipping$")
	public void user_verify_the_total_price_with_shipping() throws Throwable {
		js.executeScript("window.scrollBy(0, 450)");
		wait.until(ExpectedConditions.visibilityOf(pf.getProduct()));
		String productprice = pf.getProduct().getText();
		wait.until(ExpectedConditions.visibilityOf(pf.getShipping()));
		String shippingprice = pf.getShipping().getText();
		wait.until(ExpectedConditions.visibilityOf(pf.getTotal()));
		String totalprice = pf.getTotal().getText();

		System.out.println("Price of the product(s): " + productprice);
		System.out.println("Shipping cost: " + shippingprice);
		System.out.println("Total price with shipping: " + totalprice);

		String totalexpectedprice = "$52.99";
		System.out.println("Total expected price with shipping: " + totalexpectedprice);
		Assert.assertEquals("Price matched", totalexpectedprice, totalprice);
		if (totalprice.equals(totalexpectedprice)) {
			System.out.println("Verified: Total price with shipping matches expected price, which is  " + totalprice);

		} else {
			System.out.println("Verifed: total price with shipping doesn't match expected price");
		}
	   
	}

	@Then("^user logout and close the browser$")
	public void user_logout_and_close_the_browser() throws Throwable {
		js.executeScript("window.scrollTo(0, 0)");
		wait.until(ExpectedConditions.elementToBeClickable(pf.getLogout()));
		pf.getLogout().click();
		driver.close(); 
	   
	}

}
