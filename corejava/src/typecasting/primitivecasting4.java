package typecasting;

public class primitivecasting4 
{

	public static void main(String[] args)
	{
		byte b = 5;
		short s = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;
		System.out.println("Examples of (Lower to Higher)Widening Type casting...!!");
		System.out.println("byte to short : " + s); //5
		System.out.println("byte to int : " + i); //5
		System.out.println("byte to long : " + l); //5
		System.out.println("byte to float : " + f); //5.0
		System.out.println("byte to double : " + d); //5.0
	}
}
