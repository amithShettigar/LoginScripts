package loginscript;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goodreads {
     static
     {
    	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
     }
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		driver.get("https://www.goodreads.com/");
		driver.findElement(By.id("userSignInFormEmail")).sendKeys("bw25013@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("brucegood123");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getCurrentUrl();
		System.out.println(u);

	}
	

}
