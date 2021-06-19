package Project_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pom_Ex.Project2WithPom;

public class MiniProjectWithPom extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		// for POM
				
		Project2WithPom ref = new Project2WithPom(driver);
		
		sendKeys(ref.getEmail(), "arunRajendran@gmail.com");

		sendKeys(ref.getPassword(), "123456");
		click(ref.getLogin());	
		actions(ref.getWomen(), "moveToElement");
		actions(ref.getCasual(), "click");
		actions(ref.getImage(), "moveToElement");
		actions(ref.getQuickview(), "click");
		driver.switchTo().frame(ref.getFrame());
		actions(ref.getQty(), "click");
		dropdown(ref.getSelectsize(), "selectByValue", "2");
		actions(ref.getAddtocart(), "click");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		actions(ref.getProceedtocheckout(), "click");
		actions(ref.getProceedtocheckout2(), "click");
		sendKeys(ref.getComment(), "call me before delivery");
		actions(ref.getProceedtocheckout3(), "click");
		actions(ref.getTerms(), "click");
		actions(ref.getProceedtocheckout4(), "click");
		actions(ref.getPaybycheck(), "click");
		actions(ref.getConfirmmyorder(), "click");	
	}

}
