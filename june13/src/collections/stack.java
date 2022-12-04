package collections;

import java.util.Stack;

public class stack {
	public static void main(String[] args)   {
		 
		   Stack<String> Name = new Stack<String>();
		    Name.push("Ankit");
		    Name.push("Ankush");
		    Name.push("Aakash");
		    System.out.println(Name);
			
		    Name.pop();
		    System.out.println(Name);
}
}