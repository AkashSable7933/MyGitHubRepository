package constructor;

public class paraconstructor
{
	int roll;
	double salary;
	paraconstructor(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		paraconstructor c1 = new paraconstructor(101,250045.45);
		c1.display();//
		paraconstructor c2 = new paraconstructor(201,550045.45);		
		c2.display();//
		paraconstructor c3 = new paraconstructor(0,1502.56);		
		c3.display();//
	}
}
/**
parameterized constructor: 
is used to initialize different values for non-static variable at the time of object creation

*/