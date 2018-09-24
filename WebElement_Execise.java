package framgia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Execise {
	
	

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
		String userName = "zaza3";
		String password = "123456";
		String confirmPassword = "123456";
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement input_firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		input_firstName.sendKeys(firstName);
		WebElement input_lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		input_lastName.sendKeys(lastName);
		WebElement input_phone = driver.findElement(By.xpath("//input[@name='phone']"));
		input_phone.sendKeys(phone);
		WebElement input_email = driver.findElement(By.xpath("//input[@id='userName']"));
		input_email.sendKeys(email);
		WebElement input_address = driver.findElement(By.xpath("//input[@name='address1']"));
		input_address.sendKeys(address);
		WebElement input_city = driver.findElement(By.xpath("//input[@name='city']"));
		input_city.sendKeys(city);
		WebElement input_state = driver.findElement(By.xpath("//input[@name='state']"));
		input_state.sendKeys(state);
		WebElement input_postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		input_postalCode.sendKeys(postalCode);
		
		WebElement input_userName = driver.findElement(By.xpath("//input[@id='email']"));
		input_userName.sendKeys(userName);
		WebElement input_password = driver.findElement(By.xpath("//input[@name='password']"));
		input_password.sendKeys(password);
		WebElement input_confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		input_confirmPassword.sendKeys(confirmPassword);
		WebElement button_Submit = driver.findElement(By.xpath("//*[@name='submit']"));
		button_Submit.click();
		WebElement link_Login = driver.findElement(By.xpath("//a[@href='login.php']"));
		link_Login.click();
		WebElement input_userName_login = driver.findElement(By.xpath("//input[@name='userName']"));
		input_userName_login.sendKeys(userName);
		WebElement input_password_login = driver.findElement(By.xpath("//input[@name='password']"));
		input_password_login.sendKeys(password);
		WebElement button_Submit_login = driver.findElement(By.xpath("//*[@name='submit']"));
		button_Submit_login.click();
		//driver.close();

	}

}
