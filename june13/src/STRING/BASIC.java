package STRING;

public class BASIC {
  public static void main(String[] args) {
	
  
	String a="Velocity";
    String b="Velocity";
	
	String c=new String("Velocity");
	String d=new String("Velocity");
	
	System.out.println(a==b); // object is same for two variables (a & b) constant area=true
	System.out.println(c==d); // two object are created for two variables (c & d) non constant area=false
	System.out.println(a==d); // a is in constant and d is in non constant =false
	
	System.out.println("*************");
	
	b="class";
	System.out.println(b);  // true
	System.out.println(a);  // velocity
	System.out.println(a==b); //  class==velocity=false
	
	
	
  }	
}
