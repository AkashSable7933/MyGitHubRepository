package assignments;
import java.util.*;
public class printarray 
{
	public static void main(String args[])
	{
		int a[]= { 1,2,3,4,5,6};
		for(int i:a)
		{
			System.out.print(i+ "  ");
		}
		Arrays.sort(a);
		 
        // Printing the elements
        System.out.println(Arrays.toString(a));
	}
}
