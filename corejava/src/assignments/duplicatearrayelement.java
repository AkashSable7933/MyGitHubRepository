package assignments;

public class duplicatearrayelement 
{
	public static void main(String args[])
	{
		int a[]= { 1,2,3,4,5,6,2,4,6};
		for(int i:a)
		{
			System.out.print(i+ "  ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j = i + 1; j < a.length; j++) 
			{  
                if(a[i] == a[j])  
                    
                	System.out.println("duplicate elements are:" +a[j]);
			}
		
		}
	}
}
