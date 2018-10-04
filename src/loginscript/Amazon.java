package loginscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	static
    {
   	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
    }

	public static void main(String[] args) {
		
		
		
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			
			driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin%26_encoding%3DUTF8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0");
			driver.findElement(By.id("ap_email")).sendKeys("bw25013@gmail.com");
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("ap_password")).sendKeys("bruceamazon1996");
			driver.findElement(By.id("signInSubmit")).click();
			
			String t=driver.getTitle();
			System.out.println(t);
			String u=driver.getCurrentUrl();
			System.out.println(u);
		    /*if(t.equals("Your Account"))
			{
				System.out.println("pass:homepage displayed");	
			}
			else
			{
				System.out.println("fail:");
			}*/
			
		}

	}


