package accessmodifier;

public class classB {

	public static void main(String[] args) {
		classA  X=new classA();

		System.out.println(X.a);
	//System.out.println(X.b);  private access modifier will not access in diffrent class
		 System.out.println(X.c);
	     System.out.println(X.d);
	 
	
	
	
	}
}
