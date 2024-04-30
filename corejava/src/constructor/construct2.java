package constructor;

public class construct2
{
	construct2() 
	{
		System.out.println("This is a zero-para constructor");
	}
	construct2(char c)
	{
		System.out.println("This is a single-para constructor");
	}
	construct2(int num1, int num2) 
	{
		System.out.println("This is a int-int parameterized constructor");
	}	
	construct2(double num1, int num2)
	{
		System.out.println("This is a double-int parameterized constructor");
	}
	construct2(int num1, double num2) 
	{
		System.out.println("This is a int-double parameterized constructor");
	}	
	public static void main(String[] args) {
		construct2 c1 = new construct2();
		construct2 c2 = new construct2(10, 20);
		construct2 c3 = new construct2('d');
		construct2 c4 = new construct2(10d, 20);
		construct2 c5 = new construct2(10, 20.45);
	}
}
/**
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */