package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	        //ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://the-internet.herokuapp.com/login");
	        driver.findElement(By.id("username")).sendKeys("tomsmith");
	        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	     //   driver.findElement(By.className("radius")).click();
	        
	        driver.findElement(By.tagName("button")).click();
	        
	      //  driver.findElement(By.linkText("Elemental Selenium")).click();
	        // driver.findElement(By.partialLinkText("Elemental")).click();
	        

	}

}
