package overriding;

class ABC 
{
	void myMethod()
	{
		System.out.println("method of ABC class");
	}
}

class overriding4 extends ABC
{
	public void myMethod() 
	{
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	
	public static void main(String args[]) 
	{
		overriding4 obj = new overriding4();
		obj.myMethod();
	}
}
