package variable;

public class example5 {
	int num1=40,num2=80;
	static double res;
	public static void main(String[] args) {
		System.out.println("Prog Starts...");
		int result;
		example5 e1=new example5();
		result=e1.num1+e1.num2;
		System.out.println("NSGV num1 with e1 ref:"+e1.num1);
		System.out.println("NSGV num2 with e1 ref:"+e1.num2);
		System.out.println("add of local var:"+result);
		res=e1.num2/e1.num1;
		System.out.println("Division:"+res);
		System.out.println("prog ends...");



		
	}

}
