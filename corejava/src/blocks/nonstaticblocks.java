package blocks;

public class nonstaticblocks {
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main() Starts");
		nonstaticblocks b1 = new nonstaticblocks();
		
		System.out.println("---------------------------------");
		nonstaticblocks b2 = new nonstaticblocks();
		System.out.println("main() ends");
	}
}
/**
NSIB: use to execute before constructor and use to provide additional information to object before it get created
- for every instance NSIB will be executed
*/