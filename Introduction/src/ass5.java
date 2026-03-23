import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ass5 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Nested Frames")).click();
//		driver.switchTo().frame(driver.findElement(By.className("frame-top")));
//		driver.switchTo().frame(driver.findElement(By.className("frame-middle")));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		Actions a= new Actions(driver);

	}

}
