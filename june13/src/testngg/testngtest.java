package testngg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngtest {

	@BeforeClass 
	public void beforeclasss() {
		System.out.println("beforeclassss");
	}
	
	@BeforeMethod
	public void beforemethodd() {
		System.out.println("beforemethod");
	}
	
	@Test
	public void test123() {
		System.out.println("test");
	}
	
	
}
