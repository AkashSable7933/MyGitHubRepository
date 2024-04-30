package inheritence;

class A2 
{
	void msg() 
	{
		System.out.println("Hello");
	}
}

class B2 {
	void msg()
	{
		System.out.println("Welcome");
	}
}
class inheritance005 extends A2,B2
{
	
	inheritance005()
	{
		super();//confusion 
	}

	public static void main(String args[]) 
	{
		inheritance005 obj = new inheritance005();
		obj.msg();
	}
}
/**
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/