package assignments;

public class whilearmstrong {

	public static void main(String[] args) {
		int num=153,sum=0,rem=0,temp=0;
		temp=num;
		while(num!=0)
		{
			rem=num%10;            //153%10=3        15%10=5                 1%10=0.1
			sum=sum+(rem*rem*rem); //0+(3*3*3)=27     27+5*5*5=125+27=152    153
			num=num/=10;           //153/10=15        15/10=1                 0
		}
		if(sum==temp)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not  armstrong");
		}
	}

}
