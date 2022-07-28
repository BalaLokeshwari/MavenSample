package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PackageInfoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");        
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java Tutorial");
        searchBox.sendKeys(Keys.ENTER);
        String pageTitle =  driver.getTitle();
        System.out.println("Page Title : " + pageTitle);
        
        System.out.println("current URL :" + driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Home Page Title :" + driver.getTitle());
        driver.navigate().forward();
	}

}
