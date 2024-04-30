package inheritence;
class company
{
	int est_year;
	public void display()
	{
		System.out.println("I am display() of company");
	}
	company()
	{
		System.out.println("I am company constructor");
		est_year = 2022;
	}
}

class employee extends company
{
	int est_year;
	public void display()
	{
		System.out.println("I am display() of emp");
	}
	employee()
	{
		System.out.println("I am emp constructor");
		est_year= 2024;
	}
}

public class inheritanceglobal000 
{
	public static void main(String args[])
	{
		System.out.println("*******************************************");
		employee e1=new employee();
		e1.display();
		System.out.println("*******************************************");
		
	}

}
