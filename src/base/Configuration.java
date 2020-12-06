package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.WDFunction;

public class Configuration extends WDFunction {

	//driver setup(chrome drive and gecko driver)
	//browser setup
	//DB connection
	//browser handling
	
	@Parameters({"url,browser"})
	
	@BeforeTest 
	public void browserInitialization(String url, String browser) {
		if(browser.equalsIgnoreCase("firefoox")) {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/DRIVER/geckodriver.exe");
	//System.setProperty("webdriver.gecko.driver","C://Users//alomg//eclipse-workspace//AmazonFW//DRIVER//geckodriver.exe");
	driver = new FirefoxDriver();
	}
		else if (browser.equalsIgnoreCase("chrome")) {
			log.info("Test Cases started runnig From Chrome");
		//	System.out.println("Test Cases started runnig From Chrome");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/DRIVER/chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver","C://Users//alomg//eclipse-workspace//AmazonFW//DRIVER//chromedriver.exe");
		driver = new ChromeDriver();
   driver.get(url);
		}
	maximize();
	
}
	@AfterTest
	  public void browseClosed() {
		log.info("Browser got closed");
		System.out.println("Browser got closed");
	
}
}