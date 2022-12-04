package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue {
public static void main(String[] args) {
	
//	 PriorityQueue<Integer> Name = new PriorityQueue<Integer>();
//	     Name.add(10);
//	     Name.add(20);
//	     Name.add(7);
//	     System.out.println(Name);  // 7 will print first because its small
//	     Name.poll();
//	     System.out.println(Name);  // 7 will remove because it came first due to priority
	
	
PriorityQueue<Integer> Name = new PriorityQueue<Integer>(Comparator.reverseOrder());
//use comparator to give priority to big number
Name.add(10);
Name.add(20);
Name.add(7);
System.out.println(Name);  // 7 will print first because its small
Name.poll();
System.out.println(Name);
	
}
}
