package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Infibeam {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.infibeam.com/");
		driver.findElement(By.id("loginlink")).click();	
		driver.findElement(By.id("userHandle")).sendKeys("bw25013@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Bruceinfibeam2018");
		driver.findElement(By.xpath("//div/button[.='LOGIN']")).click();
		String t=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(t);
		System.out.println(url);
		driver.close();
	}

}
