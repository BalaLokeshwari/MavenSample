package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
	       String strSalary = driver.findElement(By.xpath("td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).getText();
	    		   
System.out.println("Salary : " + strSalary);
	}

}
