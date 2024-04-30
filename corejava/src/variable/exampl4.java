package variable;

public class exampl4 {
int num1,num2;
	public static void main(String[] args) {
		System.out.println("prog starts...");
		exampl4 ref;
		
		ref=new exampl4();
		System.out.println("NSGV1:"+ref.num1);
		System.out.println("NSGV1:"+ref.num2);
		
		ref.num1=10;
		ref.num2=40;
		System.out.println("updated SGV1:"+ref.num1);
		System.out.println("updated SGV2:"+ref.num2);
		
		exampl4 ref2=new exampl4();
		System.out.println("SGV1:"+ref2.num1);
		System.out.println("SGV2:"+ref2.num2);
		System.out.println("prog ends");
		
		
		
		
		
		
	}

}
