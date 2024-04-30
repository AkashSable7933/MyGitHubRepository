package assignments;

public class whilecountnoofdigit {

	public static void main(String[] args) {
		int num=1000123,count=0;
		while(num!=0)
		{
			num=num/=10;
			count++;
		}
		System.out.println("nnumber of digit:"+count);
	}

}
