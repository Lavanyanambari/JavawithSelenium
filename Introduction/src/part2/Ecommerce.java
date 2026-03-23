package part2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] selectItems = { "Brocolli", "Cucumber", "Beetroot","Carrot" };
		Thread.sleep(2000);
		getMethod(driver, selectItems);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		//other xpath:- //button[contains(text(),'PROCEED TO CHECKOUT')]
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[class=promoCode]")));
		
		driver.findElement(By.cssSelector("input[class=promoCode]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
		
	}
	
	public static void getMethod(WebDriver driver, String[] selectItems)
	{
		List<WebElement> list = driver.findElements(By.xpath("//h4[@class='product-name']"));

		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			String[] product = list.get(i).getText().split("-");
			// brocolli 
			//  1kg
			String formattedProduct = product[0].trim();
			List<String> items = Arrays.asList(selectItems);

			if (items.contains(formattedProduct)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == selectItems.length) {
					break;
				}
			}

		}

	}

}

