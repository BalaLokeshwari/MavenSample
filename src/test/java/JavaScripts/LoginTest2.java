package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/login");
		 // driver.findElement(By.id("username")).sendKeys("tomsmith"); 
		 // driver.findElement(By.name("username")).sendKeys("tomsmith"); 
		 // driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith"); 
		 // driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith"); 
		 // driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith"); 
		  driver.findElement(By.xpath("//input[@name='username' and @type='text']")).sendKeys("tomsmith"); 
		  //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!);"
				  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!"); 
				// driver.findElement(By.className("radius")).click();
				 // driver.findElement(By.tagName("button")).click(); driver.findElement(By.xpath("//button")).click(); 
				// driver.findElement(By.xpath("//button[@class='radius']")).click(); 
				// driver.findElement(By.linkText("Elemental Selenium")).click(); 
				// driver.findElement(By.partialLinkText("Elemental")).click();
	        

	}

}
