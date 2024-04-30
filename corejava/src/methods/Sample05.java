package methods;

public class Sample05 {

	public static void main(String[] args) {
		System.out.println("Are you eligible for FB account creation? ");
		checkAge(17);//method will be executed but its return value won;t be printed
		
		//method will be executed and also its return value will be printed in the console
		System.out.println("Are you eligible for FB account creation? "+checkAge(17));
		
		//method will be executed and its return value can be stored in the variable for future use
		boolean ageCheckResult=checkAge(20);
		System.out.println("Age check result is "+ageCheckResult);
	}
	
	static boolean checkAge(int age) {
		boolean res;
		if(age>18) {
			System.out.println("Hi,I am above 18 yrs");
			res=true;
		}else {
			System.out.println("Hi,I am below 18 yrs");
			res=false;
		}
		return res;
	}
}
/*
 if method as return type dn that can we called in following ways-	
 	we can directly call the method
 	we can directly call the method from println()
 */
