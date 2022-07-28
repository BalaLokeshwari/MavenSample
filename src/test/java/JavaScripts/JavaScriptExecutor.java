package JavaScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	        //ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to("http://demo.automationtesting.in/Datepicker.html"); 
	        js.executeScript("document.querySelector(#datepicker1).value='07/22/2022'");
	}

}
