package TestPackage1;

public class stringmethods1 {
public static void main(String[] args) {
	String a="NiLesH"; 
    String b="Hembade";  //String b=null;
    String c="   Nilsh  Hembade   ";
    System.out.println(a.toUpperCase()); // TO UPPERCASE =   NILESH
	System.out.println(a.toLowerCase());  // TO LOWERCASE =  nilesh
	System.out.println(a.length());
    System.out.println(a.charAt(0));
	System.out.println(b.isBlank());  // space is allowed not char allowed
	System.out.println(b.isEmpty());  
	System.out.println(b.length());
	System.out.println(c.trim()); // to trim/remove spaces of leading n trailing space not middle spaces
	
	
	
	
	
}	
}
