package variable;

public class example3 {
 static int num1,num2;
	public static void main(String[] args) {
		System.out.println("Prog starts...");
		System.out.println("SGV1:"+example3.num1);
		System.out.println("SGV2:"+num2);
		//initialize
		
		num1=10;
		example3.num2=20;
		System.out.println("updated SGV1:"+num1);
		System.out.println("updated SGV2:"+example3.num2);
		int sum=example3.num1+example3.num2;
		System.out.println("local variable sum:"+sum);
		System.out.println("prog ends....");
		
		
		
		
	}

}
