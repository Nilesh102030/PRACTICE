package staticmethod;

public class staticinnonstatic {

	static void display() {
	System.out.println("staticmethod");
	 //  show();  we cannot use non static in static 
	}
    public void show() {  // static in non static we can do
    System.out.println("non static method ");
    display();
    
    }
    public static void main(String[] args) {
    	staticinnonstatic f=new staticinnonstatic();
	    f.show();
        
    }
}
    
