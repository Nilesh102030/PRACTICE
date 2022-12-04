package collections;

import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
	
	TreeSet<Integer> value= new TreeSet<Integer>();
	value.add(10);
	value.add(20);
	value.add(30);
	value.add(40);
	value.add(50);
	value.add(60);
	value.add(70);
	value.add(80);
	value.add(90);
	value.add(100);
	System.out.println(value);
	System.out.println(value.headSet(50));  // <50
	System.out.println(value.tailSet(50));  // >=50
	System.out.println(value.subSet(20, 60)); // 20 to 60
	
	
}
}
