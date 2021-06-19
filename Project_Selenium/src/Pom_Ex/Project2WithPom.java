package Pom_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project2WithPom {

	
	public static WebDriver driver;

	public Project2WithPom(WebDriver driver) {
		this.driver = driver;
		//page factory
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(name="SubmitLogin")
	private WebElement login;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Casual Dresses']")
	private WebElement casual;
	
	@FindBy(xpath="//img[@alt='Printed Dress']")
	private WebElement image;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickview;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement qty;
	
	@FindBy(name="group_1")
	private WebElement selectsize;
	
	@FindBy(name="Submit")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedtocheckout2;
	
	@FindBy(name="message")
	private WebElement comment;
	
	@FindBy(name="processAddress")
	private WebElement proceedtocheckout3;
	
	@FindBy(name="cgv")
	private WebElement terms;
	
	@FindBy(name="processCarrier")
	private WebElement proceedtocheckout4;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement paybycheck;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmmyorder;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasual() {
		return casual;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSelectsize() {
		return selectsize;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public WebElement getProceedtocheckout2() {
		return proceedtocheckout2;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getProceedtocheckout3() {
		return proceedtocheckout3;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProceedtocheckout4() {
		return proceedtocheckout4;
	}

	public WebElement getPaybycheck() {
		return paybycheck;
	}

	public WebElement getConfirmmyorder() {
		return confirmmyorder;
	}


	
	
}
