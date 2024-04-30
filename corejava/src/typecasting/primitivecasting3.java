package typecasting;

public class primitivecasting3 
{

	public static void main(String[] args) 
	{

		double myDouble = 9.78d;     // higher to lower datatype narrowing
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}

}
