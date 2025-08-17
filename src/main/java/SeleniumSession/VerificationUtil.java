package SeleniumSession;

public class VerificationUtil {
	public static boolean verifyEquals(String actualvalue, String expectedvalue) {
	
		if(actualvalue.equalsIgnoreCase(expectedvalue)) {
			System.out.println("actual value is equals to expected value");
			return true;
		}
		return false;
	}
	public static boolean verifyContains(String actualvalue, String expectedvalue) {
		
		if(actualvalue.contains(expectedvalue)) {
			System.out.println("actual value is equals to expected value");
			return true;
		}
		return false;
	}
	
public static boolean verifyContains_IntValue(int actualvalue, int expectedvalue) {
		
		if(actualvalue==expectedvalue) {
			System.out.println("actual value is equals to expected value");
			return true;
		}
		return false;
	}
}
