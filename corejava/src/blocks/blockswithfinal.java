package blocks;

public class blockswithfinal {

	final static int age;//using SIB we can initialize final static global variable
	final double salary;
	
	/* static block or SIB */
	static {
		age = 30;
	}
	
	/* non-static block or IIB */
	{
		salary = 45000.32;
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + blockswithfinal.age);
		System.out.println("---------------------------------");
		blockswithfinal b1 = new blockswithfinal();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}
}
/*
 * final global variable must be or should initialize at time to declaration only
 * 
 * other ways to initialize final variables
 * 	static final global variable : can be initialize using static block
 *  nonstatic final global variable:  can be initialize using non-static block or constructor
 */