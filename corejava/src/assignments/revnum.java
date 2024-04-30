package assignments;

public class revnum 
{

		public static void main(String[] args)
		{
		int num=123,rev=0,rem;
		System.out.println("Given number is : "+num);
			for(;num!=0;)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
		System.out.println("Reverse number: "+rev);
		}

}