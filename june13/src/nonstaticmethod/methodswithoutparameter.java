package nonstaticmethod;

public class methodswithoutparameter {
	  void multiplication(int a,int b) {
			int c=a*b;
				System.out.println("multiplication"+c);
			}
		    public static void main(String[] args) {
		    	methodswithoutparameter ref=new methodswithoutparameter();
		    	System.out.println("main method started");
		    	ref.multiplication(10,10);

		    
		    }
			
}
