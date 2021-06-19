package Project_Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice_LogIn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
		signInBtn.click();

		WebElement mailId = driver.findElement(By.name("email"));
		mailId.sendKeys("awsedrftgyhuji12@gmail.com");

		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("asdfgh123");

		WebElement submitBtn = driver.findElement(By.name("SubmitLogin"));
		submitBtn.click();
		Thread.sleep(2000);

		WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(womenTab).build().perform();

		WebElement eveDress = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		act.click(eveDress).build().perform();

		WebElement summerDress1 = driver.findElement(By.xpath("(//img[@alt='Printed Summer Dress'])[1]"));
		act.moveToElement(summerDress1).build().perform();
		Thread.sleep(2000);

		/*WebElement quickView = driver.findElement(By.xpath("(//a[@class='quick-view'])[1]"));
		act.click(quickView).build().perform();*/
		
		WebElement cart = driver.findElement(By.xpath("(//a[@title='Add to cart'])[1]"));
		act.click(cart).build().perform();
		

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//a[@class='btn btn-default button-plus product_quantity_up']")));
		 * WebElement addItem = driver .findElement(By.
		 * xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		 * addItem.click(); act.click(addItem).build().perform();
		 * 
		 * 
		 * WebElement dressColor = driver.findElement(By.xpath("//a[@title='Black']"));
		 * dressColor.click();
		 */
		/*
		 * WebElement addToCart =
		 * driver.findElement(By.xpath("//button[@name='Submit']")); addToCart.click();
		 */

		WebElement checkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkOut.click();

		WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		summary.click();

		WebElement message = driver.findElement(By.name("message"));
		message.sendKeys("Nice");

		WebElement delAdd = driver.findElement(By.name("processAddress"));
		delAdd.click();

		WebElement chkTerms = driver.findElement(By.name("cgv"));
		chkTerms.click();

		WebElement shipping = driver.findElement(By.name("processCarrier"));
		shipping.click();

		WebElement paymentMode = driver.findElement(By.xpath("//a[@class='bankwire']"));
		paymentMode.click();

		WebElement confirmOrder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmOrder.click();
	}
}