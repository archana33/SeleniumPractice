//package Demo;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class Dropdown {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver2.46\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();//driver obj for chrome
//		driver.manage().window().maximize();
//		driver.get("http://www.spicejet.com/");
//		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
//        s.selectByValue("USD");
//        s.selectByIndex(3);
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isEnabled());
//		System.out.println("Radio Button");
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
//		//if we have same type for ex: we have 3 radio buttons of type radio and wants to check 2 button 
//		System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected());
//		// click on all radio buttons
//		int size=driver.findElements(By.xpath("//input[@type='radio']")).size();//size=3 here
//		for(int i=0;i<=2;i++) {
//			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
//			System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).get(i).isSelected());
//			
//		}
//	}
//
//}
