package loops;

public class forexp1 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
		System.out.println("***************************");
		int x=1;
		for( ;x<=3;x++) 
		{
			System.out.println(x);
		}
		System.out.println("***************************");
		int z=1;
		for( ;z<=3; ) 
		{
			System.out.println(z);
			z++;
		}
	}

}
