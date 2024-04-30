package accessmodifiers;

public class AccessDefaultMembers11
{

	public static void main(String[] args)
	{
		
		AccessDefaultMembers11 p1=new AccessDefaultMembers11();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
