package loops;

public class nestedifelse {

	public static void main(String[] args) {
		System.out.println("******ex of nested if else prog*****\n");
		int age=20;
		char bg='B';
		boolean coronostatus=true;
		if(age>=18) 
		{
			if(!coronostatus)
			{
				if(bg=='B') 
				{
					System.out.println("you are elligible to donate blood");
				}
				else
				{
					System.out.println("you are not elligible to donate blood");
				}
			}else 
				{
					System.out.println("you are not elligible to donate blood due to corona");
				}
		}else
				{
					System.out.println("you are not elligible to donate due to age");

				}
			}
		
	}

