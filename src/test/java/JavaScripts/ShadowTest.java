package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balal\\Downloads\\LokiSelenium\\webdrivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	        //ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to("http://watir.com/examples/shadow_dom.html");  
	        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
	        SearchContext shadowRoot = shadowHost.getShadowRoot();
	        String strProperty = shadowRoot.findElement(By.id("#shadow_content")).getDomProperty("namespaceURI");
            System.out.println("Dom Property : " + strProperty);
	}

}
