package assignments;
import java.util.Iterator;
import java.util.TreeSet;

public class addelementinset 
{
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("TreeSet elements are: "+al);
		
	}

}
