package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://automationbookstore.dev/");
	       String strName = driver.findElement(with(By.tagName("li"))
	    		   .toLeftOf(By.id("pid6"))
	    		   .below(By.id("pid1")))
	    		   .getText();
	       System.out.println(strName);

	}

}
