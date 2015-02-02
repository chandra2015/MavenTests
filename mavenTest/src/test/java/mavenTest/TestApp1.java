package mavenTest;

import junit.framework.Assert;

import org.junit.Test;

 
@SuppressWarnings("deprecation")
public class TestApp1 {
 
	@Test
	public void testPrintHelloWorld() {
 
		Assert.assertEquals(App.getHelloWorld(), "Hello World");
 
	}
 
}