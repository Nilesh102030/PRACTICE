package collections;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
	    LinkedList<String> Name = new LinkedList<String>();
	    Name.add("Ankit");
	    Name.add("Ankush");
	    System.out.println(Name);
		
	    Name.addFirst("Rohit");
	    Name.addLast("Swapnil");
	    System.out.println(Name);
	  
	    Name.remove();
	    System.out.println(Name);
	
	    Name.clear();
	    System.out.println(Name);
	
	
	}
	}

