package loginscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geeksforgeeks {
	static
    {
   	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		driver.get("https://auth.geeksforgeeks.org/");
		driver.findElement(By.id("luser")).sendKeys("bw25013@gmail.com");
		driver.findElement(By.id("password")).sendKeys("brucegeeks123");
		driver.findElement(By.xpath("//button[contains(@class,'signin-button')]")).click();
		
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		
	     
	     

	}

}
