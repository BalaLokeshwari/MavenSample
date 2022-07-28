package JavaScripts;

import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");        
       WebElement searchBox = driver.findElement(By.name("q")); 
       
       searchBox.sendKeys("flipkart");
        //System.out.println("Search box attr : " + searchBox.getAttribute("role"));
        //Thread.sleep(2000);
        
       // List<WebElement> items = driver.findElements(By.xpath("//ul[@class='G433f7e']//li//descendant::div[@class='wM6W7d']"));
     // System.out.println("Number of items: " +items.size());    
     // for(i=0;i,items.size();i++)
      
      
searchBox.sendKeys(Keys.ENTER);
        //String pageTitle =  driver.getTitle();
        //System.out.println("Page Title : " + pageTitle);
        
        //System.out.println("current URL :" + driver.getCurrentUrl());
        //driver.navigate().back();
        //System.out.println("Home Page Title :" + driver.getTitle());
        //driver.navigate().forward();
	}

}
