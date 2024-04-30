package assignments;

public class swapno {

	public static void main(String[] args) {
		int n1=100,n2=200,n3;
		System.out.println("before swap num1:"+n1);
		System.out.println("before swap num2:"+n2);
		n3=n1; //num3=100
		
		n1=n2; //200
		n2=n3; //100
		
		n3=n2; //200
		System.out.println("after swap num1:"+n1);
		System.out.println("after swap num2:"+n2);
		
	}

}
