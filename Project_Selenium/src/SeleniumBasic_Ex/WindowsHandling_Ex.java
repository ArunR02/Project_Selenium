package SeleniumBasic_Ex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ButtonReleaseAction;

public class WindowsHandling_Ex {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));

		Actions ac = new Actions(driver);

		Robot r = new Robot();

		ac.contextClick(bestseller).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiletab = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));

		ac.contextClick(mobiletab).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement todaysdealtab = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));

		ac.contextClick(todaysdealtab);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String id : windowHandles) {			
			String title = driver.switchTo().window(id).getTitle();			
			System.out.println(title);
			
		}
		
		
	}

}
