package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioChkBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	      // WebDriver driver = new ChromeDriver();
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html"); 
	        driver.findElement(By.xpath("//input[@type=\"radio\" and @value=''Female' and @name='gender']")).click();
	        
	        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	        WebElement chkbox =  driver.findElement(By.xpath("//input[@class='cb1-element'])[2]"));
	        System.out.println("Is Chkbox selected: " + chkbox.isSelected());
	        
	        chkbox.click();
	        
	        if(chkbox.isSelected())
	        	System.out.println("Chkbox is selected");
	}

}
