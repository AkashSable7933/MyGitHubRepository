package assignments;

import java.util.Arrays;

public class arraysort 
{
	public static void main(String args[])
	{
		int a[]= { 11,2,3,14,5,16};
		for(int i:a)
		{
			
			System.out.println(i + " ");
			
		}
		Arrays.sort(a);
		for(int c: a) 
		{
			System.out.print(c +"  ");
		}
	}

}
