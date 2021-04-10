package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/*public class BaseTest implements AutoConstant{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
	@BeforeSuite
	public void executionstarted()
	{
		Reporter.log("execution is started",true);
	}
	
	@AfterSuite
	public void executionstopped()
	{
		Reporter.log("execution is completed",true);
	}
}

*/


