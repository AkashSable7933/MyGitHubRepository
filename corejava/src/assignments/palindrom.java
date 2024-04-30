package assignments;

public class palindrom 
{
	public static void main(String[] args) 
	{
		int num=123,rev=0,rem,temp;
		temp=num;//cloning original number for later comparison
		System.out.println("Given number is : "+num);
		for(;num!=0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number: "+rev);
		if(rev==temp) 
		{
			System.out.println("Given number is panlindrome");
		}
		else 
		{
			System.out.println("Given number is not a panlindrome");
		}
	}

}
