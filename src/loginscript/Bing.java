package loginscript;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		driver.get("https://www.msn.com/en-in/");
		//driver.findElement(By.id("id_l")).click();	
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		
		driver.findElement(By.name("loginfmt")).sendKeys("amith96sttgr@gmail.com");	
		driver.findElement(By.className("inline-block")).click();
		
		driver.findElement(By.name("passwd")).sendKeys("microsoft1231996");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Thread.sleep(3000);
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		//driver.close();
		
	}

}
