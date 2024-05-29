package Konnectify_test;

import java.io.IOException;

import org.testng.annotations.Test;

import Baseclass.baseclasse;
import Konnectify_event_logs.Login_page;
import utlity.Utlity;

public class Test_event_login_page extends baseclasse {

	@Test
	public void testlogin() throws IOException {
		// TODO Auto-generated method stub
		Login_page login = new Login_page(driver);
		login.Email(prop.getProperty("enteremail"));
		login.password(prop.getProperty("enterpwd"));
		login.clLogin();
		login.dashbordpage();
		login.clickeventlog();
		login.ClickToday();
		Utlity ul =new Utlity();
		try {
			ul.takescreenshot("Eventlogpage", driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		login.konnectorfilter();
		login.konnectorfiltersearchbar(prop.getProperty("konnectorname"));
		login.Applyfilter();
		try {
			ul.takescreenshot("Konnectorfilterpage", driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
