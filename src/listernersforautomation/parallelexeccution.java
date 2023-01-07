package listernersforautomation;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;





@Listeners(ITestListenerClass.class)
public class parallelexeccution {

	
	
	@Test
	public void testMethod1() {
	
		System.out.println("I am inside method 1");
		
	}
	@Test 
	public void testMethod2() throws InterruptedException {
		
		
		System.out.println("I am inside method 2");
		Assert.assertTrue(false);
	}
	@Test (timeOut = 1000)
	public void testMethod3() throws Exception {
		Thread.sleep(3000);
		
		System.out.println("I am inside method 3");
	}
	@Test (dependsOnMethods = "testMethod3")
	public void testMethod4() {
		
		System.out.println("I am inside method 4");
	
	
	
	
}}
	
