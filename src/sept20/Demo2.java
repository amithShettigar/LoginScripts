package sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///M:/selenium/Webpages/demo.html");
		//driver.findElement(By.id("abc")).click();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("qwe")).click();
		//driver.findElement(By.name("facebook")).click();
		//driver.findElement(By.linkText("FACEBOOK")).click();
		driver.findElement(By.partialLinkText("FACE")).click();
		

	}

}
