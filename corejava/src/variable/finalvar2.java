package variable;

public class finalvar2 
{
		public static void main(String[] args) 
		{
		
		int AGE=15;
		System.out.println("age: "+AGE);
		AGE=10;//compile time error
		System.out.println("updated age1: "+AGE);
		AGE=1;//compile time error
		System.out.println("updated age2: "+AGE);
		//final AGE=25;//wrong syntax, final keyword should be used at time of declaration only
		System.out.println("updated age3: "+AGE);
		AGE=105;//compile time error
		System.out.println("updated age4: "+AGE);
	}
}
