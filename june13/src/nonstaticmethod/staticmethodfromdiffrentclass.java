package nonstaticmethod;

public class staticmethodfromdiffrentclass {
	
	       static void demo() { // we have create static method demo()
		       System.out.println("HI STATIC");
	       }
	    	   public static void main(String[] args) {
				// in static we dont need to create Ref&object ( class name-ref name=new-class name)
	    		// in static=class name is REF   
	    		   staticmethod.demo(); // we can call diffrent method from diffrent class by using that class name
			       System.out.println("BY STATIC");
	    	   
	    	   }

}