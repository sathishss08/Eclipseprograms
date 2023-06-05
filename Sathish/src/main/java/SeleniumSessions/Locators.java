package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//id unique locator
		
		
		driver.findElement(By.id("input-email")).sendKeys("sathish@gmail.com");
		
		
		
		
		
		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
		By password_xpath = By.xpath("//*[@id=\"input-password\"]");
		
       By telephone =By.cssSelector("#input-telephone");
		
		By confirmpassword =By.cssSelector("#input-confirm");
		
		By privacyPolicy_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		dosendkeys(fn_xpath, "Sathish");
		
		dosendkeys(ln_xpath, "kumar");
		
		dosendkeys(password_xpath, "test@123");
		
		dosendkeys(telephone, "9090990909090");
		
		dosendkeys(confirmpassword, "test@123");
		
		
		
		click(privacyPolicy_xpath);
		
		click(continue_xpath);
		
		
		
		
		
		
	}
		
		public static WebElement getElement(By locator)
		{
		return driver.findElement(locator);
		
		
		}
		
		public static void dosendkeys(By locator,String value) {
		
		getElement(locator).sendKeys(value);
		}
		
		public static void click(By locator) {
			
			getElement(locator).click();
		}
		
		
		
		
	}


