package assignments;

public class revwhile {

	public static void main(String[] args) {
		int num=345,rev=0,rem;
		System.out.println("Given number is : "+num);
		while(num!=0)
		{
			rem=num%10;//345%10=5          34%10=4       
			rev=rev*10+rem;//0*10+5=15     0*10+3=13
			num=num/10; //345/10=34        34/10=3     
		}
		System.out.println("Reverse number: "+rev);


	}

}
