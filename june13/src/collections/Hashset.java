package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
public static void main(String[] args) {
	
	HashSet<String> name=new HashSet<String>();
     name.add("alpha");
     name.add("beta");
     name.add("gamma");
     name.add("alpha");// duplicates are not allowed
	 name.add(null);   // one null value permits
     
     System.out.println(name); // order of not follow
     System.out.println(name.contains("beta"));
    
     for (String e : name) {  // for each loop
     
     System.out.println(e);
     
     
     
     
}
}
}