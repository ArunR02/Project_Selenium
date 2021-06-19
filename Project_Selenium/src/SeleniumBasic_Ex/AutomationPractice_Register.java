package SeleniumBasic_Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice_Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();		
		driver.get("http://automationpractice.com/index.php");		
		driver.manage().window().maximize();
		
		WebElement signInBtn=driver.findElement(By.xpath("//a[@class='login']"));
		signInBtn.click();
		
		WebElement mailId = driver.findElement(By.name("email_create"));
		mailId.sendKeys("awsedrftgyhuji12@gmail.com");
		
		WebElement createAccBtn = driver.findElement(By.name("SubmitCreate"));
		createAccBtn.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement titleRadioBtn = driver.findElement(By.id("id_gender2"));
		titleRadioBtn.click();
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Priyanka");
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("Panneer Selvam");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("asdfgh123");
		
		WebElement dayDOB = driver.findElement(By.id("days"));
		Select s=new Select(dayDOB);
		s.selectByValue("11");
		
		WebElement monthDOB = driver.findElement(By.name("months"));
		Select s1=new Select(monthDOB);
		s1.selectByValue("10");
		
		WebElement yearDOB = driver.findElement(By.name("years"));
		Select s2=new Select(yearDOB);
		s2.selectByValue("1995");
		
		WebElement newsletterChk = driver.findElement(By.id("newsletter"));
		newsletterChk.click();
		
		WebElement offerChk = driver.findElement(By.id("optin"));
		offerChk.click();
		
		WebElement addFName = driver.findElement(By.id("firstname"));
		addFName.sendKeys("Priyanka");
		
		WebElement addLName = driver.findElement(By.id("lastname"));
		addLName.sendKeys("Panneer Selvam");
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Infosys");
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("address line 1");
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("address line 2");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select states=new Select(state);
		states.selectByVisibleText("Florida");
		
		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("12345");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select c=new Select(country);
		c.selectByValue("21");
		
		WebElement addInfo = driver.findElement(By.name("other"));
		addInfo.sendKeys("nil");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("044123456");
		
		WebElement phonemob = driver.findElement(By.name("phone_mobile"));
		phonemob.sendKeys("+919677233741");
		
		WebElement alias = driver.findElement(By.name("alias"));
		alias.sendKeys("zsxdcf@gmail.com");
		
		WebElement submit = driver.findElement(By.name("submitAccount"));
		submit.click();
	}

}