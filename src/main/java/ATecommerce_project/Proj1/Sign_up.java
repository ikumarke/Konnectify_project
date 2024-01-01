package ATecommerce_project.Proj1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_up {
	public WebDriver driver;

	public Sign_up(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")
	WebElement countryname;

	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement Accountbutton;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement signupbutton;
	
	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement logo;

	@FindBy(xpath = "//a[@class='cia-bottom-content__action']")
	WebElement createAccount;
	
	@FindBy(xpath = "//a[@class='cia-bottom-content__action']")
	WebElement CAdisplayed;

	@FindBy(id = "firstName")
	WebElement firstname;
	@FindBy(id = "lastName")
	WebElement lastname;
	@FindBy(id = "email")
	WebElement enteremail;
	@FindBy(id = "fld-p1")
	WebElement enterpwd;
	@FindBy(id = "reenterPassword")
	WebElement conformpwd;
	@FindBy(id = "phone")
	WebElement mobileno;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickcreateAcct;

	public void mobileno(CharSequence MOnumber) {
		// TODO Auto-generated method stub
		mobileno.sendKeys(MOnumber);
	}

	public void clickcreateAcct() {
		// TODO Auto-generated method stub
		clickcreateAcct.click();
	}

	public void countryname() {
		// TODO Auto-generated method stub
		countryname.click();
	}

	public void Accountbutton() {
		// TODO Auto-generated method stub
		Accountbutton.click();
	}

	public void signupbutton() {
		// TODO Auto-generated method stub
		signupbutton.click();
	}

	public void createAccount() {
		// TODO Auto-generated method stub
		createAccount.click();
	}
	public void CAdisplayed() {
		// TODO Auto-generated method stub
		CAdisplayed.isDisplayed();
	}

	public void firstname(CharSequence firstName) {
		// TODO Auto-generated method stub
		firstname.sendKeys(firstName);
	}

	public void lastname(CharSequence Lastname) {
		// TODO Auto-generated method stub
		lastname.sendKeys(Lastname);
	}

	public void enteremail(CharSequence Email) {
		// TODO Auto-generated method stub
		enteremail.sendKeys(Email);
	}

	public void enterpwd(CharSequence password) {
		// TODO Auto-generated method stub
		enterpwd.sendKeys(password);
	}

	public void conformpwd(CharSequence reenterpwd) {
		// TODO Auto-generated method stub
		conformpwd.sendKeys(reenterpwd);
	}
	
	@FindBy(id = "fld-e")
	WebElement Enterloginemail;
	
	public void Enterloginemail(String enteremail) {
		// TODO Auto-generated method stub
Enterloginemail.sendKeys(enteremail);
	}
	
	@FindBy(id = "fld-p1")
	WebElement Enterloginpwd;
	public void Enterloginpwd(String enterpwd) {
		// TODO Auto-generated method stub
		Enterloginpwd.sendKeys(enterpwd);
	}
	@FindBy(xpath = "//button[@data-track='Sign In']")
	WebElement clickloginbtn;
	public void clickloginbtn() {
		// TODO Auto-generated method stub
clickloginbtn.click();
	}
	public boolean  isdisplayed() {
		// TODO Auto-generated method stub
		return logo.isDisplayed();
	
	}
	public void link() {
		// TODO Auto-generated method stub
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("size:" + ele.size());
		boolean isValid = false;
		for (int i = 0; i < ele.size(); i++) {
		    String nextHref = ele.get(i).getAttribute("href");
		    isValid = getResponseCode(nextHref);
		    if (isValid) {
		        System.out.println("Valid Link:" + nextHref);

		    }
		    else {
		        System.out.println("INVALID Link:" + nextHref);

		    }
		}
	}

	private boolean getResponseCode(String nextHref) {
		// TODO Auto-generated method stub
		return false;
	}

}


