package accessmodifiers;

public class AccessPrivateMembers
{

	public static void main(String[] args)
	{
		
		AccessPrivateMembers p1=new AccessPrivateMembers();
		System.out.println(p1.accNum);//private member cannot access outside the class 
		p1.displayAccNum();
	}

}
