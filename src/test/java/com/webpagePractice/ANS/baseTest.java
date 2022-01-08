package com.webpagePractice.ANS;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class baseTest {
	public static WebDriver driver;
	
	@BeforeClass
	public static void intializeDriverProperties() {
		loadTestProperties();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();  

//        String username = "<your_lambdatest_username>";  
//        String accesskey = "<your_lambdatest_accesstoken>";  
//        String lambdaTestGridURL = "@hub.lambdatest.com/wd/hub";  

        capabilities.setCapability("build", "Selenium_Gherkin_Project");  
        capabilities.setCapability("name", "Placing order for a product");  
        capabilities.setCapability("platform", "Windows 10");  
        capabilities.setCapability("browserName", "chrome");  
        capabilities.setCapability("version", "73.0");  
        capabilities.setCapability("visual",false);    
        capabilities.setCapability("network",false);    
        capabilities.setCapability("console",false);    
        capabilities.setCapability("tunnel",false);  
         
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

	private static void loadTestProperties() {
		Properties properties = System.getProperties();
		try {
			properties.load(new FileInputStream(new File("resources/test.properties")));
			
		} catch ( Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
}
