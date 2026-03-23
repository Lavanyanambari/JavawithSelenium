import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass7_javascriptexecutor {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement table= driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());

		 System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		
		List<WebElement> secodnele= table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secodnele.get(0).getText());
		System.out.println(secodnele.get(1).getText());
		System.out.println(secodnele.get(2).getText());
		driver.close();
	}

}
