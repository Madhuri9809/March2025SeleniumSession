package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogin {

	public static void main(String[] args) throws InterruptedException, BrowserException {
		
	By username= By.name("username");
	By pass=By.name("password");
	By loginbtn=By.xpath("//button[@type='submit']");
	BrowserUtil butil=new BrowserUtil();
	WebDriver driver= butil.initDriver("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		ElementUtil eutil= new ElementUtil(driver);
		eutil.doSendKeys(username, "admin");
		eutil.doSendKeys(pass, "admin123");
		eutil.doclick(loginbtn);
		System.out.println(butil.getPageTitle());
		butil.CloseThenBrowser();
		

	}

}
