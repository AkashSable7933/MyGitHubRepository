package operators;

public class prepost {

	public static void main(String[] args) {
		System.out.println("prog starts....");

		int num1=25,num2,num3;
		System.out.println("num1:"+num1);
		num2=num1 + ++num1 + num1++ +  ++num1;
			//25    1+25=26  26        1+27=28   
			//25    1+=26  26+1=27   1+27=28
		
		System.out.println("num2:"+num2);
		System.out.println("num1:"+num1);
		System.out.println("********************");
		
		num3=num1++ + ++num1 + num1 + ++num1 + num1++;
			//28      1+29=30  30     1+30=31  31 
			//28+1=29 30       30     31       31+1=32
		System.out.println("num3:"+num3);
		System.out.println("num1:"+num1);
		System.out.println("********************");

		int x=20,y;
		y=x++ +   --x    +    --x     +  x-- +     ++x       + x++;
		 //20   1-21=20     1-20=19      19        1+18+19     19
		// 21   20          19           19-1=18   19          19+1=20
		System.out.println("y:"+y);//116
		System.out.println("x:"+x);//


	}

}
