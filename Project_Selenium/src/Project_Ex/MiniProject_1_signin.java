package Project_Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_1_signin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement email = driver.findElement(By.name("email_create"));
		email.sendKeys("arunRajendran@gmail.com");

		WebElement creatanaccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		creatanaccount.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement title = driver.findElement(By.name("id_gender"));
		title.click();

		WebElement firstname = driver.findElement(By.name("customer_firstname"));
		firstname.sendKeys("Arun");

		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("Rajendran");

		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("123456");

		WebElement days = driver.findElement(By.name("days"));
		Select s = new Select(days);
		s.selectByIndex(27);

		WebElement month = driver.findElement(By.name("months"));
		Select smonth = new Select(month);
		smonth.selectByValue("5");

		WebElement year = driver.findElement(By.name("years"));
		Select syear = new Select(year);
		syear.selectByValue("1992");

		WebElement tick = driver.findElement(By.id("newsletter"));
		tick.click();

		WebElement fname = driver.findElement(By.id("firstname"));
		fname.sendKeys("Arun");

		WebElement sname = driver.findElement(By.id("lastname"));
		sname.sendKeys("Rajendran");

		WebElement companyname = driver.findElement(By.id("company"));
		companyname.sendKeys("Amazon");

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("virugambakkam");

		WebElement address2 = driver.findElement(By.name("address2"));
		address2.sendKeys("Chennai");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.name("id_state"));
		Select Sstate = new Select(state);
		Sstate.selectByValue("32");

		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("12345");

		WebElement country = driver.findElement(By.name("id_country"));
		Select scountry = new Select(country);
		scountry.selectByValue("21");

		WebElement additionalinfo = driver.findElement(By.name("other"));
		additionalinfo.sendKeys("NIL");

		WebElement Homephone = driver.findElement(By.name("phone"));
		Homephone.sendKeys("76677667");

		WebElement mobilephone = driver.findElement(By.name("phone_mobile"));
		mobilephone.sendKeys("7667000000");

		WebElement alias = driver.findElement(By.name("alias"));
		alias.sendKeys("NIL");

		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register.click();

	}

}
