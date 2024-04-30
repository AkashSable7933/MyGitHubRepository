package variable;

public class finalexample2 {

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		int age=25;
		System.out.println("age= "+age);
		
		age=30;//re-initialization
		System.out.println("age= "+age);
		
		age=50;//re-initialization
		System.out.println("age= "+age);
		
		final int empId=123;//empID is declare as constant
		System.out.println("empId= "+empId);
		
		//empId=456;//trying re-initialization final variable, which will give you compile time error
		System.out.println("empId= "+empId);
		System.out.println("Program Ends");
	}
}
