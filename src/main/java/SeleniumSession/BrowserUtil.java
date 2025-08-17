package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;

	public WebDriver initDriver(String BrowserName) throws BrowserException {
		System.out.println("Enter browser:"+ BrowserName );
		switch (BrowserName.trim().toLowerCase()) {
		case "chrome": 
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the correct browser name:" + BrowserName);
			throw new BrowserException("-------Invalid Browser--------");
		// break;

		}
		return driver;
	}

	public void launchUrl(String Url) throws BrowserException {
		System.out.println("enter the url:" + Url);
		if (Url == null) {
			throw new BrowserException("-------url can not be null--------");
		}
		if (Url.indexOf("http") != 0) {
			throw new BrowserException("-------url should be contains http(s)-------");
		}
		driver.get(Url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void CloseThenBrowser() {
		driver.close();
	}

	public void QuitThenBrowser() {
		driver.quit();
	}

}
