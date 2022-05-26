package mainClass;

import browserClass.Browser;
import loginClass.Login;
import headerPage.HeaderPage;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Browser.chrome();
		Login.login();
		HeaderPage.header();
		

	}

}
