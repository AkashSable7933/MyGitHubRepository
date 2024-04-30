package assignments;

public class smallestofarray 
{
	public static void main(String args[])
	{
		int array[]= {11,5,8,45,2};
		System.out.println("Original Array:");
		for(int i:array)
		{
			System.out.println(i+ " ");
			
		}
		int max = array[0];
	     for(int i=0; i<array.length; i++)
	     {
	       if(max > array[i])
	       {
	          max = array[i];
	       }
	     }
	     System.out.println("smallest Amoung in this is :");
	     System.out.print(max); 
	}
}

