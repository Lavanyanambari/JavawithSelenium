package seleniumBasics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("lavanya");
		driver.findElement(By.name("inputPassword")).sendKeys("lava");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lav23@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.close();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lav@gmail.com");
		
		driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("98766554566");
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("lavanya");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
	}

}
