package assignments;
import java.util.*;

public class copyarray1 
{
	public static void main(String args[]) 
	{
		int array[] = { 4433, 3344, 1414, 5555 };
		System.out.println("Printing original array:");
		for (int i : array) 
		{
			System.out.print(i+ " ");
		}
		int newCopiedArray[]=Arrays.copyOf(array, array.length);//
		System.out.println("\nPrinting Copie Array:");
		for (int i : newCopiedArray)
		{
			System.out.print(i+ " ");
		}
	}
	
}
