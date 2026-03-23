import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ass4 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		
		
		a.moveToElement(driver.findElement(By.linkText("Multiple Windows"))).click().build().perform();
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=  driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentID= it.next();
		String ChildID= it.next();
		
		driver.switchTo().window(ChildID);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	}

}
