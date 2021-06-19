package SeleniumBasic_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Ex {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("//a[text()='Casual Dresses']"));
		a.click(casual).build().perform();
	
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		a.moveToElement(image).build().perform();
		
		WebElement quickview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		a.click(quickview).build().perform();
		
		
	}
	
}
