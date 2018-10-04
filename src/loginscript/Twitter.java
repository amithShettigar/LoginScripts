package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://twitter.com/");
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("amith96sttgr@gmail.com");		
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("twitter1996");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.close();
	

	}

}
