package testNgScripts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
//import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

//Run All
public class SampleTwoTest {
	
	@Test(alwaysRun = true, dependsOnMethods = {"SearchSeleniumTest"})
	//Run | Debug

	public void searchJavaTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");        
       WebElement searchBox = driver.findElement(By.name("q")); 
       // WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf .gsfi"));
        searchBox.sendKeys("Java Tutorial");
	        
			searchBox.submit();
	        Assert.assertEquals(driver.getTitle(), "Java Tutorial - W3Schools");
	}
	@Test
	//Run | Debug

	public void searchSeleniumTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");        
       WebElement searchBox = driver.findElement(By.name("q")); 
       // WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf .gsfi"));
        searchBox.sendKeys("Selenium Tutorial");
	        
			searchBox.submit();
	        Assert.assertEquals(driver.getTitle(), "Java Tutorial - W3Schools");
	}

}
