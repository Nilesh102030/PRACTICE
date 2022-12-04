package collections;

import java.util.ArrayList;

public class Arraylist {

public static void main(String[] args) {
	ArrayList<String> name = new ArrayList<String>();
    name.add("Ankit");
    name.add("Ankush");
    name.add("Aakash");
    System.out.println(name);

    name.add("Atif");
    System.out.println(name);

    name.set(0,"Anish");
    System.out.println(name);
    name.remove(0);
    System.out.println(name);

    name.clear();
    System.out.println(name);



}
	
}
