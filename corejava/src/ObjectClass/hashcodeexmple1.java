package ObjectClass;

class TestSample
{
	void callMe() 
	{
		System.out.println("Hello");
	}
}
public class hashcodeexmple1 extends TestSample
{

	static int last_roll = 100;
	int roll_no;
	// Constructor
	hashcodeexmple1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	public int hashCode() 
	{
		return 505;
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	// Driver code
	public static void main(String args[]) 
	{
		hashcodeexmple1 s = new hashcodeexmple1();
		// Below two statements are equivalent
		System.out.println(s.hashCode());
		System.out.println(s);
		 TestSample t1=new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());
	}
}

