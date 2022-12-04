package globallocalvariable;

public class this1 extends thissuper{
   int a=100;  // global variable (IN SAME CLASS)
	public void demo() {
	int a=50;  // local variable
	System.out.println(a);
     System.out.println(this.a);// global variable from same class 
     System.out.println(super.a);// global variable from superclass
	}
	public static void main(String[] args) {
		this1 x=new this1();
        x.demo();
	
	}



}



