package part2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows= driver.getWindowHandles(); //parent id & child id
		Iterator<String> it= windows.iterator();
		String parentid= it.next();
		String childID= it.next();
		driver.switchTo().window(childID);
		
		String email= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
//		String[] list= text.split("at");
//		String[] list2= list[1].split("with");
//		String email= list2[0].trim();
		
		System.out.println(email);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(email);
		
	}

}
