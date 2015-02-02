package mavenTest;

import junit.framework.Assert;

import org.junit.Test;

 
// TODO: Auto-generated Javadoc
/**
 * The Class TestApp1.
 */
@SuppressWarnings("deprecation")
public class TestApp1 {
 
	/**
	 * Test print hello world.
	 */
	@Test
	public void testPrintHelloWorld() {
 
		Assert.assertEquals(App.getHelloWorld(), "Hello World");
 
	}
 
}