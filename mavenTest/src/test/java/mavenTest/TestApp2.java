/*
 * This is sample Junit Test class
 */
package mavenTest;

import junit.framework.Assert;

import org.junit.Test;
 
/**
 * The Class TestApp2.
 */
@SuppressWarnings("deprecation")
public class TestApp2 {
 
	/**
	 * Test print hello world2.
	 */
	@Test
	public void testPrintHelloWorld2() {
 
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
 
	}
 
}