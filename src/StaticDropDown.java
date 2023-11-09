import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromer.driver", "D:\\SeleniumJars\\chromedriver");
		WebDriver driver = new ChromeDriver();
		// Sibling - Child to parent traverse

		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(currency);
		dropdown.selectByValue("USD");
		WebElement passengers = driver.findElement(By.id("divpaxinfo"));
		passengers.click();
		Thread.sleep(2000);
		WebElement plusAdult = driver.findElement(By.id("hrefIncAdt"));
		System.out.println(passengers.getText());
		int i=1;
		while(i<5) {
			plusAdult.click();
			i++;
		} 
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(passengers.getText());
		Thread.sleep(2000);
		driver.quit();

	}

}
