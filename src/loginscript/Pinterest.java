package loginscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pinterest {
	static
    {
   	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
    }
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		driver.get("https://in.pinterest.com/");
		driver.findElement(By.id("email")).sendKeys("bw25013@gmail.com");
		driver.findElement(By.id("password")).sendKeys("brucepin123");
		driver.findElement(By.xpath("//button[@class='red SignupButton active']")).click();
		
		
		
	}
	

}
