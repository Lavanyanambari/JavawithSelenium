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

public class Dummy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		int j = 0;

		String[] mobiles = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/loginpagePractise//");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");

		driver.findElement(By.xpath("//input[@value='user']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Okay']")));

		driver.findElement(By.xpath("//button[text()='Okay']")).click();

		WebElement dropdownvalue = driver.findElement(By.cssSelector("select[class='form-control']"));

		Select dropdownvalue1 = new Select(dropdownvalue);

		dropdownvalue1.selectByIndex(2);

		System.out.println(dropdownvalue1.getFirstSelectedOption().getText());

		dropdownvalue1.selectByVisibleText("Consultant");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();

		Thread.sleep(3000);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));

		List<String> mobileList = Arrays.asList(mobiles);

		for (int i = 0; i < products.size(); i++) {

			String productName = products.get(i).getText();

			if (mobileList.contains(productName)) {

				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

				j++;

				if (j == mobiles.length) {

					break;

				}

			}

		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

}