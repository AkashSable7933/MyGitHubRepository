package staticgv;

public class sgv {
	int num1,num2;
	
	public static void main(String[] args) {
		
		System.out.println("prog starts");
		
		
		sgv ref;
		ref=new sgv();
		System.out.println("NSGV num1:" +ref.num1);
		System.out.println("NSGV num2:" +ref.num2);
		
		ref.num1=25;
		ref.num2=50;
		System.out.println("Updated NSGV num1:" +ref.num1);
		System.out.println("Updated NSGV num2:" +ref.num2);
		
		System.out.println("2nd object:" );
		sgv ref2=new sgv();
		System.out.println("using ref2 NSGV num1:" +ref2.num1);
		System.out.println("usinmg ref2 NSGV num2:" +ref2.num1);
		System.out.println("prog ends");
		
		}
		
}

