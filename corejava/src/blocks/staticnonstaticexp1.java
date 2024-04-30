package blocks;

public class staticnonstaticexp1 {

	/* static block or SIB */
	static 
	{
		System.out.println("running static-block-1 of class Blocks5..");
	}
	
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main() Starts");
		
		staticnonstaticexp1 b1 = new staticnonstaticexp1();
		System.out.println("---------------------------------");
		staticnonstaticexp1 b2 = new staticnonstaticexp1();
		System.out.println("main() ends");
	}
	
}