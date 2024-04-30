package assignments;
import java.util.PriorityQueue;
import java.util.Queue;

public class addelementsinqueue 
{
	public static void main(String args[]) 
	{
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(1);
		System.out.println("Size: " + queue.size());
		System.out.println("Eleements of Queue: " + queue);
		 
	}

}
