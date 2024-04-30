package methods;

public class nonstaticexp1 
{
	public void display() 
	{
		System.out.println("Hi, I am Akash");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 8956731212");
	}	
	void addNumber() 
	{
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	void addNumber(int num1,int num2)
	{
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) 
	{
		//as all the above method are having return type as void, hence they won;t return any value
		nonstaticexp1 e1=new nonstaticexp1();
		e1.addNumber();
		e1.addNumber(25, 30);
		e1.display();
	}
}

