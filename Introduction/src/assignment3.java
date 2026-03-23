import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String[] products= {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select.form-control")));
		WebElement dp= driver.findElement(By.cssSelector("select.form-control"));
		dp.click();
		Select drop= new Select(dp);
		drop.selectByVisibleText("Consultant");
		
		driver.findElement(By.cssSelector("input#terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		addToCart(driver,products);
		
	}

	public static void addToCart(WebDriver driver, String[] products) 
	{
		//By.xpath("//button[@class='btn btn-info']"
		int j=0;
		List elements= Arrays.asList(products);
		List<WebElement> prod= driver.findElements(By.cssSelector("h4.card-title"));
		
		
		for (int i = 0; i < products.length; i++)
		{
			String webpageElem = prod.get(i).getText();
			if(elements.contains(webpageElem))
			{
				j++;
				driver.findElements(By.xpath("//button[@class='btn btn-info']" )).get(i).click();
				if(j==products.length)
				{
					break;
				}
				
				
			}
			
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
	}

}
