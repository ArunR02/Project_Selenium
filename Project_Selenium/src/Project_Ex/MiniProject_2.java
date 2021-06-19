package Project_Ex;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.deploy.uitoolkit.impl.fx.Utils;

public class MiniProject_2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("arunRajendran@gmail.com");

		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("123456");

		WebElement login = driver.findElement(By.name("SubmitLogin"));
		login.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();

		WebElement casual = driver.findElement(By.xpath("//a[text()='Casual Dresses']"));
		a.click(casual).build().perform();

		WebElement image = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		a.moveToElement(image).build().perform();

		WebElement quickview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		a.click(quickview).build().perform();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);

		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qty.click();

		WebElement selectsize = driver.findElement(By.name("group_1"));
		Select s = new Select(selectsize);
		s.selectByValue("2");

		WebElement addtocart = driver.findElement(By.name("Submit"));
		addtocart.click();

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		a.click(proceedtocheckout).build().perform();

		WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		a.click(proceedtocheckout2).build().perform();

		WebElement comment = driver.findElement(By.name("message"));
		comment.sendKeys("call me before delivery");

		WebElement proceedtocheckout3 = driver.findElement(By.name("processAddress"));
		a.click(proceedtocheckout3).build().perform();

		WebElement terms = driver.findElement(By.name("cgv"));
		a.click(terms).build().perform();

		WebElement proceedtocheckout4 = driver.findElement(By.name("processCarrier"));
		a.click(proceedtocheckout4).build().perform();

		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		a.click(paybycheck).build().perform();

		WebElement confirmmyorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		a.click(confirmmyorder).build().perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		Thread.sleep(2000);

		TakesScreenshot sshot = (TakesScreenshot) driver;
		File source = sshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\miniproject2_order_placed.png");
		FileUtils.copyFile(source, destination);

	}

}
