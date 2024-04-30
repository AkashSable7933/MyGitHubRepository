package constructor;

public class defaultconstruct3
{

	int age;
	double salary;
	/**
	 *  below is default constructor, that will be written by java compiler at compile time
	  Cons2(){
			//empty body
		}
	*/
	static public void main(String[] args) {

		defaultconstruct3 c1 = new defaultconstruct3();
		System.out.println(c1.age);// 0
		System.out.println(c1.salary);// 0.0
	}
}