package blocks;

public class nonstaticblockexp1 
{
	
	nonstaticblockexp1()
	{
		System.out.println("zero-param cons...");
	}	
	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main() Starts");
		nonstaticblockexp1 b1=new nonstaticblockexp1();
		System.out.println("---------------------------------");
		nonstaticblockexp1 b2=new nonstaticblockexp1();
		System.out.println("main() ends");
	}
	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}	
}