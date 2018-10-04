package sept20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		abc(driver);
		WebDriver driver1=new FirefoxDriver();
		abc(driver1);
	}
	public static void abc(WebDriver d)
	{
		d.get("https://www.facebook.com/");
		String u=d.getCurrentUrl();
		System.out.println(u);
		String t=d.getTitle();
		System.out.println(t);
		d.close();
	}
	
		
		

	}

