package assignments;

public class pyramidexp1
{

	public static void main(String[] args)
	{
	pyramid2();
	}
	
	static void pyramid2()
	{
		int row=5,ct=1;
		for(int i=row;i>0;i--) 
		{
			
			for(int j=1;j<=i*2;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=ct;j++) 
			{
				System.out.print(j+" ");
			}
			
			for(int j=ct-1;j>=1;j--) 
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
			ct++;
		}
	}
}
/**
 *  F6: next line
 *  F5: go inside the function
 *  F8: continue
 *  Ctrl+shift+i : to check value of variable or method return value
 */
