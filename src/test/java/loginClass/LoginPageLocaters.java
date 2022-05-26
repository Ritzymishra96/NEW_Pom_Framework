package loginClass;

import org.openqa.selenium.By;

public class LoginPageLocaters {
	
	public static By Email = By.xpath("//input[@id='emailAddress']");
	public static By Password = By.xpath("//input[@id='password']");
	public static By Login = By.xpath("//span[normalize-space()='Log in']");
	
	public static String userEmail = "talha.test.october@test.com";
	public static String userPassword = "AFGPassword1";

}
