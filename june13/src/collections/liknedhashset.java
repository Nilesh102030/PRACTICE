package collections;

import java.util.LinkedHashSet;

public class liknedhashset {
public static void main(String[] args) {
	LinkedHashSet<String> name=new LinkedHashSet<String>();
	 name.add("alpha");
     name.add("beta");
     name.add("gamma");
     name.add("alpha");// duplicates are not allowed
	 name.add(null);   // one null value permits
     
     System.out.println(name); // order of insertion follow
     System.out.println(name.contains("beta"));
    
  
	
	
	
}
}
