package loginscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}

	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new FirefoxDriver();
		//Enter the test URL of the Application
		driver.get("https://www.naukri.com/nlogin/login");
		//Inspect the Element of Login Page
		driver.findElement(By.id("usernameField")).sendKeys("bw25013@gmail.com");
		
		driver.findElement(By.id("passwordField")).sendKeys("Brucenaukri2018");
		
		driver.findElement(By.xpath("//button[.='Login']")).click();
		//Getting the Title of the page
		String t=driver.getTitle();
		System.out.println(t);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//Verification
		if(t.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com"))
		{
			System.out.println("Pass: Login successful");
		}
		else
		{
			System.out.println("Fail: Login not successful");
		}

	}

}
