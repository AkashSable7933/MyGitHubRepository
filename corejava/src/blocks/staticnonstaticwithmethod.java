package blocks;


public class staticnonstaticwithmethod 
{

	int age;
	double salary;
	
	void print() 
	{
		System.out.println("age: " + age);//0
		System.out.println("salary: " + salary);//0.0
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main() Starts..");
		staticnonstaticwithmethod b1 = new staticnonstaticwithmethod();
		b1.print();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		print();
		age=25;
		salary = 45000.32;				
	}
}
