package loginClass;

import browserClass.Browser;

public class Login extends Browser {
	
	public static void login() throws InterruptedException {
		
		driver.findElement(LoginPageLocaters.Email).sendKeys(LoginPageLocaters.userEmail);
		driver.findElement(LoginPageLocaters.Password).sendKeys(LoginPageLocaters.userPassword);
		driver.findElement(LoginPageLocaters.Login).click();
		Thread.sleep(20000);
	}

}
