package utils;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UITestUtils {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
		
		System.out.println("Contact page is opened");
		driver.findElement(By.xpath("//select[@name='id_contact']")).click();
//		Select dropDownOptions =new Select(driver.findElement(By.xpath("//select[@name='id_contact']")));
//		dropDownOptions.selectByValue("Customer service");
		
		driver.findElement(By.xpath("//input[@class='form-control grey validate']")).sendKeys("abc@xyz.com");
	
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Product is Awesome");
		
		//Take screenshot of page
		ScreenshotCapture scresnhot = new ScreenshotCapture();
		ScreenshotCapture.captureScreenShot(driver);
		
		// Closing the browser
		driver.close();
	}
}
