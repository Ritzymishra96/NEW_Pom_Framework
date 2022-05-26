package headerPage;

import loginClass.Login;


public class HeaderPage extends Login {
	
	public static void header() {
		
		driver.findElement(HeaderPageLocator.ResumeApplication).click();
	}
	

}
