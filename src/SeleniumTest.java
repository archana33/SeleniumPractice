
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver;
	@BeforeTest
	public void browserOpen() {
	  System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	
}
	@Test
	public void forgoutAccountPage() {
		  driver.findElement(By.linkText("Forgot account?")).click();
		  driver.findElement(By.xpath("//*[@id='identify_email']")).sendKeys("hduhueheu");
		  driver.findElement(By.id("u_0_2")).click();	  
	}	
	
	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
