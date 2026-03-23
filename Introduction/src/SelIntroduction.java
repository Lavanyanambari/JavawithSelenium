import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//invoking browser
		
//		//WebDriver driver1= new EdgeDriver();
//		WebDriver driver= new ChromeDriver();
//		//chromedriver.exe
//			driver.get("https://rahulshettyacademy.com");
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
//			
//			driver.close();
			
			
			WebDriver driver1= new EdgeDriver();
			//chromedriver.exe
				driver1.get("https://rahulshettyacademy.com");
				System.out.println(driver1.getTitle());
				System.out.println(driver1.getCurrentUrl());
				
				driver1.close();
			
	}

}
