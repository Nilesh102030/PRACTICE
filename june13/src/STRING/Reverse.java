package STRING;

public class Reverse {
 public static void main(String[] args) {
	  String a="Velocity";
	  String rev="";
	 
	 for (int i=a.length()-1;i>=0;)  {
	 
	 rev= rev+ a.charAt(i); }
	 
	 System.out.println(rev);
	
	 
}
}
