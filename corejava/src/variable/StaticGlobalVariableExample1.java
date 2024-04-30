/* This example */
package variable;

public class StaticGlobalVariableExample1 
{
	static int age=35;
	double salary=45000.56;
	void display(double salary)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@");

		System.out.println("local salary: "+salary);
		StaticGlobalVariableExample1 obj=new StaticGlobalVariableExample1();
		System.out.println("NSGV salary: "+obj.salary);
		obj.salary=salary;//
		System.out.println("Local variable salary: "+salary);//45000.56
		System.out.println("NSGV salary: "+obj.salary);//45000.56
	}
	
	void printVariable(double salary)
	{
		System.out.println("************");
		System.out.println("local salary: "+salary);
		System.out.println("NSGV salary: "+this.salary);
		this.salary=salary;
		System.out.println("Local variable salary: "+salary);//
		System.out.println("NSGV salary: "+this.salary);//
		System.out.println("this keyword value: "+this);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("age: "+age);
		int age=25;
		System.out.println("local age: "+age);
		System.out.println("GSV age: "+StaticGlobalVariableExample1.age);
		StaticGlobalVariableExample1 s1=new StaticGlobalVariableExample1();
		s1.display(65000.56);
		s1.printVariable(85000);
		System.out.println("Value of Object created by me: "+s1);
	}
}
/*
how you will differentiate SVG with static method local variable when they have same name?
SGV should access with classname only

how you will differentiate NSVG with non-static method local variable when they have same name?
1.by using Object
2.by using this keyword

this: this keyword is predefined keyword in java 
	it is also known current class instance/object
	it is use access to non-static members(variable/method) of the class
	it can be used only inside non-static method/constructor
	it is mainly used when NSGV name and non-static method local variable name are same
*/
