package Konnectify_event_logs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;

	public Login_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = ":R2mjttnpja:-form-item")
	WebElement Email;
	@FindBy(id = ":R4mjttnpja:-form-item")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	@FindBy(xpath = "//div[text()='All Konnectors']")
	WebElement dashbordpage;
	@FindBy(xpath = "//div//a[2]//div[@class='text-white']")
	WebElement clickeventlogs;
	
	@FindBy(xpath = "//div[text()='Today']")
	WebElement ClickToday;
	@FindBy(xpath = "//div//button[@aria-controls='radix-:rn:']")
	WebElement konnectorfilter;
	
	
	public void Email(CharSequence enteremail) {
		// TODO Auto-generated method stub
		Email.sendKeys(enteremail);
	}
	
	public void password(CharSequence enterpwd) {
		// TODO Auto-generated method stub
		password.sendKeys(enterpwd);
	}
	public void clLogin() {
		// TODO Auto-generated method stub
		Login.click();
	}
	
	public void dashbordpage() {
		// TODO Auto-generated method stub
		dashbordpage.isDisplayed();
		String expected="All Konnectors";
		String Actual = dashbordpage.getText();
		System.out.println(dashbordpage.getText());
		assertEquals(Actual, expected);
	}
	
	
	
	public void clickeventlog() {
		// TODO Auto-generated method stub
		clickeventlogs.click();
	}
	
	
	public void ClickToday() {
		// TODO Auto-generated method stub
		ClickToday.click();
	}
	
	public void konnectorfilter() {
		// TODO Auto-generated method stub
		konnectorfilter.click();
	}
	@FindBy(id = "combo-box-demo")
	WebElement konnectorfiltersearchbar;
	
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement Applyfilter;
	
	
	public void konnectorfiltersearchbar(CharSequence konnectorname) {
		// TODO Auto-generated method stub
		konnectorfiltersearchbar.sendKeys(konnectorname);
	}
	
	public void Applyfilter() {
		// TODO Auto-generated method stub
		Applyfilter.click();
	}
	
	
	
	
	
	
	
	
	
}
