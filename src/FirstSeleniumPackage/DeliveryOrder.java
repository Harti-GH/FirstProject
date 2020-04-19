package FirstSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeliveryOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://qa-azure.outbackonlineordering.com/#/delivery/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("address_auto_complete")).sendKeys("31988 US Hwy 19 N, Palm Harbor, FL, 34684");
	}

}
