package loginscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.facebook.com/");

	
	driver.findElement(By.id("email")).sendKeys("amith96sttgr@gmail.com");
	
	
	driver.findElement(By.id("pass")).sendKeys("1996twoface");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
//	driver.findElement(By.id("userNavigationLabel")).click();
//	driver.findElement(By.xpath("//span[.='Log Out']")).click();
	driver.close();
	}

}
