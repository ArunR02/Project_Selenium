package SeleniumBasic_Ex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Alert_Ex {

	private static Alert alert;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		simple.click();
		
		
		Alert simplealert = driver.switchTo().alert();
		
		
		simplealert.accept();
	
	 WebElement confirmalert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirmalert.click();
		
		WebElement clicktab = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	 clicktab.click();
		
	 
	 Alert alert2 = driver.switchTo().alert();
	 
	 alert2.accept();
	
	 WebElement altwithtext = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	 
	 altwithtext.click();
	 
	 WebElement clickalert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	 clickalert.click();
	 
	 Alert alert3 = driver.switchTo().alert();
	String text = alert3.getText();
	
	System.out.println(text);
	 
	 /*
		 * alert3.sendKeys("Hi Arun Here"); 
		 * alert3.accept();
		 */
	 
	}
	
}
