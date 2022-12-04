package abstractconcret;

public class concreteclass extends abstracta {

	public void whatsapp() {
	  System.out.println("method whatsapp completed in concret class");
	}
	   public static void main(String[] args) {
		
		   concreteclass x=new concreteclass();
		   x.facebook();
	       x.whatsapp();
	   
	   }
	
	
}
