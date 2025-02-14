package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Page.BookswagonSignIn;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
	
	protected WebDriver driver;
	protected String mobileno;
	protected String pass;
	
	
	
	
	@BeforeClass
	public void setUp() throws IOException {

		Properties pro = new Properties();

		FileInputStream fInputS =new FileInputStream("C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\BookswagonProject\\src\\test\\resources\\myIndia.properties");

		pro.load(fInputS);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("baseURL"));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		mobileno = pro.getProperty("mobileno");
		pass = pro.getProperty("password");
		


	}

	@AfterClass
	public void teardown() {
//		driver.quit();
	}
}
