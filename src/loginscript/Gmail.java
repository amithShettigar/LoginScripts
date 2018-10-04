//NOT WORKING
package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	 public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bw25013@gmail.com");
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("brucewayne12345");
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 String t=driver.getTitle();
			System.out.println(t);
			String u=driver.getCurrentUrl();
			System.out.println(u);
	 }

}
