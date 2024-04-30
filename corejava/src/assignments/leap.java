package assignments;

public class leap {

	public static void main(String[] args) 
	{
		int year=2013;//(year%4==0 && year%100!=0) || (year%400==0)
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println("Given number is leap year: "+year);
		}
		else 
		{
			System.out.println("GIven number is not a leap year: "+year);
		}

	}
}
