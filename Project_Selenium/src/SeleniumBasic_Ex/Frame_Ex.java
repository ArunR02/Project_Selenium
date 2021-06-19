package SeleniumBasic_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Ex {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
		
	WebElement iframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	
	iframe.click();
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	
	driver.switchTo().frame(outerframe);
	
	Thread.sleep(3000);
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	
	driver.switchTo().frame(innerframe);
	Thread.sleep(3000);
	
	WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])"));
	
	textbox.sendKeys("Hi Arun Here");
	
	 driver.switchTo().defaultContent(); 
	
	WebElement singleiframe = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
	
	singleiframe.click();
	
	}
		
}
