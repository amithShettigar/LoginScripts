package Demopackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	static  
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();

	}

}
