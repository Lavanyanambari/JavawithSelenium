package seleniumBasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		//find all the checkboxes... - get the attribute finding the common for all the checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		List<WebElement> check=driver.findElements(By.cssSelector("input[type='checkbox']"));
//		int count=0;
//		for(WebElement c:check)
//		{
//			count++;
//		}
//		System.out.println(count);
		
		
	}

}
