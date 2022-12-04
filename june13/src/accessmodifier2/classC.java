package accessmodifier2; // NEW PACKAGE(2)
import accessmodifier.classA;
public class classC  {
public static void main(String[] args) {
	classA X=new classA();
	System.out.println("MAIN METHOD STARTED");

	System.out.println(X.a);
	//System.out.println(X.b);  private acees modifier not accessible
	// System.out.println(X.c); // without inheritance(extends) we cant use protected access modifier
    //  System.out.println(X.d); // default not accessible in other package
 
	
}
}
