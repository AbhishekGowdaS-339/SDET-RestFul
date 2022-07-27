package String_Practice;


/*
 * The main method is the starting point of JVM to start the execution of the program, else the program 
 * will not get executed 
 * 
 * public is the access specifier, JVM look for the execution point
 * 
 * We can use main method without creating the object
 * 
 * void is the return type where main method will not return any value 
 * 
 * It is a default signature which is predefined in the JVM. It is called by JVM to execute a program 
 * line by line and end the execution after completion of this method. We can also overload the main() method.
 * 
 * The main() method also accepts some data from the user. It accepts a group of strings, which is called a 
 * string array. It is used to hold the command line arguments in the form of string values.
*/

public class MainMethodDetails {
	
	static {
		System.out.println("Hii, static block here");
	}
	public static void main() {
		System.out.println("invocation");
	}
	public static void main(String args[]) {
		
		System.out.println();
		MainMethodDetails b = new MainMethodDetails();
		b.main();
		
	}

}
