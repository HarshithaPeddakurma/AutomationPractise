package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDresses {
	WebDriver driver;

//By Login=By("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/span/span")
	WebElement Instock;
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCart;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2[1]")
	WebElement SuccessAddToCart;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2")
	WebElement AddedToCart;
	@FindBy(xpath="//*[@id='layer_cart_product_title']")
	WebElement ProductName;
	@FindBy(xpath="//*[@id='layer_cart_product_attributes']")
	WebElement Colour;
	@FindBy(xpath="//*[@id='layer_cart_product_quantity']")
	WebElement Quantity;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement ProceedToCheckOut;
	@FindBy(xpath="//tbody/tr/td[2]/p/a")
	WebElement CartProductName;
	@FindBy(xpath="//*[@class='cart_description']/small[2]/a")
	WebElement Cartcolour;
	@FindBy(css=".cart_quantity.text-center")
	WebElement Cartquantity;
	
	
public SummerDresses(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//driver.findElements(By.className(className))
}
public WebElement Instock() {
	 return Instock;
	}
public WebElement AddToCart() {
 return AddToCart;
}
public WebElement SuccessAddToCart() {
	 return SuccessAddToCart;
	}
public WebElement AddedToCart() {
	 return AddedToCart;
	}
public WebElement ProductName() {
	 return ProductName;
	}
public WebElement Colour() {
	 return Colour;
	}
public WebElement Quantity() {
	 return Quantity;
	}
public WebElement ProceedToCheckOut() {
	 return ProceedToCheckOut;
	}
public WebElement CartProductName() {
	 return CartProductName;
	}
public WebElement Cartcolour() {
	 return Cartcolour;
	}
public WebElement Cartquantity() {
	 return Cartquantity;
	}
}

