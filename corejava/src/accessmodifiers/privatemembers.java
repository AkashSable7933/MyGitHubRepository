package accessmodifiers;

public class privatemembers 
{

	private int accNum=12345;
	private void displayAccNum() 
	{
		System.out.println("Account Number: "+accNum);
	}
	
	public static void main(String[] args)
	{
		
		privatemembers p1=new privatemembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
		privatemembers p1=new privatemembers();
		System.out.println(p1.accNum);// private member cannot be access outside the class
		p1.displayAccNum(); // private method cannot be access outside the class
	}
}
/**
 * private member are accessible with in class only
 */
