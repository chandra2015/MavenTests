package mavenTest;

public class App {
	public static void main(String[] args) {
 
		System.out.println(getHelloWorld());
		
		
		//added sample code to see reports
		Integer number1 = new Integer(123);
		Integer number2 = Integer.valueOf(123);
		 
		System.out.println("number1 =  " + number1);
		System.out.println("number2 =  " + number2);
 
	}
 
	public static String getHelloWorld() {
 
		return "Hello World";
 
	}
 
	public static String getHelloWorld2() {
 
		return "Hello World 2";
 
	}
}