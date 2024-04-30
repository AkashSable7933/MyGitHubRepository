package constructor;

public class defaultconstructor2 
{
	int roll;
	double salary;
	void display() 
	{
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) 
	{
		defaultconstructor2 c1 = new defaultconstructor2();
		c1.display();
	}	
}