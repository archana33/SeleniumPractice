
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		//driver.findElement(By.id("btn_basic_example")).click();
		driver.findElement(By.name("optradio")).click();
		driver.findElement(By.id("buttoncheck")).click();
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("ageGroup")).click();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		driver.close();
	}

}
