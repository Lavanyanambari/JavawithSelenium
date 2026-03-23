package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		WebElement move= driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).build().perform();
		
		a.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
	}

}
