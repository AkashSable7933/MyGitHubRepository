package blocks;

public class staticnonstaticblockexp2 
{
	
	/* static block or SIB*/
	static 
	{		
		System.out.println("running static-block-1 of class Blocks6..");		
	}
	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks6..");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main() Starts");
		staticnonstaticblockexp2 b1=new staticnonstaticblockexp2();
		System.out.println("---------------------------------");
		staticnonstaticblockexp2 b2=new staticnonstaticblockexp2();
		System.out.println("main() ends");
	}
	
	/* static block or SIB*/
	static 
	{		
		System.out.println("running static-block-2 of class Blocks6..");		
	}
	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks6..");
	}
}