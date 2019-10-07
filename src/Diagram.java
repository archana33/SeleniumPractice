

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Diagram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver2.46\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.bpmn.io/new");
		Actions act=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//*[@id=\"js-canvas\"]/div/div/div[4]/div[1]/div[2]/div[1]"));
		act.dragAndDropBy(src, 1250, 1250);
		 org.openqa.selenium.interactions.Action seriesofActions =(Action) act.dragAndDropBy(src, 1250, 1250);
		//WebDriverWait wait= new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"js-canvas\"]/div/div/div[2]/div/div/div/div[1]/div[1]")))).click();
		//WebElement circle= driver.findElement(By.xpath("//*[@id=\"js-canvas\"]/div/div/div[2]/div/div/div/div[1]/div[1]"));
		//circle.click();
		//driver.close();
		 

	}

}
