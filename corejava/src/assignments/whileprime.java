package assignments;

public class whileprime {

	public static void main(String[] args) {
		int num=23,count=0,i=1;
		System.out.println("Given no is:"+num);
		
		while(num%i==0)
		{
			
				count++;
			
		}
	
		if(count==2)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
	}
	

}
