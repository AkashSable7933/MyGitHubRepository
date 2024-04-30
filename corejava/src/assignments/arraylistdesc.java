package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistdesc 
{
	public static void main(String args[]) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1235);// first boxing for int to Integer class object---> upcasting to object class
		list.add(1526);// first boxing for double to Double class object---> upcasting to object class
		list.add(1435);
		list.add(1332);
		System.out.println("size of Arraylist: " + list.size());
		System.out.println("Elements of Arraylist: " + list);//toString overrided in Collection
		Collections.sort(list);
		System.out.println("ascending List: " + list);
		Collections.reverse(list);
		System.out.println("desceding List: " + list);
		
		
	}
}

