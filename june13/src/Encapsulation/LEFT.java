package Encapsulation;

public class LEFT {
    private int a=1;
	static private int b=2;
	public static void display (int c)  {
	//b=c;    //  to hide superclass data variable
	c=b;  // to hide subclass data variable
	System.out.println(b);
	}
	
	}
    
	
	
	
	
	
	
	
	

