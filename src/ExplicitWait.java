
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver2.46\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//driver obj for chrome
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,5);
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.xpath("//*[@id=\"package-origin-hp-package\"]")).sendKeys("rdu");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys("dal");
		driver.findElement(By.xpath("//*[@id=\"package-departing-hp-package\"]")).sendKeys("04/24/2019");
		driver.findElement(By.xpath("//*[@id=\"package-returning-hp-package\"]")).sendKeys("04/25/2019");	
		driver.findElement(By.id("search-button-hp-package")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"282336\"]/div[2]/div/a"))).click();
		driver.findElement(By.xpath("//*[@id=\"282336\"]/div[2]/div/a")).click();
		
	}
	
}
