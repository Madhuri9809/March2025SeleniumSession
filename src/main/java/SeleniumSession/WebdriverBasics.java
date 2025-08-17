package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class WebdriverBasics {

	public static void main(String[] args) {
		//1.Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//2.Navigate to url
		driver.get("https://www.google.com");
		
		//3. get the Title
		String title=driver.getTitle();
		System.out.println(title);
		
		//4. validation done for the act vs exp
		if (title.equalsIgnoreCase("google")) {
			System.out.println("Title is matched"+ "test case is passed");
		}
		else {
			System.out.println("Title is not matched"+ "test case is failed");
		}
		
		//5.Close the browser
		driver.quit();

	}

}
