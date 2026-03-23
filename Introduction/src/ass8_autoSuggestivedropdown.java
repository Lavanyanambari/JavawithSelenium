import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ass8_autoSuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String input= "Ind";
		driver.findElement(By.id("autocomplete")).sendKeys(input);
		Thread.sleep(2000);
		List<WebElement> list=  driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
	
		
		for (WebElement opt : list) {
			if(opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();
				break;
			}
		}
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		Assert.assertEquals(driver.findElement(By.id("autocomplete")).getAttribute("value"), "India");
	}

}
