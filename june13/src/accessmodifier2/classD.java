package accessmodifier2;
import accessmodifier.classA;
public class classD extends classA{

   public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTED");
	      classD X=new classD();
		
	         System.out.println(X.a);
			// System.out.println(X.b);
			 System.out.println(X.c); // WITH USING INHERITANCE (EXTENDS)WE CAN ACCESS PROTECRED MOD
		    // System.out.println(X.d);
		 
	}
}
