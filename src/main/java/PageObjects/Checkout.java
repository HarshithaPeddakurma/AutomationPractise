package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	WebDriver driver;

	//By Login=By("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
		@FindBy(xpath="//*[@id='center_column']/p[2]/a[1]/span")
		WebElement ProceedToCheckout;
		@FindBy(xpath="//*[@id='center_column']/form/p/button/span")
		WebElement AddressCheckout;
		@FindBy(xpath="//*[@type='checkbox']")
		WebElement AcceptTerms;
		@FindBy(xpath="//*[@id='form']/p/button/span")
		WebElement ShippingCheckout;
		
	public Checkout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//driver.findElements(By.className(className))
	}
	public WebElement ProceedToCheckout() {
		 return ProceedToCheckout;
		}
	public WebElement AddressCheckout() {
		 return AddressCheckout;
		}
	public WebElement AcceptTerms() {
		 return AcceptTerms;
		}
	public WebElement ShippingCheckout() {
		 return ShippingCheckout;
		}
		
}
