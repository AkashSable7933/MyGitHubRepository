package operators;

public class ThisKeyword6 
{
	//Global Variable or non static GV or Instance GV
	int variable = 95;
	public static void main(String args[]) 
	{
		ThisKeyword6 obj = new ThisKeyword6();
		obj.method(5);
		obj.method();
		System.out.println("Value of Instance variable :" + obj.variable);//25
	}
	
	void method(int variable)
	{
		System.out.println("Value of Local variable :" + variable);//5
		variable = 80;
		System.out.println("Value of Local variable :" + variable);//80
		System.out.println("Value of Instance variable :" + this.variable);//95
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//80
		System.out.println("Value of Instance variable :" + this.variable);//80
	}
	
	void method() 
	{
		int variable = 25;
		System.out.println("Value of Instance variable :" + this.variable);//80
		System.out.println("Value of Local variable :" + variable);//25
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//25
		System.out.println("Value of Instance variable :" + this.variable);//25
	}
}