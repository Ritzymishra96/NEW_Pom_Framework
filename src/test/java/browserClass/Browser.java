package browserClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static WebDriver driver;
	
	public static void chrome() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		
		driver.get("https://qa-c360.afgonline.com.au/Great_Finance/login");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
	}

}
