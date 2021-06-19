package SeleniumBasic_Ex;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Ex {

	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		

 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(3))
.ignoring(NoSuchElementException.class);

WebElement We = wait.until(new Function<WebDriver, WebElement>() {

	public WebElement apply(WebDriver refdriver) {
		return refdriver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	}
});
 
We.click();


Alert simplealert = driver.switchTo().alert();
simplealert.accept();

}
}