package nonstaticmethod;

public class methodswithparameters {

	 static void addition(int a,int b) { // we didnt declare a & b so we can change output
	     int c=a+b;
		System.out.println("additiona"+c);
	                            }
   
	     void multiplication(int a,int b) {
		    	int c=a*b;
				System.out.println("multiplication="+c);
				}
	 
	public static void main(String[] args) {
		
    	  System.out.println("main method started");
    	      addition(10,10);
    	      methodswithparameters REF=new methodswithparameters();
               REF.multiplication(10,10);
    
    }
	
	}
	



