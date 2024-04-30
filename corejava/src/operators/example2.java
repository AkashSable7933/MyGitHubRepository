package operators;

public class example2 {

	public static void main(String[] args) {
		int num1=10,num2=20;
		boolean res1=(num1<num2);
		boolean res2=(num1!=num2);
		boolean res3=(res1 && res2);
		System.out.println("result1 (num1<num2):"+res1);
		System.out.println("result2 (num1!=num2):"+res2);
		System.out.println("result3:"+res3);
		
		System.out.println("comparision using '&&' operator:"+ ((num1>num2) && (num1!=num2)));
		System.out.println("result1 (num1<num2):"+res1);
		
		System.out.println("comparision using '||' operator:"+ ((num1>num2) || (num1!=num2)));
		System.out.println("result1 (num1<num2):"+res1);

		
	}

}
