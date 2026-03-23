import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectOption= driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(selectOption);
		WebElement dp= driver.findElement(By.id("dropdown-class-example"));
		Select a= new Select(dp);
		a.selectByContainsVisibleText(selectOption);
		
		driver.findElement(By.id("name")).sendKeys(selectOption);
		
		driver.findElement(By.id("alertbtn")).click();
		 String alertMsg= driver.switchTo().alert().getText();
		 //System.out.println(alertMsg);
		driver.switchTo().alert().accept();
		String[] output= alertMsg.split(" ");
		Assert.assertEquals(output[1], "Option2,");
		
		Assert.assertTrue(alertMsg.contains(selectOption));
		
		
		
	}

}
