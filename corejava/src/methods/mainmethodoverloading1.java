package methods;

public class mainmethodoverloading1 
{
	/**
	 * Method Overloading: any method declare more than once in class body with different set of parameter
	 * anyone of below rules: 
	 * 1. type of argument differ or 
	 * 2. number of arguments/parameter should differ or 
	 * 3. position of arguments/parameter should differ
	 * why: to perform same action with diff ways we use overloading
	 */
	
	static double res;
	static public void square(double number)
	{
		res = number * number;
		System.out.println("Method with double Argument Called:" + res);
	}
	
	static public void square()
	{
		int res=20*20;
		System.out.println("No Parameter Method Called "+ res);
	}
	
	static public void square(int number) 
	{
		res = number * number;
		System.out.println("Method with Integer Argument Called:" + res);
	}	
	
	public static void main(String[] args) 
	{		
		mainmethodoverloading1.square(2);
		mainmethodoverloading1.square();
		mainmethodoverloading1.square(5.56f);
	}
}