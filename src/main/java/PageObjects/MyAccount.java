package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	WebDriver driver;

//By Login=By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	@FindBy(xpath="//*[@class='account']/span")
	WebElement AccountName;
	@FindBy(className ="logout")
	WebElement Signout;
	@FindBy(xpath="//*[@id='center_column']/h1")
	WebElement MyAccount;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement Dresses;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	WebElement SummerDresses;
	
	
public MyAccount(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//driver.findElements(By.className(className))
}

public WebElement AccountName() {
	 return AccountName;
	}
public WebElement Signout() {
	 return Signout;
	}
public WebElement MyAccount() {
 return MyAccount;
}
public WebElement Dresses() {
	 return Dresses;
	}
public WebElement SummerDresses() {
	 return SummerDresses;
	}

}

