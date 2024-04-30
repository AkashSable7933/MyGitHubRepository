package assignments;

public class negativefactors {

	public static void main(String[] args) {

	    // positive number
	    int number = 60;

	    System.out.print("Factors of " + number + " are: ");

	    // loop runs from 1 to 60
	    for (int i = number; i >= number;i++) {

	      // if number is divided by i
	      // i is the factor
	      if ( i == 0) 
	      {
	        System.out.print(i + " ");
	      }
	      else if(number%i==0)
	      {
	    	  	System.out.println(i+ "");
	      }
	    }
	  }
	}