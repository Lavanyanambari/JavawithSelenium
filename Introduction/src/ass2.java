import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ass2 {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Lavanya");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lav@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("lav");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dp= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown= new Select(dp);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		//driver.findElement(By.name("date")).sendKeys("24-07-2000");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("24-07-2000");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".alert-success")), "Success! The Form has been submitted successfully!.");
		
	}

}
