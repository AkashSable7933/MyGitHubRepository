package typecasting;

public class primitivecasting1 
{

	public static void main(String[] args) 
	{
		
		int myInt = 9;//
		double myDouble = myInt;   //converting lower dt to higher is widening implicit, when java compiler writes behalf of you--> double myDouble =(double)myInt;
		
		double d=(double)myInt;//explicit widening, user defined widening 
		System.out.println(myInt); //
		System.out.println(myDouble); //
		System.out.println(d);//

		double salary=23400.67856856898989545d;		//converting higher dt lower to  is called narrowing
		int sal=(int)salary;//narrowing,explicit //23400
		long f=(long)salary;//narrowing,explicit //23400
		float f1=(float)salary;//narrowing,explicit //23400.678
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
		System.out.println("float Salary: "+f1);
	}

}
