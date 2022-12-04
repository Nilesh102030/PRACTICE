package collections;
import java.util.ArrayDeque;
public class Arraydeque {
	public static void main(String[] args)   {
		  ArrayDeque<String> Name = new ArrayDeque<String>();
		    Name.addFirst("Ankit");
		    Name.addLast("Ankush");
		    Name.addFirst("Aakash");
		    System.out.println(Name);
			Name.offerFirst("Nilesh");
			Name.offerLast("Hembade");
		    System.out.println(Name);
		    System.out.println(Name.peekFirst());// returns null if empty
		    System.out.println(Name.peekLast());//returns null if empty
		    System.out.println(Name.getFirst());//gives exception if empty
            System.out.println(Name.getLast());//gives exception if empt
            System.out.println(Name.pollFirst());// removes first N returns last
            System.out.println(Name);
            System.out.println(Name.pollLast());  // returns first N removes last
            System.out.println(Name);
            System.out.println(Name.removeFirst());// removes first N returns last
            System.out.println(Name);
            System.out.println(Name.removeLast());// returns first N removes last
            System.out.println(Name);
	
	}
}
