package Project_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject2WithBaseClass extends BaseClass  {
		
	public static void main(String[] args) throws InterruptedException {
	
		browserLaunch("chrome");
		get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement email = driver.findElement(By.name("email"));
		sendKeys(email, "arunRajendran@gmail.com");

		WebElement password = driver.findElement(By.name("passwd"));
		sendKeys(password, "123456");

		WebElement login = driver.findElement(By.name("SubmitLogin"));
		click(login);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		actions(women, "moveToElement");
		
		WebElement casual = driver.findElement(By.xpath("//a[text()='Casual Dresses']"));
		actions(casual, "click");

		WebElement image = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		actions(image, "moveToElement");

		WebElement quickview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		actions(quickview, "click");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);

		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		actions(qty, "click");

		WebElement selectsize = driver.findElement(By.name("group_1"));
		dropdown(selectsize, "selectByValue", "2");

		WebElement addtocart = driver.findElement(By.name("Submit"));
		actions(addtocart, "click");

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		actions(proceedtocheckout, "click");

		WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		actions(proceedtocheckout2, "click");

		WebElement comment = driver.findElement(By.name("message"));
		sendKeys(comment, "call me before delivery");

		WebElement proceedtocheckout3 = driver.findElement(By.name("processAddress"));
		actions(proceedtocheckout3, "click");

		WebElement terms = driver.findElement(By.name("cgv"));
		actions(terms, "click");

		WebElement proceedtocheckout4 = driver.findElement(By.name("processCarrier"));
		actions(proceedtocheckout4, "click");

		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		actions(paybycheck, "click");

		WebElement confirmmyorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		actions(confirmmyorder, "click");
		
	}

}