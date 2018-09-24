package framgia;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Event_Keyboard {
	
	

	public static void main(String[] args) {
		String firstName = "Giang";
		String lastName = "Nguyen";
		String phone = "0123456789";
		String email = "tuikhongbiet@gmail.com";
		String address = "123 An Nhon";
		String city = "Da Nang";
		String state = "ST";
		String postalCode = "12345";
		String country = "ALBANIA";
		String userName = "zaza"+randomNumber();
		String password = "123456";
		String confirmPassword = "123456";
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Actions action = new Actions (driver);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement input_firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		action.sendKeys(input_firstName, firstName).perform();
	//	action.sendKeys(input_firstName, Keys.TAB).perform();
		WebElement input_lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		action.sendKeys(input_lastName, "test");
		action.sendKeys(Keys.chord(Keys.CONTROL, "a"),lastName);
		action.build().perform();
		WebElement input_phone = driver.findElement(By.xpath("//input[@name='phone']"));
		action.sendKeys(input_phone, phone);
		action.sendKeys(input_phone,Keys.BACK_SPACE);
		action.sendKeys(input_phone, "8");
		action.build().perform();
		WebElement input_email = driver.findElement(By.xpath("//input[@id='userName']"));
		action.sendKeys(input_email,email);
		action.build().perform();
		WebElement input_address = driver.findElement(By.xpath("//input[@name='address1']"));
		action.sendKeys(input_address,address);
		action.build().perform();
		WebElement input_city = driver.findElement(By.xpath("//input[@name='city']"));
		action.sendKeys(input_city,city);
		action.build().perform();
		WebElement input_state = driver.findElement(By.xpath("//input[@name='state']"));
		action.sendKeys(input_state,state);
		action.build().perform();
		WebElement input_postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		action.sendKeys(input_postalCode,postalCode);
		action.build().perform();
		
		WebElement input_userName = driver.findElement(By.xpath("//input[@id='email']"));
		action.sendKeys(input_userName,userName);
		action.build().perform();
		WebElement input_password = driver.findElement(By.xpath("//input[@name='password']"));
		action.sendKeys(input_password,password);
		action.build().perform();
		WebElement input_confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		action.sendKeys(input_confirmPassword,confirmPassword).sendKeys(input_confirmPassword, Keys.ENTER).build().perform();
		WebElement link_Login = driver.findElement(By.xpath("//a[@href='login.php']"));
		link_Login.click();
		WebElement input_userName_login = driver.findElement(By.xpath("//input[@name='userName']"));
		action.sendKeys(input_userName_login,userName).build().perform();
		WebElement input_password_login = driver.findElement(By.xpath("//input[@name='password']"));
		action.sendKeys(input_password_login,password).sendKeys(input_password_login, Keys.ENTER).build().perform();

		driver.close();

	}
	public static int randomNumber() {
		Random rand = new Random();
		return rand.nextInt(10000);
	}
}
