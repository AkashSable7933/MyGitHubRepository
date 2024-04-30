package operators;

public class prepostinc {

	public static void main(String[] args) {
		System.out.println("Prog starts...");
		int num1=20,num2;
		num2=num1; //20
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		System.out.println("********************");

		
		int num3=++num1;//1+20=21
		num3=num1++;//20+1=21
		System.out.println("\n\tNum3:"+num3);
		System.out.println("\n\tNum1:"+num1);//num1=num3=21+1=22
		System.out.println("********************");


		int y=10,x;
		x=y++;// 
		System.out.println("y:"+y);
		System.out.println("x:"+x);
		System.out.println("********************");

		int a=10,b,c;
		b=++a;//1+10=11
		c=a++;//10+1=11
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("a:"+a);//a=c 11+a=12
		System.out.println("********************");

		int n1=5,n2,n3;
		n2=--n1; //1-5=4
		n3=n1--;//5-1=4 
		System.out.println("n2:"+n2);
		System.out.println("n3:"+n3);
		System.out.println("n1:"+n1);//n3=n1=4-1=3
		System.out.println("********************");



		



}

}
