package methods;

public class Sample02 {

	static void calling() {
		System.out.println("you are calling to 123456");
		System.out.println("Phone is ringing.....");
	}
	public static void main(String[] args) {
		System.out.println("Program started");
		calling();
		System.out.println("******************Tell me about yourself?************");
		Sample02.calling();
		System.out.println("##############I am Software tester####################");
		calling();
		System.out.println("Program ends");
	}
}
/*
any variable or method declared with static keyword known as static member
static members are also known as class member because they are loaded in the memory at the time compilation 
when .class file is getting generated

Access:
	1. we can access any static member from another static method directly
	2. we can also use classname to access them
They will have a single memory allocation or one time memory allocation
*/