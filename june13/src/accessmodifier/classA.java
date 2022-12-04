package accessmodifier;

public class classA {
    
	public int a=1;
	 private int b=2;
	 protected int c=3;
	 int d=4;
	 
	 public static void main(String[] args) {
		classA X=new classA();
		System.out.println("main method started");
		
		System.out.println(X.a);
		 System.out.println(X.b);
		 System.out.println(X.c);
	     System.out.println(X.d);
	 
	 }
	 
}
