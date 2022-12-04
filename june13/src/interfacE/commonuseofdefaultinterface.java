package interfacE;

public class commonuseofdefaultinterface implements defaulT {
	 public  void Dmart() { 
			
	      System.out.println("shopping3");
	    }
	 public void decathlon()  {   // incomplete method is completed of interface
			System.out.println("decathB");
		    }
	
	public static void main(String[] args) {
		defaultinterface x=new defaultinterface();
		commonuseofdefaultinterface y=new commonuseofdefaultinterface();
		
		x.decathlon();
	    x.Dmart();
	 
	    y.decathlon();
	    y.Dmart();
	}
	
	
	
}
