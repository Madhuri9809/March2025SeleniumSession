package SeleniumSession;

public class LoginPageTest {
	public static void main(String[] args) throws BrowserException {
		BrowserUtil util=new BrowserUtil();
		util.initDriver("chrome");
		util.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=util.getPageTitle();
		VerificationUtil.verifyEquals(title, "Account Login");
		String actulurl =util.getCurrentUrl();
		System.out.println(actulurl);
		VerificationUtil.verifyEquals(actulurl, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		util.CloseThenBrowser();
	}

}
