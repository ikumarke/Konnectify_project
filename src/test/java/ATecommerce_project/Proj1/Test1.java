package ATecommerce_project.Proj1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.baseclasse;

public class Test1 extends baseclasse {
	@Test
	public void Testbestbuy() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Sign_up sign = new Sign_up(driver);
		sign.link();
		Thread.sleep(9000);
		sign.countryname();
		sign.Accountbutton();
		sign.signupbutton();
		sign.CAdisplayed();
		String ss = sign.CAdisplayed.getText();
		System.out.println(ss);
		if (ss.equals("Create an account")) {
			try {
				sign.createAccount();
				sign.firstname(prop.getProperty("firstname"));
				sign.lastname(prop.getProperty("lastname"));
				sign.enteremail(prop.getProperty("enteremail"));
				sign.enterpwd(prop.getProperty("enterpwd"));
				sign.conformpwd(prop.getProperty("conformpwd"));
				sign.mobileno(prop.getProperty("mobileno"));
				sign.clickcreateAcct();

				WebElement elementclickable = elementclickable(5000, By.xpath("//div[@style='font-weight: normal;']"));
				System.out.println("The given details  " + elementclickable.getText());

				String s = elementclickable.getText();
				System.out.println(s);
				Thread.sleep(3000);
				sign.createAccount();
				sign.Enterloginemail(prop.getProperty("enteremail"));
				sign.Enterloginpwd(prop.getProperty("enterpwd"));
				sign.clickloginbtn();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
