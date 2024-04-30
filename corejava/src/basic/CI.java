
package basic;

public class CI {

	public static void main(String[] args) {
		double p,n;
		double CI,r;
		p=500;
		r=5;
		n=2;
		 CI=p*(Math.pow((1+r/100),n));
		System.out.println("CI="+CI);

	}

}

