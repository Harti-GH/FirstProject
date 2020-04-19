package FirstSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
		driver.get("https://qa-azure.outbackonlineordering.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("restaurant_search_single_field_search_text")).sendKeys("Palm Harbor,FL,USA");
		//driver.findElement(By.id("restaurant_search_single_field_search_text")).click();
		//WebElement wb = driver.findElement(By.id("restaurant_search_single_field_search_text"));
		driver.findElement(By.id("btn-confirm")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@class='categoryItemListItem ng-scope pricedItem']//div[@class='actionsContainer categoryItemActionsContainer']//span[@class='ng-binding']")).click();
		driver.findElement(By.xpath("//button[@name='addMenuItem']//span[@class='ng-binding']")).click();
		driver.findElement(By.xpath("//div[@class='sidebarContent orderPathsContainerTop ng-scope']//span[@class='ng-binding']")).click();		
	driver.findElement(By.xpath("//button[@class='payAtRestaurantAction chooseOrderPaymentPayAtRestaurantAction trk-checkoutpayatrestaurant ng-scope']//span[@class='ng-binding ng-scope']")).click();
				//Select select=new Select(wb);
	//select.selectByVisibleText("Palm Harbor,FL,USA");
        }
	/*public static void dropDownSelectByText(WebElement webElement, String VisibleText){
        Select selObj=new Select(webElement);
        selObj.selectByVisibleText(VisibleText);*/
	
       }



		
	

