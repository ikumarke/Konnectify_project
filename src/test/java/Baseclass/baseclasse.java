package Baseclass;

import org.testng.annotations.BeforeMethod;

import utlity.Utlity;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclasse extends Utlity{
 
  @BeforeClass
  public void Browsersetup() throws IOException {
		driver=driversetup();
		driver.get(prop.getProperty("url"));
		
	}
		@AfterClass
		public void browser_close() {
			//driver.quit();
	        }
	}
