package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;

//By Login=By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement SignIn;
	@FindBy(id="email_create")
	WebElement EnterEmail;
	@FindBy(id="SubmitCreate")
	WebElement CreateAccount;
	@FindBy(id="id_gender1")
	WebElement Mr;
	@FindBy(id="id_gender2")
	WebElement Mrs;
	@FindBy(id="customer_firstname")
	WebElement CustomerFirstName;
	@FindBy(id="customer_lastname")
	WebElement CustomerLastName;
	@FindBy(id="firstname")
	WebElement FirstName;
	@FindBy(id="lastname")
	WebElement LastName;
	@FindBy(id="address1")
	WebElement Address;
	@FindBy(id="city")
	WebElement City;
	@FindBy(id="id_state")
	WebElement State;
	@FindBy(id="postcode")
	WebElement Zip;
	@FindBy(id="id_country")
	WebElement Country;
	@FindBy(id="phone_mobile")
	WebElement MobileNumber;
	@FindBy(id="alias")
	WebElement Alias;
	@FindBy(id="submitAccount")
	WebElement Register;	
	@FindBy(xpath="//*[@id='email']")
	WebElement Id;
	@FindBy(xpath="//*[@id='passwd']")
	WebElement Password;
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	WebElement SubmitLogin;
	@FindBy(xpath="//*[@id='center_column']/div[1]")
	WebElement Errormessage;
public SignInPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement SignIn() {
 return SignIn;
}
public WebElement Mr() {
	 return Mr;
	}
public WebElement Mrs() {
	 return Mrs;
	}
public WebElement CustomerFirstName() {
	 return CustomerFirstName;
	}
public WebElement CustomerLastName() {
	 return CustomerLastName;
	}
public WebElement FirstName() {
	 return FirstName;
	}
public WebElement LastName() {
	 return LastName;
	}
public WebElement Address() {
	 return Address;
	}
public WebElement Alias() {
	 return Alias;
	}
public WebElement Register() {
	 return Register;
	}
public WebElement State() {
	 return State;
	}
public WebElement Zip() {
	 return Zip;
	}
public WebElement Country() {
	 return Country;
	}
public WebElement MobileNumber() {
	 return MobileNumber;
	}
public WebElement City() {
	 return City;
	}
public WebElement CreateAccount() {
	 return CreateAccount;
	}
public WebElement EnterEmail() {
	 return EnterEmail;
	}
public WebElement Id() {
	 return Id;
	}
public WebElement Password() {
	 return Password;
	}
public WebElement SubmitLogin() {
	 return SubmitLogin;
	}
public WebElement Errormessage() {
	 return Errormessage;
	}
}
