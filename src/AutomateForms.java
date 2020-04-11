import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateForms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\SeleniumPractise\\Drivers\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
	driver.get("https://www.techlistic.com/");
	Thread.sleep(1000);
	WebElement home =driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[contains(text(),'Assignments')]"));
	home.click();
	//Actions action = new Actions(driver);
	//action.moveToElement(home).doubleClick().perform();
	//Thread.sleep(2000);
	
	}

}
