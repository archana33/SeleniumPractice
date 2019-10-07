
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver2.46\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//driver obj for chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		driver.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]")).click();
		driver.close();
	
	}

}
