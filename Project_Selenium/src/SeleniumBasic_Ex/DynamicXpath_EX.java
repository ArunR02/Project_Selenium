package SeleniumBasic_Ex;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class DynamicXpath_EX {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		
		driver.manage().window().maximize();
	
	List<WebElement> strikeitems = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		
	System.out.println("size : " +strikeitems.size());
	
	List<Integer> L_Price = new ArrayList<>();
	for (WebElement we_strikeitems : strikeitems) {
		
		String price = we_strikeitems.getText().replace("Rs. ", "");
		int intprice = Integer.parseInt(price);
		L_Price.add(intprice);
	}	
	
	System.out.println(L_Price);
	Integer minvalue = java.util.Collections.min(L_Price);
	System.out.println("minimum value :" + minvalue);
	
	}

}