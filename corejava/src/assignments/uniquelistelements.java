package assignments;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import collections.ArrayListExample0;
public class uniquelistelements
{
	public static void main(String args[]) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1235);// first boxing for int to Integer class object---> upcasting to object class
		list.add(1526);// first boxing for double to Double class object---> upcasting to object class
		list.add(1235);
		list.add(1332);
		System.out.println("size of Arraylist: " + list.size());
		System.out.println("Elements of Arraylist: " + list);//toString overrided in Collection
		
		HashSet<Integer> hset = new HashSet<Integer>(list); 
		System.out.println("ArrayList Unique Values is : "+ hset); 
	}
}

