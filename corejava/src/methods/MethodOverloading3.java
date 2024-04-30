package methods;

class Adder 
{
	static int add(int a, int b)
	{
		return a + b;
	}
	
	static int add(int a, int b, int c)
	{
		return a + b + c;
	}
}

public class MethodOverloading3 {
	
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		System.out.println("****************************");
		//you can access other class members as well
		MethodOverloading3.square();
		MethodOverloading3.square(2.56);
		MethodOverloading3.square(25);
		System.out.println("****************************");
		//access non static member of other class
		MethodOverloading3 m1=new MethodOverloading3();
		m1.square();
		m1.square(25);
		m1.square(5.3f);
	}
}