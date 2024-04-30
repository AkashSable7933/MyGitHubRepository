package inheritence;
class comp
{
	int year;
	public void display(int year)
	{
		System.out.println("I am display() of company");
		year=2022;
	}
	comp()
	{
		System.out.println("I am company constructor");
		
		
	}
	
class emp extends comp
{
	double id;
	public void display(double id)
	{
		super.display(2022);
		System.out.println("I am display() of emp");
		System.out.println("emp id is:"+id);
		
	}
	emp()
	{
		System.out.println("I am emp constructor");
			
	}
}
public class inheritanceg 
{
	public static void main(String args[])
	{
		System.out.println("*******************************************");
		emp e1=new emp();
		e1.display(10.0);
		System.out.println("*******************************************");
		
	}

}