package assignments;

public class arrayreverese 
{
	public static void main(String Args[])
	{
		int a[]= { 1,2,3,4,5,6};
		for(int i:a)
		{
			System.out.println(i+ "");
		}
		System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = a.length-1; i >= 0; i--) 
        {  
            System.out.print(a[i] + " ");  
        }
	}
}
