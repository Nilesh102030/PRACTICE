package nonstaticmethod;

public class scanner {

	void show() { // Non-static method
		System.out.println("hi world");
	}
	    public static void main(String[] args) {
			scanner demo=new scanner () ; // we have to create ref 9996 
	
			demo.show();
	System.out.println("Non static");
	
	    }
	
	
	
	
}
