package Com.library;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;

public class BaseClass {

	public  static WebDriver driver;
	@Parameter
	@BeforeMethod
	
	public void setup() {
		if(GenericClass.getproperties("Browsername").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.get(GenericClass.getproperties("Url"));
			driver.manage().window().maximize();
			
		}
		else if(GenericClass.getproperties("Browsername").equals("firefox")){
			System.setProperty("webdriver.gecko.driver","E:\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(GenericClass.getproperties("Url"));
			driver.manage().window().maximize();
		}
			
			
			
			
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
	
	
	
	
	
	
}
