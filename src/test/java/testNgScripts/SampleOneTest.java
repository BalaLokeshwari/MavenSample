package testNgScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.junit.Assert;
//import org.junit.Assertequals;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
//Run All

public class SampleOneTest {
	
	WebDriver driver;
	Properties prop;
	@BeforeMethod
	 public void setup()  {
		prop =  new Properties();
		String strPath = System.getProperty("user.dir") + "//src//test/resources//congigFiles//config.properties";
		FileInputStream fin;
		try {
			fin = new FileInputStream(strPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		//prop.load(fin);
		
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	 

	@Test
	//Run | Debug
	public void searchJavaTest() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	      
	        driver.get("https://www.google.com/");        
	     //  WebElement searchBox = driver.findElement(By.name("q")); 
	       WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf .gsfi"));
	        searchBox.sendKeys("Selenium Tutorial");
	        //searchBox.submit();
	        // Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google");
	}
	
	@DataProvider(name="loginData")
	public Object[][] getData() {
		
		String strPath = System.getProperty("user.div") + "//src//test/resources//testData//loginData.csv";
		return null;
	
	
	}
	
	
	
	        @AfterMethod
	        public void teardown() {
            driver.close();
	}

}
