import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDrown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromer.driver", "D:\\SeleniumJars\\chromedriver");
		WebDriver driver = new ChromeDriver();
		// Static drop down practice
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebElement fromLocation = driver.findElement(By.xpath("//a[@value='AMD']"));
		fromLocation.click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		WebElement toLocation = driver.findElement(By.xpath("(//a[@value='AMD'])[2]"));
		toLocation.click();
		
	}

}
