package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	public  ThreadLocal<WebDriver> d=new ThreadLocal<WebDriver>();	
	public void setdriver(WebDriver driver) {
		this.d.set(driver);
	}
	public WebDriver getdriver() {
		return this.d.get();
	}
  @Test
  public void a() throws InterruptedException, MalformedURLException {
	  System.out.println("bfvhs111111111111111");
	  System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
	//   System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
//	 WebDriverManager.chromedriver().setup();
//	  DesiredCapabilities cap = new DesiredCapabilities();
//		 cap.setCapability("browserName", "chrome");
//		WebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		// WebDriver d=new RemoteWebDriver(new URL("http://54.237.37.87:4444/wd/hub"),cap);
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  co.addArguments("--incognito");
	 ChromeDriver d = new ChromeDriver(co);
	  setdriver(d);Thread.sleep(15000);
	  getdriver().manage().window().maximize(); 
	  getdriver().get("https://www.facebook.com/");
	  Thread.sleep(60000);
  }
  @Test
  public void b() throws InterruptedException {
	  WebDriverWait w=new WebDriverWait(getdriver(), Duration.ofMinutes(1));
	  try {
		//  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Log In']")));
		  getdriver().findElement(By.xpath("//button[.='Log In']")).click();Thread.sleep(4000);
	} catch (Exception e) {
		//  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Log In']")));
		  getdriver().findElement(By.xpath("//button[.='Log in']")).click();Thread.sleep(4000);
	}
	 
	 String a = getdriver().findElement(By.xpath("//div[@class='_9ay7']")).getText();
	 System.out.println(a);
	 getdriver().quit();
	
}
}
