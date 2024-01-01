package utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utlity {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver driversetup() throws IOException {
		// TODO Auto-generated method stub
		prop = new Properties();
		String proppath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		FileInputStream file = new FileInputStream(proppath);
		prop.load(file);
		String chromebrowser="chrome";
		if (chromebrowser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (chromebrowser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (chromebrowser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("invaklid browser selection");
			System.exit(1);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}

	public String takescreenshot(String testname, WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String scrshotpath = System.getProperty("user.dir") + "\\Screenshot\\" + testname + ".png";
		FileUtils.copyDirectory(scrfile, new File(scrshotpath));
		return scrshotpath;
	}

	public void switchwindow() {
		// TODO Auto-generated method stub
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.size();
		for (String newwindow : windowHandles) {
			if (!newwindow.contentEquals(windowHandle)) {
				driver.switchTo().window(newwindow);

			}

		}

	}

	public WebElement elementclickable(long timeseconds, By locator) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeseconds));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	

}
