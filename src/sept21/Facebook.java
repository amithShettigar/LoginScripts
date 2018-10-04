package sept21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//xyz(driver);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("amith96sttgr@gmail.com");
		String u=driver.getCurrentUrl();
		System.out.println(u);
		String t=driver.getTitle();
		System.out.println(t);
		
		
	}
	/*public static  void xyz(WebDriver d)
	{
		
	}*/

}
