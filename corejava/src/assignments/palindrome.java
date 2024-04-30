
package assignments;

public class palindrome {

	public static void main(String[] args)
	{
		String org="varun";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);//n // u //r //a //v
		}	
		System.out.println(rev);
		if(org.equals(rev))
		{
			System.out.println("String is palindrome.");
		}
		else
		{
			System.out.println("String is not palindrome.");
		}

	}

}
