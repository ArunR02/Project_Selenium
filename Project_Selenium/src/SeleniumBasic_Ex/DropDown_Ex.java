package SeleniumBasic_Ex;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dropdown = driver.findElement(By.id("select-demo"));
		Select s = new Select(dropdown);
		s.selectByValue("Tuesday");
		WebElement states = driver.findElement(By.name("States"));
		Select s1 = new Select(states);
		/*
		 * boolean checkmultiple = s1.isMultiple(); System.out.println(checkmultiple);
		 */
		
		  List<WebElement> options = s1.getOptions();
		  int size = options.size(); System.out.println("options size :" + size);
		 
		/*
		 * s1.selectByIndex(2); s1.selectByIndex(3); s1.selectByIndex(5);
		 */
		
		/*
		 * for (WebElement alloptions : options) {
		 * String text = alloptions.getText(); System.out.println(text);
		 * }
		 */
		/*
		 * for (int i = 0; i < 8; i++) { if (i == 2 || i == 3 || i == 5) {
		 * s1.selectByIndex(i); } }
		 */
		
		for (WebElement alloptions : options) {
			
			String text = alloptions.getText();
			
			if (text.equals("California") || text.equals("New Jersey") || text.equals("Ohio") ) {
				
				s1.selectByValue(text);
				
				
			}
		
		
		}
	}

}
