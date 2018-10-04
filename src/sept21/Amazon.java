package sept21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.findElement(By.name("field-keywords")).sendKeys("nike shoes for mens");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/I/41WsYSRygVL._AC_UL260_SR200,260_FMwebp_QL70_.jpg']")).click();
	 
	 
}
}
