package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer, String> pair = new HashMap<Integer,String>(); // insertion order does not maintain
	pair.put(100,"Nilesh");
	pair.put(300, "Gaurav");
	pair.put(200,"Abhishek");
	
	LinkedHashMap<Integer, String> pairr = new LinkedHashMap<Integer,String>();// insertion order maintain
	pairr.put(100,"Nilesh");
	pairr.put(300, "Gaurav");
	pairr.put(200,"Abhishek");
	
	TreeMap<Integer, String> pairrr = new TreeMap<Integer,String>();// insertion order keys  maintain in Ascending
	pairrr.put(100,"Nilesh");
	pairrr.put(300, "Gaurav");
	pairrr.put(200,"Abhishek");
	
	System.out.println(pair);
	System.out.println(pairr);
	System.out.println(pairrr);
	
}
}
