
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//driver obj for chrome
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement orders = driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Orders')]"));
		String signInXpath ="//input[@id='ap_email']";
		a.moveToElement(orders).click().build().perform(); 
		WebElement login= driver.findElement(By.xpath(signInXpath));
		login.sendKeys("abcd@gmail.com");
		//move to specific element then right click
		//a.moveToElement(move).contextClick().build().perform(); 
		//mouseover then rightclick code
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
