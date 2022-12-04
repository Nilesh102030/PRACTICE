package nonstaticmethod;

public class NONSTATICMETHOD {
    
	void demo()  {  // we have created non static method (static word not present in non-static)
	
	                    System.out.println("hi non-static method");
                                                      }
    public static void main(String[] args) {
		            // to call sop of demo we have to create Ref & Obj for demo
    	
    	NONSTATICMETHOD REF=new NONSTATICMETHOD(); // [classname + ref=new classname() ]
	                    REF.demo(); // given REF variable to demo()
    	
	                    System.out.println("by non-static method");
    	
    
    }    
}
