package assignments;
import java.util.Arrays;
import java.util.Collections;

public class arraysortdescending 
{
	public static void main(String args[])
	{
		int a[]= { 21,48,75,2,10,32};
		Arrays.sort(a, Collections.reverseOrder());
		for(int i:a)
		{
			System.out.println(i+ "");
			
		}
	}

}
