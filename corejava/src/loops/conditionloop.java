package loops;

public class conditionloop {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) 
		{
			System.out.println("****17 feb*****");
			System.out.println("gm");
			System.out.println("automation batch");
			System.out.println("core java");
			
		}
		
		System.out.println("****print even no 1 to 20*****");
		for(int i=1;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println("no is even"+i);
			}

		}
					
		System.out.println("****PRINT VOWEL****");
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch=='A' || ch=='E' || ch=='I' ||  ch=='O' || ch=='U')
			{
				System.out.println("character is vowel"+ch);
			}
		}
		System.out.println("****print ch from a to g******");
		for(char ch='a';ch<='g';ch++) 
		{
			System.out.println("ch:"+ch);
		}
		System.out.println("****print consonent bet a to z****");
		for(char ch='A';ch<='Z';ch++)
		{
			if((ch!='A') && (ch!='E') && (ch!='O') && (ch!='I') && (ch!='U'))
			{
				System.out.println("consonent is:"+ch);
			}
		}
	}

}
