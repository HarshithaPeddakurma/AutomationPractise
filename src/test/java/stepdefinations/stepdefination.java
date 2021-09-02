package stepdefinations;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.Checkout;
import PageObjects.MyAccount;
import PageObjects.SignInPage;
import PageObjects.SummerDresses;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import resources.Base;
import resources.RandomGenerator;

@RunWith(Cucumber.class)
public class stepdefination extends Base {
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	public static SignInPage a;
	public static MyAccount acc;
	public static Actions act;
	public static SummerDresses s;
	public static Checkout c;
	String Productname;
	String Colour;
	String[] parts;
	String Quantity;
	String CustomerFirstName;
	String CustomerLastName;
	String randomEmail;
	String Password;
	

	@Given("^Open Chrome and navigate to \"([^\"]*)\"$")
	public void open_chrome_and_navigate_to_something(String strArg1) throws Throwable {
		// Open the chrome browser and navigate to automation practise website
		driver = intializeDriver();
		driver.get(strArg1);
		Log.info("Login in to the jupiter toys application");
		//driver.manage().window().maximize();
	}

	@Given("^Enter the Valid Email address and password$")
	public void enter_the_valid_email_address_and_password() throws Throwable {
		// Entering the valid email address and password
		acc = new MyAccount(driver);
		acc.Signout().click();
		Thread.sleep(5000);
		a = new SignInPage(driver);
		a.SignIn().click();
		Log.info("Sucessfully clicked the SigIn Page");
		a.Id().sendKeys(randomEmail);
		Log.info("Sucessfully entered the Valid Id");
		a.Password().sendKeys(Password);
		Log.info("Sucessfully entered the valid password");
	}

	@Given("^Go to Dresses and click on the Summer dresses$")
	public void go_to_dresses_and_click_on_the_summer_dresses() throws Throwable {
		// goto dresses->Summerdresses
		act = new Actions(driver);
		act.moveToElement(acc.Dresses()).build().perform();
		acc.SummerDresses().click();
		Log.info("Sucessfully clicked on Summerdresses");
	}

	@Given("^Get the productname colour and quantity$")
	public void get_the_productname_colour_and_quantity() throws Throwable {
		// Get the productname,quantity,colour
		Thread.sleep(10000);
		s = new SummerDresses(driver);
		Productname = s.ProductName().getAttribute("innerText");
		System.out.println("Productname:" + Productname);
		this.Colour = s.Colour().getAttribute("innerText");
		parts = Colour.split(", ");
		System.out.println(parts[0]);
		this.Quantity = s.Quantity().getAttribute("innerText");
		System.out.println(Quantity);

	}

	@When("^Click on the SignIn and register a account$")
    public void click_on_the_signin_and_register_a_account() throws Throwable {
    	//Clicked on SignIn and Registered a account
    	a=new SignInPage(driver);
        a.SignIn().click();
        Log.info("Sucessfully clicked the SigIn Page");
        driver.manage().window().maximize();
        randomEmail = RandomGenerator.randomestring();
        System.out.println(randomEmail);
        a.EnterEmail().sendKeys(randomEmail);
        a.CreateAccount().click();
        WebElement element=null;
        if(RandomGenerator.selectOne()) {
        	element = a.Mr();
        }
        else {
        	element = a.Mrs();
        }
        element.click();
        a.CustomerFirstName().sendKeys("test");
        CustomerFirstName = a.CustomerFirstName().getAttribute("value");
        System.out.println(CustomerFirstName);
        a.CustomerLastName().sendKeys("user");
        CustomerLastName = a.CustomerLastName().getAttribute("value");
        System.out.println(CustomerLastName);
        a.Password().sendKeys("testuser");
        Password = a.Password().getAttribute("value");
        System.out.println(Password);
        a.Address().sendKeys("coconut rd");
        a.City().sendKeys("Melbourne");
        Select state= new Select(a.State());
        state.selectByIndex(new Random().nextInt(50));
        a.Zip().sendKeys("30000");
        Select Country= new Select(a.Country());
        Country.selectByValue("21");
        a.MobileNumber().sendKeys("0400000000");
        a.Alias().sendKeys("coconutroad");
        a.Register().click();
        Log.info("Sucessfully Registered the account");
        Thread.sleep(5000);
	}

	@When("^Click on the Submit Button$")
	public void click_on_the_submit_button() throws Throwable {
		// Click on submit button
		a.SubmitLogin().click();
		Log.info("Sucessfully clicked on Submit Button");
	}

	@When("^Click on Add to Cart$")
	public void click_on_add_to_cart() throws Throwable {
		// Click on Add cart
		s = new SummerDresses(driver);
		act.moveToElement(s.Instock()).build().perform();
		s.AddToCart().click();
		Log.info("Sucessfully clicked on Addtocart");

	}

	@When("^Click on Proceed to CheckOut$")
	public void click_on_proceed_to_checkout() throws Throwable {
		// Click on proceed to checkout
		s.ProceedToCheckOut().click();
		Log.info("Sucessfully clicked on Proceedtocheckout");
		Thread.sleep(5000);
		c=new Checkout(driver);
		c.ProceedToCheckout().click();
		c.AddressCheckout().click();
		c.AcceptTerms().click();
		c.ShippingCheckout().click();
	}

	@Then("^Check Name and Surname are correct after register$")
	public void check_name_and_surname_are_correct_after_register() throws Throwable {
		// Checking if error message is displayed
		acc = new MyAccount(driver);
		String Text = acc.AccountName().getText();
		if (Text.equalsIgnoreCase(CustomerFirstName+" "+CustomerLastName)) {
	        System.out.println("Correct name and surname are displayed");
			Log.info("Correct name and surname are displayed");
		}
	}

	@Then("^User should be able to login into the automation practise website$")
	public void user_should_be_able_to_login_into_the_automation_practise_website() throws Throwable {
		// LogIn to the Account
		acc = new MyAccount(driver);
		Assert.assertTrue(acc.MyAccount().isDisplayed());
		Log.info("Sucessfully LogIn to the account");
	}

	@Then("^Validate that product is successfully added to the cart$")
	public void validate_that_product_is_successfully_added_to_the_cart() throws Throwable {
		// check product is present in the cart
		s = new SummerDresses(driver);
		String successmessage= s.SuccessAddToCart().getAttribute("innerText");
		System.out.println(successmessage);
		Assert.assertTrue(successmessage.contains("Product successfully added to your shopping cart"));
		Log.info("Sucessfully Added to the Cart");
	}

	@Then("^Validate whether same productname colour and quantity are displayed in the Cart$")
	public void validate_whether_same_productname_colour_and_quantity_are_displayed_in_the_cart() throws Throwable {
		// Validate productname, colour and quantity in the cart are same as while
		// adding
		Thread.sleep(5000);
		String CartProductName = s.CartProductName().getText();
		System.out.println(CartProductName);
		Assert.assertTrue(CartProductName.equalsIgnoreCase(Productname));
		Log.info("Same product name is displayed in the cart");
		String CartColour = s.Cartcolour().getAttribute("innerText");
		Assert.assertTrue(CartColour.contains(parts[0]));
		Log.info("Same colour is displayed in the cart");
		String Cartquantity = s.Cartquantity().getAttribute("innerText");
		System.out.println(Cartquantity);
		Assert.assertTrue(Cartquantity.equalsIgnoreCase(Quantity));
		driver.close();
		driver = null;
	}
}