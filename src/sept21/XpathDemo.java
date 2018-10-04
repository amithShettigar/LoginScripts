package sept21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///M:/selenium/Webpages/demo2.html");
	
}
}